package org.example.patterns.composite;

public class FileLeaf implements FileSystemItem{
    private final String fileName;
    private final int size;

    FileLeaf(String name, int size) {
        this.fileName = name;
        this.size = size;
    }
    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void printFileStructure(String indent) {
        System.out.println(indent + "  " + this.fileName +" : " + this.size);
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + this.fileName);
    }
}
