package be.unamur.loader;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import java.io.File;

import be.unamur.loader.exception.ModelParsingException;
import be.unamur.metamodel.Mermaidmodel;


public class ModelParser {
  private static final String METAMODEL_DEFINITION = ModelParser.class.getClassLoader().getResource("be.unamur.metamodel/mxp-schema.xsd").getFile();

  public static Mermaidmodel parseModel(String filePath) throws ModelParsingException {
    System.out.println(">> Parsing Model From File: " + filePath);
    JAXBContext context = null;
    try {
      context = JAXBContext.newInstance(Mermaidmodel.class);
    } catch (JAXBException e) {
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Create Loading Context");
    }

    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    Schema schema = null;
    try {
      schema = factory.newSchema(new StreamSource(new File(METAMODEL_DEFINITION)));
    } catch (SAXException e) {
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
      throw new ModelParsingException("[ModelParser.parseModel(String)]: Could not Load Model based on Model File: " + filePath);
    }

    System.out.println(">> Model Successfully Parsed");
    return model;
  }
}
