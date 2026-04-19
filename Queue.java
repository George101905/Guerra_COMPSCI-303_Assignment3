public class Queue<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;
    private int frontIndex;
    private int rearIndex;
    private Object[] data;

    public Queue() {
        this.capacity = DEFAULT_CAPACITY;
        this.data = new Object[capacity];
        this.size = 0;
        this.frontIndex = 0;
        this.rearIndex = 0;
    }

    public boolean offer(E item){
        if (size == capacity) {
            resize();
        }

        size ++;
        rearIndex = (rearIndex + 1) % capacity;
        data[rearIndex] = item;

        return true;
    }

    public E poll() {
        if (size == 0){
            return null;
        }

        E value = (E) data[frontIndex];
        data[frontIndex] = null;
        frontIndex = (frontIndex + 1) % capacity;
        size--;

        return value;
    }

    public void resize() {
        int newCapacity = 2 * capacity;
        Object[] newData = new Object[newCapacity];

        int j = frontIndex;

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
            j = (j + 1) % capacity;
        }

        frontIndex = 0;
        rearIndex = size - 1;
        capacity = newCapacity;
        data = newData;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        if (size <= 0) {
            return true;
        }
        return false;
    }
}
