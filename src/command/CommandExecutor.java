package command;

public interface CommandExecutor<R extends CommandResult, C extends Command> {
    R execute(C command);
}
