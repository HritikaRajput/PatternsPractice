package org.example.patterns.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator<String> {
    private final List<String> items;
    private int index = 0;

    ConcreteIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return this.index < items.size();
    }

    @Override
    public String next() {
        return this.hasNext() ? items.get(index++) : null;
    }
}
