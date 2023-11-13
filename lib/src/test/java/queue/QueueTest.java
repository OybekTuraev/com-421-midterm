package queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testIsEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        Queue<String> queue = new Queue<>();
        assertEquals(0, queue.size());

        queue.enqueue("A");
        assertEquals(1, queue.size());

        queue.enqueue("B");
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @Test
    public void testEnqueueDequeue() {
        Queue<Character> queue = new Queue<>();
        assertTrue(queue.isEmpty());

        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        assertFalse(queue.isEmpty());
        assertEquals(3, queue.size());

        assertEquals(Character.valueOf('A'), queue.dequeue());
        assertEquals(Character.valueOf('B'), queue.dequeue());
        assertEquals(Character.valueOf('C'), queue.dequeue());

        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    public void testPeek() {
        Queue<Double> queue = new Queue<>();
        assertNull(queue.peek());

        queue.enqueue(3.14);
        queue.enqueue(2.71);

        assertEquals(Double.valueOf(3.14), queue.peek());

        queue.dequeue();
        assertEquals(Double.valueOf(2.71), queue.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDequeueEmptyQueue() {
        Queue<String> emptyQueue = new Queue<>();
        emptyQueue.dequeue(); // This should throw NoSuchElementException
    }

    @Test(expected = NoSuchElementException.class)
    public void testPeekEmptyQueue() {
        Queue<Integer> emptyQueue = new Queue<>();
        emptyQueue.peek(); // This should throw NoSuchElementException
    }
}
