package com.ignaciovilagraca.commandline;

import java.util.List;

public class LsCommand implements Command {
    @Override
    public List<String> execute(String input, Directory directory) {
        return directory.present();
    }
}
