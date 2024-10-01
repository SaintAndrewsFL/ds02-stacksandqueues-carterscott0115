import java.util.LinkedList;

public class StackLL<E> {
        LinkedList<E> Stack;
        public StackLL() {
            Stack = new LinkedList<E>();
        }
        public E enqueue(E item) {
            Stack.addFirst(item);
            return item;
        }
        public E dequeue() {
            if(Stack.size() == 0) {
                return null;
            }
            E item = Stack.remove(0);
            return item;
        }
        public E peek() {
            if(Stack.size() == 0) {
                return null;
            }
            return Stack.get(0);
        }
        public void display() {
            for (int i = 0; i < Stack.size(); i++) {
                System.out.println("Item " + (i + 1) + ": " + Stack.get(i));
            }
        }
        public int size() {
            return Stack.size();
        }
        public boolean isEmpty() {
            return Stack.isEmpty();
        }
    }