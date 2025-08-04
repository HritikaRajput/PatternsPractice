package org.lld.questions.lrucache;

import java.util.HashMap;
import java.util.Map;

public class LruCache<K,V> {
    private final int capacity;
    private final DoublyLinkedList<K,V> dll;
    private final Map<K, Node<K,V>> map;

    LruCache(int capacity) {
        this.capacity = capacity;
        this.dll = new DoublyLinkedList();
        this.map = new HashMap<>();
    }

    public synchronized V get(K key) {
        if(map.get(key) == null) {
           return null;
        }
        Node<K,V> node = map.get(key);
        dll.addFirst(node);
        return node.value;
    }

    public synchronized void put(K key,V val) {
        if(map.containsKey(key)) {
            Node<K,V> node = map.get(key);
            node.value = val;
            dll.moveToFront(node);
            return;
        }

        if(map.size() < this.capacity) {
            Node<K,V> node = new Node<>(key,val);
            map.put(key,node);
            dll.addFirst(node);
            return;
        }

        while(map.size() >= capacity) {
            Node<K,V> node = dll.removeLast();
            map.remove(node.key);
        }

        Node<K,V> node = new Node<>(key,val);
        map.put(key,node);
        dll.addFirst(node);
    }
    public synchronized void remove(K key) {
        if(map.get(key) == null)
            return;
        Node<K,V> node = map.get(key);
        map.remove(key);
        dll.remove(node);
    }

}
