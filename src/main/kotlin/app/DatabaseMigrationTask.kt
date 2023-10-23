package app

class DatabaseMigrationTask(private val dbManager: IDBReceiver) : ITask {
    override fun execute() = dbManager.applyMigrations()
    override fun undo() = dbManager.rollbackMigrations()
}