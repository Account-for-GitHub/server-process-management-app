import app.*

const val SLEEP_INTERVAL_BETWEEN_TASKS: Long = 300

fun main() {
    var listOfTasks: List<ITask> = List<ITask>(randomNumberOfTasks()) { SoftwareInstallationProcessTask(SoftwareManager()) } +
                List<ITask>(randomNumberOfTasks()) { SettingSystemSettingsTask(SystemSettingsManager()) } +
                List<ITask>(randomNumberOfTasks()) { UpdatingFileContentTask(FileManager()) } +
                List<ITask>(randomNumberOfTasks()) { ApplicationUpdatingTask(AppUpdateManager()) } +
                List<ITask>(randomNumberOfTasks()) { DataReformattingTask(DataFormatter()) } +
                List<ITask>(randomNumberOfTasks()) { DatabaseMigrationTask(DBManager()) }

    listOfTasks = listOfTasks + TaskBlock(
        listOf(
            SettingSystemSettingsTask(SystemSettingsManager()),
            UpdatingFileContentTask(FileManager()),
            ApplicationUpdatingTask(AppUpdateManager()),
            DataReformattingTask(DataFormatter()),
            DatabaseMigrationTask(DBManager())
        )
    )

    listOfTasks = listOfTasks.shuffled()

    val initiator = Initiator()
    initiator.setTasks(listOfTasks)

    line()
    println("Number of server processes scheduled: ${listOfTasks.size}")
    line()
    println("Server processes execution started:")
    println()

    while (!initiator.allTasksProcessed()) {
        if (weShouldRollBack()) {
            initiator.undoExecuted()
        } else {
            initiator.runNext()
        }
        Thread.sleep(SLEEP_INTERVAL_BETWEEN_TASKS)
    }
}