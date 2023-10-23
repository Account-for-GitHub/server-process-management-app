package app

class AppUpdateManager : IAppUpdateReceiver {
    override fun appUpdate() = println("downloading and installing application update")
    override fun rollbackAppUpdate() = println("application update installation failed, rollback to previous application version")
}