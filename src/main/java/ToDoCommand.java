public class ToDoCommand extends Command {
    private ToDo toDo;

    public ToDoCommand(String description) {
        toDo = new ToDo(description);
    }

    public boolean isExit() {
        return false;
    }

    public void execute(Storage storage, TaskList tasks, Ui ui) {
        tasks.add(toDo);
        ui.showTaskAdded(toDo);
        ui.showNumberOfTasks(tasks);
    }
}
