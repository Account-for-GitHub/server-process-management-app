package app

class SoftwareInstallationProcessTask(private val softwareManager: ISoftwareReceiver) : ITask {
    override fun execute() = softwareManager.softwareInstall()
    override fun undo() = softwareManager.softwareRemove()
}
