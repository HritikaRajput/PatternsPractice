package org.example.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements FileSystemItem{
    private final String folderName;
    private final List<FileSystemItem> fileSystemItemList = new ArrayList<>();

    public FolderComposite(String folderName) {
        this.folderName = folderName;
    }

    public void addLeaf(FileSystemItem fileSystemItem) {
        this.fileSystemItemList.add(fileSystemItem);
    }

    @Override
    public int getSize() {
        int size = 0;
        for(FileSystemItem fileSystemItem: fileSystemItemList) {
            size += fileSystemItem.getSize();
        }
        return size;
    }

    @Override
    public void printFileStructure(String indent) {
        System.out.println(indent + " - " + this.folderName + " /");
        for(FileSystemItem fileSystemItem: fileSystemItemList) {
           fileSystemItem.printFileStructure(indent + "  ");
        }
    }

    @Override
    public void delete() {
        System.out.println("Deleting folder: "+ this.folderName);
        for(FileSystemItem fileSystemItem: fileSystemItemList) {
            fileSystemItem.delete();
        }
    }
}
