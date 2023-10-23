package app

class DBManager : IDBReceiver {
    override fun applyMigrations() = println("applying database migrations")
    override fun rollbackMigrations() = println("rollback database migrations")
}