package com.sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListQueueTest {

    private Queue<Integer> testQueue;

    @BeforeEach
    public void setUp() {
        testQueue = new ArrayListQueue<>();
    }

    @Test
    void offer() {

        assertTrue(testQueue.offer(1));
        assertTrue(testQueue.offer(2));
        assertEquals(2, ((ArrayListQueue) testQueue).queue.size());
    }

    @Test
    void poll() {

        testQueue.offer(1);
        testQueue.offer(2);
        assertEquals(1, testQueue.poll());
        assertEquals(1, ((ArrayListQueue) testQueue).queue.size());
        assertEquals(2, testQueue.poll());
        assertTrue(testQueue.isEmpty());
    }

    @Test
    void peek() {

        testQueue.offer(1);
        testQueue.offer(2);
        assertEquals(1, testQueue.peek());
        assertEquals(2, ((ArrayListQueue) testQueue).queue.size());
    }

    @Test
    void isEmpty() {

        assertTrue(testQueue.isEmpty());
        testQueue.offer(1);
        assertFalse(testQueue.isEmpty());
    }

    @Test
    void pollEmptyQueue() {

        assertNull(testQueue.poll());
    }

    @Test
    void peekEmptyQueue() {

        assertNull(testQueue.peek());
    }

    @Test
    void offerNull() {

        testQueue.offer(null);
        assertEquals(1, ((ArrayListQueue) testQueue).queue.size());
    }

    @Test
    void toStringTest() {

        testQueue.offer(1);
        testQueue.offer(2);
        assertEquals("ArrayListQueue {queue=[2, 1]}", testQueue.toString());
    }
}