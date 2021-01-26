package domain

import be.unamur.generator.iar.domain.IARPathElementType

data class IARPathElement(val element: String,
                          val type: IARPathElementType = if(element[0] == '$')
                                                            IARPathElementType.BUSINESS_OBJECT
                                                        else if(element.substring(0, 4) == "val:")
                                                            IARPathElementType.VALUE
                                                        else if(element.substring(0, 6) == "sender")
                                                            IARPathElementType.SENDER
                                                        else
                                                            IARPathElementType.ATTRIBUTE
) {
    val nameOnly: String
        get() {
            var toReturn = element
            if(element[0] == '$')
                toReturn = element.substring(1)
            if(element.substring(0, 4) == "val:") {
                val isolatedVal = element.substring(4)
                toReturn = isolatedVal
            }

            return toReturn
        }
}