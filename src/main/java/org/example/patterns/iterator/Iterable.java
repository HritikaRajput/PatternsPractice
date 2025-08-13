package org.example.patterns.iterator;

public interface Iterable<T> {
    Iterator<T> createIterator(String iteratorType);
}
