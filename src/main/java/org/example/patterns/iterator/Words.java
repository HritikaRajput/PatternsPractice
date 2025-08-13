package org.example.patterns.iterator;

import java.util.ArrayList;
import java.util.List;
public class Words implements Iterable<String>{
    private List<String> words=  new ArrayList<>();


    public void addWords(String word) {
        this.words.add(word);
    }
    @Override
    public Iterator<String> createIterator(String iteratorType) {
        switch (iteratorType) {
            case "reversed":
                return new ConcreteIterator2(words);
            default:
                return new ConcreteIterator(words);
        }
    }
}
