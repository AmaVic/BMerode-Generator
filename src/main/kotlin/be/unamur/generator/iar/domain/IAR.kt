package domain

data class IAR(val rule: String, val allowed: Boolean) {
    val leftHandSide: String
    val rightHandSide: String

    init {
        val trimmedRule = rule.trim()
        val bothSides = rule.split("===")
        this.leftHandSide = bothSides[0].trim()
        this.rightHandSide = bothSides[1].trim()
    }

    companion object {
        fun fromMetamodelIAR(metaIAR: be.unamur.metamodel.Iar): IAR {
            return IAR(metaIAR.rule, metaIAR.isAllowed)
        }
    }
}