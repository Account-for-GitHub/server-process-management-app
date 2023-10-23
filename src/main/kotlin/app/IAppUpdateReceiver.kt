package app

interface IAppUpdateReceiver {
    fun appUpdate()
    fun rollbackAppUpdate()
}