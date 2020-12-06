package ru.IShorin.JavaPractice.laba26;

public class ArrayQueueADT {
    private int qhead = 0;
    private int qtail = 0;
    private Object[] elems = new Object[16];
    public static int size(ArrayQueueADT queue) {
        return queue.qtail - queue.qhead + (queue.qhead > queue.qtail ? queue.elems.length : 0);
    }
    public static boolean isEmpty(ArrayQueueADT queue) { // является ли очередь пустой
        return queue.qhead == queue.qtail;
    }
    private static void ensureCapacity(ArrayQueueADT queue, int size) {
        if (size == queue.elems.length || (size > 3 && size == queue.elems.length / 4)) {
            Object[] newElements;
            if (size == queue.elems.length) {
                newElements = new Object[queue.elems.length * 2];
            } else {
                newElements = new Object[queue.elems.length / 2];
            }
            if (queue.qhead <= queue.qtail) {
                System.arraycopy(queue.elems, queue.qhead, newElements, 0, size(queue));
            } else {
                System.arraycopy(queue.elems, queue.qhead, newElements, 0, queue.elems.length - queue.qhead);
                System.arraycopy(queue.elems, 0, newElements, queue.elems.length - queue.qhead, queue.qtail);
            }
            queue.qtail = size(queue);
            queue.qhead = 0;
            queue.elems = newElements;
        }
    }
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, size(queue) + 1);
        queue.elems[queue.qtail] = element;
        queue.qtail = (queue.qtail + 1) % queue.elems.length;
    }
    public static Object element(ArrayQueueADT queue) {
        if(isEmpty(queue)){
            return null;
        }
        else {
            return queue.elems[queue.qhead];
        }
    }
    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)){ return null;}
        ensureCapacity(queue, size(queue) - 1);
        Object r = queue.elems[queue.qhead];
        queue.elems[queue.qhead] = null;
        queue.qhead = (queue.qhead + 1) % queue.elems.length;
        return r;
    }
    public static void clear(ArrayQueueADT queue) {
        while (!isEmpty(queue)) {
            dequeue(queue);
        }
    }
}
