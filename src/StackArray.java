

public class StackArray<E> {
    E[] Stack;
    int size;
    int x;
    int i;
    public StackArray(int size) {
        this.size = size;
        Stack =  (E[]) new Object[size];
        i = 0;
        x = size;
    }
    public E push(E item) {
            if(Stack[size - 1] != null) {
                return item;
            }
                Stack[i] = item;
                i++;
            if(i == Stack.length) {
                 i = 0;
        }
                return item;
        }
        public E pop() {
            if(Stack.length == 0) {
                return null;
            }
            E item = Stack[x];
            Stack[x] = null;
            x--;
            if(x == 0) {
                x = 0;
            }
            return item;
        }
        public E peek() {
        return Stack[x];
        }
        public void display() {
        int f = 1;
            for(int y = Stack.length - 1; y > 0; y--) {
                System.out.println("Item " + f + ": " + Stack[y]);
                f++;
            }
    }
    public int size() {
        return Stack.length;
    }
    public boolean isEmpty() {
        int counter = 0;
        for (int y = 0; y < Stack.length; y++) {
            if (Stack[y] == null) {
                counter++;
            }
            }
            if (counter == Stack.length - 1) {
                return true;
            } else {
                return false;
            }
        }
    }



/*
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */