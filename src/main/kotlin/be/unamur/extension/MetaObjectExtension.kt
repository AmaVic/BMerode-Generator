package be.unamur.extension

import be.unamur.metamodel.Metaobject
import be.unamur.metamodel.extension.MerodeExtension

object MetaObjectExtension {
    fun isParticipant(metaObject: Metaobject, extension: MerodeExtension): Boolean {
        return extension.participantTypes.participantType.contains(metaObject.id)
    }
}