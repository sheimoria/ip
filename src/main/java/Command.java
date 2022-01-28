public abstract class Command {
    abstract void execute(Storage storage, TaskList tasks, Ui ui) throws DukeException;
    abstract boolean isExit();
}
