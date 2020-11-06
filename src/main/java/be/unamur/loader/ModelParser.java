package be.unamur.loader;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import be.unamur.metamodel.Mermaidmodel;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.InputStream;

import be.unamur.loader.exception.ModelParsingException;


public class ModelParser {
  private static final InputStream METAMODEL_DEFINITION = ModelParser.class.getClassLoader().getResourceAsStream("be.unamur.metamodel/mxp_1_6_schema_iar.xsd");

  public static Mermaidmodel parseModel(String filePath) throws ModelParsingException {
    System.out.println(">> Parsing Model From File: " + filePath);
    JAXBContext context = null;
    try {
      context = JAXBContext.newInstance(Mermaidmodel.class);
    } catch (JAXBException e) {
      e.printStackTrace();
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Create Loading Context");
    }

    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    Schema schema = null;
    try {
      schema = factory.newSchema(new StreamSource(METAMODEL_DEFINITION));
    } catch (SAXException e) {
      e.printStackTrace();
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Create Schema Factory");
    }

    Unmarshaller jaxbUnmarshaller = null;
    try {
      jaxbUnmarshaller = context.createUnmarshaller();
    } catch (JAXBException e) {
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Create Unmarshaller");
    }
    jaxbUnmarshaller.setSchema(schema);

    Mermaidmodel model = null;
    try {
      model = (Mermaidmodel) jaxbUnmarshaller.unmarshal(new File(filePath));
    } catch (JAXBException e) {
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Load Model based on Model File: " + filePath + "\n" + e.toString());
    }

    System.out.println(">> Model Successfully Parsed");
    return model;
  }
}
