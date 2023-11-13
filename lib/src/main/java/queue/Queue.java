package queue;

import java.util.NoSuchElementException;

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
    
}