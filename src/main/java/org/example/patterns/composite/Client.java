package org.example.patterns.composite;

public class Client {
    public  static void run() {
        FileSystemItem file1 = new FileLeaf("file1", 10);
        FileSystemItem file2 = new FileLeaf("file2", 10);
        FileSystemItem file3 = new FileLeaf("file3", 10);
        FileSystemItem file4 = new FileLeaf("file4", 10);
        FileSystemItem file5 = new FileLeaf("file5", 10);

        FolderComposite folder1 = new FolderComposite("OuterFolder");
        folder1.addLeaf(file1);
        folder1.addLeaf(file2);

        FolderComposite folder2 =  new FolderComposite("MiddleFolder");
        folder2.addLeaf(file3);
        folder2.addLeaf(file4);

        folder1.addLeaf(folder2);

        FolderComposite folder3 = new FolderComposite("LeafFolder");
        folder3.addLeaf(file5);

        folder2.addLeaf(folder3);

        folder1.printFileStructure("");

    }
    public static void main(String[] args) {
        run();

    }
}
