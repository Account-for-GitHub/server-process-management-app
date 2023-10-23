package app

class TaskBlock(private val tasksToExecuteAsASingleBlock: List<ITask>) : ITask {
    override fun execute() {
        line()
        println("Block of tasks execution:")
        tasksToExecuteAsASingleBlock.forEach { it.execute() }
        line()
    }

    override fun undo() {
        line()
        println("Block of tasks rollback:")
        tasksToExecuteAsASingleBlock.forEach { it.undo() }
        line()
    }
}