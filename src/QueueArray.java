
public class QueueArray<E> {
    E[] Queue;
    int size;
    int i;
    int x;
    public QueueArray(int size) {
        this.size = size;
        Queue =  (E[]) new Object[size];
        i = 0;
        x = 0;
    }
    public E enqueue(E item) {
        if(Queue[size - 1] != null) {
            return item;
        }
        Queue[i] = item;
        i++;
        if(i == Queue.length) {
            i = 0;
        }
        return item;
    }
    public E dequeue() {
        if(Queue.length == 0) {
            return null;
        }
        E item = Queue[x];
        Queue[x] = null;
        x++;
        if(x == Queue.length) {
            x = 0;
        }
        return item;
    }
    public E peek() {
        return Queue[x];
    }
    public void display() {
        for(int y = 0; y < Queue.length; y++) {
            System.out.println("Item " + (y + 1) + ": " + Queue[y]);
        }
    }
    public int size() {
        return Queue.length;
    }
    public boolean isEmpty() {
        int counter = 0;
        for(int y = 0; y < Queue.length; y++) {
            if(Queue[y] == null) {
                counter++;
            }
        }
        if(counter == Queue.length - 1) {
            return true;
        }
        else {
            return false;
        }
    }
}





