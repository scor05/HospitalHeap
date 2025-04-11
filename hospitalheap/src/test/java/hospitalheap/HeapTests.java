package hospitalheap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HeapTests {

    @Test
    public void shouldEnqueueProperly() {
        VectorHeap<Patient> queue = new VectorHeap<>();
        Patient p1 = new Patient("Juan Perez", "fractura de pierna", 'C');
        queue.enqueue(p1);

        assertEquals(1, queue.heap.size());
        assertEquals(p1, queue.heap.get(0));    
    }

    @Test
    public void shouldPeekProperly() {
        VectorHeap<Patient> queue = new VectorHeap<>();
        Patient p1 = new Patient("Juan Perez", "fractura de pierna", 'C');
        queue.enqueue(p1);
        assertEquals(p1, queue.peek());
    }

    @Test
    public void shouldDequeueProperly() {
        VectorHeap<Patient> queue = new VectorHeap<>();
        Patient p1 = new Patient("Juan Perez", "fractura de pierna", 'C');
        Patient p2 = new Patient("Maria Ramirez", "apendicitis", 'A');
        Patient p3 = new Patient("Lorenzo Toledo", "chikunguya", 'E');

        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        assertEquals(p2, queue.dequeue());
    }
}
