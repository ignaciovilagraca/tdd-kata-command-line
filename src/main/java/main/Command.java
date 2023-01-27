package main;

import java.util.List;

public interface Command {
    List<String> execute(String input, Directory directory);
}
