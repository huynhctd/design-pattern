package command_pattern.core;

import java.util.HashMap;
import java.util.Map;

public abstract class CommandDispatcher {
    Map<Class, CommandExecutor> prepareMap = new HashMap<>();

    public <C extends Command, R extends CommandResult> R dispatch(C command) {
        return (R) prepareMap.get(command.getClass()).execute(command);
    }
}
