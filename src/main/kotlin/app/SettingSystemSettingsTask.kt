package app

class SettingSystemSettingsTask(private val systemSettingsManager: ISystemSettingsReceiver) : ITask {
    override fun execute() = systemSettingsManager.setSystemSettings()
    override fun undo() = systemSettingsManager.revertSystemSettings()
}