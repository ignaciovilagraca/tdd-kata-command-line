package com.ignaciovilagraca.commandline;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<Directory> childrenDirectories;
    Directory parentDirectory;

    public Directory(String name) {
        this.name = name;
        this.childrenDirectories = new ArrayList<>();
    }

    public List<String> present() {
        List<String> output = new ArrayList<>();
        childrenDirectories.forEach(directory -> output.add(directory.toString()));
        return output;
    }

    @Override
    public String toString() {
        return "/" + name;
    }

    public void createDirectory(String directoryName) {
        Directory newDirectory = new Directory(directoryName);
        newDirectory.parentDirectory = this;
        childrenDirectories.add(newDirectory);
    }
}
