package ru.IShorin.JavaPractice.laba26;
import java.util.Queue;

import static ru.IShorin.JavaPractice.laba26.ArrayQueueModule.dequeue;

abstract class AbstractQueue implements Queue {
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
    public boolean isEmpty() {
        if (size()==0){ return true; }
        else { return false; }
    }

}
////////////////////////////////////////////////////////////////////////////////////////////
abstract class ArrayQueue_2 extends AbstractQueue {
    private int head = 0;
    private int tail = 0;
    private Object[] elems = new Object[16];
    private void ensureCapacity(int size) {
        if ((size == elems.length) || ((size > 3) && (size == elems.length / 4))) {
            Object[] newElems;
            if (size == elems.length) {
                newElems = new Object[elems.length * 2];
            } else {
                newElems = new Object[elems.length / 2];
            }
            if (head <= tail) {
                System.arraycopy(elems, head, newElems, 0, size());
            } else {
                System.arraycopy(elems, head, newElems, 0, elems.length - head);
                System.arraycopy(elems, 0, newElems, elems.length - head, tail);
            }
            tail = size();
            head = 0;
            elems = newElems;
        }
    }

    public void enqueue(Object element) {
        ensureCapacity(size() + 1);
        elems[tail] = element;
        tail = (tail + 1) % elems.length;
    }

    public Object element() {
        if (isEmpty()) { return null; }
        return elems[head];
    }

    public Object dequeue() {
        if(isEmpty()) { return null; }
        ensureCapacity(size() - 1);
        Object tmp = elems[head];
        elems[head] = null;
        head = (head + 1) % elems.length;
        return tmp;
    }

    public int size() {
        return tail - head + (head > tail ? elems.length : 0);
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
class Node {
    Object value;
    Node next;
    Node previous;
    public Node(Object value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
    public Node(Object value, Node next) {
        this.value = value;
        this.previous = null;
        this.next = next;
    }
    public Node(Object value, Node prev, Node next) {
        this.value = value;
        this.previous = prev;
        this.next = next;
    }
}
///////////////////////////////////////////////////////////////////////////////
 abstract class LinkedQueue extends AbstractQueue {
    private int size = 0;
    private Node head = null;
    private Node tail = null;
    public Object element() {
        assert !isEmpty();
        return head.value;
    }
    public void enqueue(Object element) {
        Node node = new Node(element);
        if (head == null) {
            this.head = node;
            this.tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
        size++;
    }
    public Object dequeue() {
        if(isEmpty()) { return null; }
        Node node = head;
        head = head.next;
        size--;
        return node.value;
    }
    public int size() {
        return size;
    }
}
///////////////////////////////////////////////////////////////////////////////

interface Queue_2 {
    int size();
    boolean isEmpty();
    void clear();
    Object dequeue();
}