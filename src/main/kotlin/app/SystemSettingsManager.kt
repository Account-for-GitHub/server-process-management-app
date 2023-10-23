package app

class SystemSettingsManager : ISystemSettingsReceiver {
    override fun setSystemSettings() = println("setting system settings")
    override fun revertSystemSettings() = println("new system settings check failed, reverting to previous system settings")
}