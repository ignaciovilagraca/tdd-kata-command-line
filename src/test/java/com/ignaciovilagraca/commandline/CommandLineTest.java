package com.ignaciovilagraca.commandline;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandLineTest {

    private CommandLine commandLine;

    @Test
    void commandNotFoundTest() {
        commandLine = new CommandLine();

        List<String> output = commandLine.execute("this is something i made up");

        List<String> expected = List.of("Command not found: this is something i made up");

        assertEquals(expected, output);
    }

    @Test
    void commandLsShowsEmptyFolder() {
        commandLine = new CommandLine();

        List<String> output = commandLine.execute("ls");

        assertTrue(output.isEmpty());
    }

    @Test
    void commandMkdirCreatesNewFolder() {
        commandLine = new CommandLine();

        List<String> output = commandLine.execute("mkdir test_folder");

        assertTrue(output.isEmpty());

        output = commandLine.execute("ls");

        List<String> expected = List.of("/test_folder");

        assertEquals(expected, output);
    }
}
