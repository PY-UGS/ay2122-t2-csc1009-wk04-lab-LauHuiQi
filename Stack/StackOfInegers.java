public class StackOfInegers {
    private int[] elements;
    private int size;

    public StackOfInegers() {
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfInegers(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        this.elements[size] = value;
        this.size += 1;
    }

    public void pop() {
        if (!empty())
            this.size -= 1;
    }

    public int getSize() {
        return this.size;
    }

}
