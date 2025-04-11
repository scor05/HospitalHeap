package hospitalheap;

public interface PriorityQueue<E extends Comparable<E>> {
    public void enqueue(E e);
    public E dequeue();
    public E peek();
}
