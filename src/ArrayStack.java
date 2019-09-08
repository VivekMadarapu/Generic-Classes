public class ArrayStack<T> {

    private int top;
    private int size;
    private T[] stack;

    public ArrayStack(int size){
        top = -1;
        this.size = size;
        stack = (T[]) new Object[size];
    }

    public void push(T value) {
        if(!this.isFull()) {
            stack[top + 1] = value;
            top++;
        }
    }

    public T pop() {
        if(!this.isEmpty()) {
            T tempTop = stack[top];
            stack[top] = null;
            top--;
            return tempTop;
        }
        else{
            throw new ArrayIndexOutOfBoundsException("popped empty stack");
        }
    }

    public T peek() {
        if(top >= 0){
            return stack[top];
        }
        throw new ArrayIndexOutOfBoundsException("peeked empty stack");
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==stack.length-1;
    }

    public void clear() {
        top = -1;
        stack = (T[]) new Object[size];
    }

    public String ArrayToString() {

        for(T i : stack){
            System.out.println("[ " + i + "\t]");
        }
        return null;
    }

    public String toString(){
        for(int i = top; i >= 0; i--) {
            System.out.print(stack[i] + "\n");
        }
        return null;
    }


}
