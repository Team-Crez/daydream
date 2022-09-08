package io.github.copecone.daydream.wrapper

import io.github.copecone.daydream.event.CommandExecuteEvent
import org.bukkit.command.CommandSender

abstract class CommandObject {
    var aliases: List<String> = ArrayList()
    var description: String = ""
    var permission: String = ""
    var label: String = ""
    var usage: String = ""

    abstract fun execute(event: CommandExecuteEvent): Boolean
    abstract fun tabComplete(): MutableList<String>?
}