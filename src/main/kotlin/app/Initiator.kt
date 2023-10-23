package app

class Initiator {
    private var tasks = listOf<ITask>()
    private var index: Int = 0
    private var justRunned: Int = 0
    private var allTasksProcessed = false

    fun setTasks(taskList: List<ITask>) {
        tasks = taskList
    }

    fun runNext() {
        tasks[index].execute()
        justRunned = index
        index++
        if (index >= tasks.size) {
            index = tasks.lastIndex
            allTasksProcessed = true
        }
    }

    fun undoExecuted() {
        tasks[justRunned].undo()
        var previous = justRunned - 1
        if(previous < 0) previous = 0
        index = previous
    }

    fun allTasksProcessed(): Boolean = allTasksProcessed
}
