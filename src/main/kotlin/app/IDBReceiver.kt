package app

interface IDBReceiver {
    fun applyMigrations()
    fun rollbackMigrations()
}