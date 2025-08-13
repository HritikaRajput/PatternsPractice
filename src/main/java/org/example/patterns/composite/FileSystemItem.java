package org.example.patterns.composite;

public interface FileSystemItem {
    int getSize();
    void printFileStructure(String name);
    void delete();
}
