package main;

import java.util.List;
import java.util.Map;

public class CommandLine {

    private Directory directory;

    public CommandLine() {
        this.directory = new Directory("root");
    }

    private final Map<String, Command> commands = Map.of(
            "ls", new LsCommand(),
            "mkdir", new MkdirCommand()
    );

    public List<String> execute(String input) {
        String[] inputs = input.split(" ");
        Command command = commands.getOrDefault(inputs[0], new CommandNotFound());
        return command.execute(input, directory);
    }
}
