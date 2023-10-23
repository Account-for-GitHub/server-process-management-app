package app

class Initiator {
    private var tasks = listOf<ITask>()
    private var index: Int = 0
    private var justRanIndex: Int = 0
    private var allTasksProcessed = false

    fun setTasks(taskList: List<ITask>) {
        tasks = taskList
    }

    fun runNext() {
        tasks[index].execute()
        justRanIndex = index
        index++
        if (index >= tasks.size) {
            index = tasks.lastIndex
            allTasksProcessed = true
        }
    }

    fun undoExecuted() {
        tasks[justRanIndex].undo()
        var previous = justRanIndex - 1
        if(previous < 0) previous = 0
        index = previous
    }

    fun allTasksProcessed(): Boolean = allTasksProcessed
}
