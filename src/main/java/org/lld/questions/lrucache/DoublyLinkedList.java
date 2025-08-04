package org.lld.questions.lrucache;

public class DoublyLinkedList<K,V> {
    private final Node<K,V> head;
    private final Node<K,V> tail;

    public DoublyLinkedList() {
        this.head = new Node<>(null, null);
        this.tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public void addFirst(Node<K,V> node) {
      Node<K,V> next = head.next;
      next.prev = node;
      node.next = next;
      head.next = node;
      node.prev = head;
    }

    public void remove(Node<K,V> node) {
        Node<K,V> prev = node.prev;
        Node<K,V> next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    public Node<K,V> removeLast() {
        if(tail.prev ==  head) return  null;// empty
        Node<K,V> prev = tail.prev;
        remove(prev);
        return prev;
    }
    public void moveToFront(Node<K,V> node) {
        remove(node);
        addFirst(node);
    }
}
