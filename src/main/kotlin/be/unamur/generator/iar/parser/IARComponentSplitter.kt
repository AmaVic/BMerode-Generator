package be.unamur.generator.iar.parser

import domain.IARPathElement

class IARComponentSplitter {
    companion object {
        fun getPathElements(pathString: String): List<IARPathElement> {
            val pathElements = mutableListOf<IARPathElement>()
            val elementStrings = pathString.split(".")

            elementStrings.forEach {
                pathElements.add(IARPathElement(it))
            }

            return pathElements
        }
    }
}