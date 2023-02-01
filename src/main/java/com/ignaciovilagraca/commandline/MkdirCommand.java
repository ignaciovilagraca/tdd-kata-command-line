package com.ignaciovilagraca.commandline;

import java.util.ArrayList;
import java.util.List;

public class MkdirCommand implements Command {
    @Override
    public List<String> execute(String input, Directory directory) {
        String[] inputs = input.split(" ");
        String directoryName = inputs[1];
        directory.createDirectory(directoryName);
        return new ArrayList<>();
    }
}
