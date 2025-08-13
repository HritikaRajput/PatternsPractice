package org.example.patterns.iterator;

import java.util.List;

public class ConcreteIterator2 implements Iterator<String> {
    private final List<String> words;
    private int index = 0;

    ConcreteIterator2(List<String> words) {
        this.words = words;
        index = words.size()-1;
    }
    @Override
    public boolean hasNext() {
        return this.index >= 0;
    }

    @Override
    public String next() {
        return this.hasNext() ? this.words.get(index--) : null;
    }
}
