package app

class FileManager : IFileReceiver {
    override fun updateFile() = println("updating file content")
    override fun revertFileUpdates() = println("reverting to previous file content")
}