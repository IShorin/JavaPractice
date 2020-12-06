package ru.IShorin.JavaPractice.laba26;

public class ArrayQueue {
    private int qhead = 0;
    private int qtail = 0;
    private Object[] elems = new Object[16];
    public int size() {
        return qtail - qhead + (qhead > qtail ? elems.length : 0);
    }

        public boolean isEmpty() {
        return qhead == qtail;
    }
    private void ensureCapacity(int size) {
        if (size == elems.length || (size > 3 && size == elems.length / 4)) {
            Object[] newElements;
            if (size == elems.length) {
                newElements = new Object[elems.length * 2];
            } else {
                newElements = new Object[elems.length / 2];
            }
            if (qhead <= qtail) {
                System.arraycopy(elems, qhead, newElements, 0, size());
            } else {
                System.arraycopy(elems, qhead, newElements, 0, elems.length - qhead);
                System.arraycopy(elems, 0, newElements, elems.length - qhead, qtail);
            }
            qtail = size();
            qhead = 0;
            elems = newElements;
        }
    }
    public void enqueue(Object element) {
        ensureCapacity(size() + 1);
        elems[qtail] = element;
        qtail = (qtail + 1) % elems.length;
    }

    public Object element() {
        if (!isEmpty()) {
            return elems[qhead];
        }
        else return null;
    }
    public Object dequeue() {
        if(isEmpty()){ return null;}
        else {
            ensureCapacity(size() - 1);
            Object r = elems[qhead];
            elems[qhead] = null;
            qhead = (qhead + 1) % elems.length;
            return r;
        }
    }
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}
