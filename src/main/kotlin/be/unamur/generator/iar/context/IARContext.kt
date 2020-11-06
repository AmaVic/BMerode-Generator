package be.unamur.generator.iar.context

import domain.IARPathElement
import org.apache.velocity.VelocityContext

class IARContext : VelocityContext() {
    init {
        this.put("iars", mutableListOf<IARPathElement>())
    }

    fun addIAR(iar: IARPathElement) {
        val list = this.get("iars") as MutableList<IARPathElement>
        list.add(iar)

        this.put("iars", list)
    }
}