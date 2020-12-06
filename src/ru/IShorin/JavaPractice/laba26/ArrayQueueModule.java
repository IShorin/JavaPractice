package ru.IShorin.JavaPractice.laba26;

public class ArrayQueueModule {
    private static int qhead = 0;
    private static int qtail = 0;
    private static Object[] elems = new Object[16];
    public static int cursize() {
        return qtail - qhead + (qhead > qtail ? elems.length : 0);
    }
    public static boolean isEmpty() {
        return qhead == qtail;
    }
    private static void ensureCapacity(int size) {
        if (size == elems.length || (size > 3 && size == elems.length / 4)) {
            Object[] newElements;
            if (size == elems.length) {
                newElements = new Object[elems.length * 2];
            } else {
                newElements = new Object[elems.length / 2];
            }
            if (qhead <= qtail) {
                System.arraycopy(elems, qhead, newElements, 0, cursize());
            } else {
                System.arraycopy(elems, qhead, newElements, 0, elems.length - qhead);
                System.arraycopy(elems, 0, newElements, elems.length - qhead, qtail);
            }
            qtail = cursize();
            qhead = 0;
            elems = newElements;
        }
    }
    public static void enqueue(Object element) {
        ensureCapacity(cursize() + 1);
        elems[qtail] = element;
        qtail = (qtail + 1) % elems.length;
    }
    public static Object element() {
        if(isEmpty()) return null;
        return elems[qhead];
    }
    public static Object dequeue() {
        if (isEmpty()) return null;
        ensureCapacity(cursize() - 1);
        Object r = elems[qhead];
        elems[qhead] = null;
        qhead = (qhead + 1) % elems.length;
        return r;
    }
    public static void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }


}