package com.ignaciovilagraca.commandline;

import java.util.List;

public class CommandNotFound implements Command {
    @Override
    public List<String> execute(String input, Directory directory) {
        return List.of("Command not found: " + input);
    }
}
