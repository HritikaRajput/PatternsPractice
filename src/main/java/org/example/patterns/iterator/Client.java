package org.example.patterns.iterator;

public class Client {
    public static void run() {
        Words words = new Words();
        words.addWords("Hritika");
        words.addWords("is");
        words.addWords("awesome");
        Iterator<String> iterator = words.createIterator("reversed");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = words.createIterator("gdf");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        run();
    }
}
