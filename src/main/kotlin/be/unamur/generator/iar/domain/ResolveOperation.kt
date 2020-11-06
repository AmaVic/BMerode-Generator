package be.unamur.generator.iar.domain

import be.unamur.generator.context.Util
import domain.IARPathElement

class ResolveOperation(pathElement: IARPathElement) {
    val operationString: String

    init {
        val operationStringBuilder = StringBuilder()

        when(pathElement.type) {
            IARPathElementType.BUSINESS_OBJECT -> {
                val businessObjectTypeName = pathElement.nameOnly
                val attributeName = Util.getStringWithFirstLowerCap(businessObjectTypeName) + "Id"
                operationStringBuilder.append("Fetch Business Object of Type $businessObjectTypeName with Id $attributeName on Current Object and Return the Fetched Object")
            }

            IARPathElementType.ATTRIBUTE -> {
                operationStringBuilder.append("Fetch Value of Attribute ${pathElement.element} on Current Object")
            }

            IARPathElementType.VALUE -> {
                operationStringBuilder.append("Return Value as Such: ${pathElement.nameOnly}")
            }
        }

        this.operationString = operationStringBuilder.toString()
    }
}