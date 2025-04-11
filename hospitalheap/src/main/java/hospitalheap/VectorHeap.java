package hospitalheap;

/*
 * Clase principal del heap personalizado.
 */

import java.util.ArrayList;

public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E> {
    public ArrayList<E> heap;

    public VectorHeap() {
        this.heap = new ArrayList<>();
    }

    public void enqueue(E e) {
        if (this.heap.isEmpty()){
            this.heap.add(e);
        } else {
            this.heap.add(e);
            for (int i = this.heap.size() - 1; i > 0; i--){
                if (this.heap.get(i).compareTo(this.heap.get(i - 1)) > 0){
                    E aux = this.heap.get(i);
                    this.heap.set(i, this.heap.get(i - 1));
                    this.heap.set(i - 1, aux);
                } else { 
                    break;
                }
            }
        }
    }

    /**
     * Se crea una nueva lista para evitar que ArrayList.remove() corra todos los elementos cada vez que se llama a dequeue()
     * Esto hace que se corra el método dequeue() en O(1) y no en O(n).
     */
    public E dequeue() {
        E primero = this.heap.get(0);
        this.heap = new ArrayList<E>(this.heap.subList(1, this.heap.size()));
        return primero;
    }

    public E peek() {
        return this.heap.get(0);
    }
}
