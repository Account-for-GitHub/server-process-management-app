package app

class UpdatingFileContentTask(private val fileManager: IFileReceiver) : ITask {
    override fun execute() = fileManager.updateFile()
    override fun undo() = fileManager.revertFileUpdates()
}