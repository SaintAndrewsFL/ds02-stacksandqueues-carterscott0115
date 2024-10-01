import java.util.LinkedList;

public class QueueLL<E> {
    LinkedList<E> Queue;
    public QueueLL() {
        Queue = new LinkedList<E>();
    }
    public E enqueue(E item) {
        Queue.add(item);
        return item;
    }
    public E dequeue() {
        if(Queue.size() == 0) {
            return null;
        }
        E item = Queue.remove(0);
        return item;
    }
    public E peek() {
        if(Queue.size() == 0) {
            return null;
        }
        return Queue.get(0);
    }
    public void display() {
        for (int i = 0; i < Queue.size(); i++) {
            System.out.println("Item " + (i + 1) + ": " + Queue.get(i));
        }
    }
        public int size() {
            return Queue.size();
        }
        public boolean isEmpty() {
        return Queue.isEmpty();
        }
    }



/*
boolean isEmpty - Checks if queue is currently empty
 */