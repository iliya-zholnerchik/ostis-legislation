package ostis.legislation.agent

import net.ostis.jesc.agent.ScAgent
import net.ostis.jesc.client.ScClient
import net.ostis.jesc.client.model.response.ScEvent
import net.ostis.jesc.client.model.type.ScType

class FirstLetterSearchAgent(event: Long, client: ScClient): ScAgent(setOf(event), client) {

    init {
        println("First letter search agent started.")
    }

    private val questionAddr = context.resolveBySystemIdentifier(
            "qustion_jesc_search_by_first_letter",
            ScType.NODE_CLASS
    )

    override fun onTrigger(event: ScEvent) {

    }

}