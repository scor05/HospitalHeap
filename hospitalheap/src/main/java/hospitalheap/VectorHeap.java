package hospitalheap;

/*
 * Clase principal del heap personalizado.
 */

import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    public ArrayList<E> heap;
    public int size;
    public int current;

    public VectorHeap() {
        this.heap = new ArrayList<>();
        this.size = 0;
        this.current = 0;
    }

    @Override
    public void enqueue(E e) {
        if (this.heap.isEmpty()){
            this.heap.add(e);
            this.size++;
            this.current++;
        } else {
            int i = this.current;
            
        }
    }
}
