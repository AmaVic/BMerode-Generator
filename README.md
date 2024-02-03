# Overview
This tool enables automated generation of Hyperledger Fabric chaincode based on BMerode models.
BMerode is an extension and adaptation of the [Merode](http://merode.econ.kuleuven.ac.be/) approach for the design and implementation of enterprise information systems.

# Usage
1. Download `BMerode-Generator.zip` from the latest [release](https://github.com/AmaVic/BMerode-Generator/releases/tag/v0.5-dev).
2. Unzip the file, open a terminal and get into the `bin` subdirectory.
3. Run the following command to generate the chaincode:
```bash
./BMerode-Generator -m path_to_mxp_file -e path_to_extension_file -o path_to_destination_directory
```

## MXP File
The `path_to_mxp_file` is the (relative or absolute) path to the Merode model (.mxp file).

To design a Merode model, the [Merlin tool](https://www.merlin-academic.com) can be used. When exporting a model from Merlin, the file available
for download is a .mxp file, which is actually a .zip archive. Before being able to run the code generator, follow the following steps:

1. Change the extension of the exported file from .mxp to .zip.
2. Unzip the file.
3. In the unzipped folder, there will be a file called `model.mxp`. This is the file that should be used as the `path_to_mxp_file`.
4. Open the file with the text/code editor of your choice, and remove the `masterrole` and `dependentrole` tags in the file.

## Extension File
The `path_to_extension_file` is the (relative or absolute) path to the BMerode extension (.mxpx file). Currently, this file must be written manually. Below is a simple example of extension file:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<MerodeExtension>
    <ParticipantTypes>
        <ParticipantType objectTypeId="1"/>
    </ParticipantTypes>
    <EPT></EPT>
    <IARS></IARS>
</MerodeExtension>
```

This file is **mandatory** for a successful chaincode generation.

The `ParticipantTypes` tag is used specify which business object types (defined in the .mxp file) are representing participant types (or roles) in the process to support with the chaincode.
The `objectTypeId` of the existing business object types can be found in the .mxp file.

The `EPT` and `IARS` tags are used to specify permissions at the participant type and instance level. They are however undocumented as of now and can be left empty.

# License
B-MERODE Code Generator © 2023 by Victor Amaral De Sousa is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/).
