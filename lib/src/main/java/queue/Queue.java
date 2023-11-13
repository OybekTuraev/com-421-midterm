package queue;

public class Queue<T> {
    private Node front;
    private Node rear;
    private int n;

    private class Node {
        private T item;
        private Node next;
    }

    public Queue() {
        front = null;
        rear = null;
        n = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return n;
    }

    public void enqueue(T item) {
        Node oldRear = rear;
        rear = new Node();
        rear.item = item;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        n++;
    }

    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("The queue is empty");
        T item = front.item;
        front = front.next;
        n--;
        if (isEmpty()) {
            rear = null;
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("The queue is empty");
        return front.item;
    }

}