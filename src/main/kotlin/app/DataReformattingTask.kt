package app

class DataReformattingTask(private val dataFormatter: IDataFormattingReceiver) : ITask {
    override fun execute() = dataFormatter.reformatDataToFormat1()
    override fun undo() = dataFormatter.reformatDataToFormat2()
}