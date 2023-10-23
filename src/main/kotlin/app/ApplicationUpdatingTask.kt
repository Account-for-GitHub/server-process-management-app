package app

class ApplicationUpdatingTask(private val appUpdateManager: IAppUpdateReceiver) : ITask {
    override fun execute() = appUpdateManager.appUpdate()
    override fun undo() = appUpdateManager.rollbackAppUpdate()
}