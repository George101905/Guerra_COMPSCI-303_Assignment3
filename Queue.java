import java.util.*;

public class Queue<E> {
    private class Node {
        E data;
        Node next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public Queue(){
        front = rear = null;
        size = 0;
    }

    public void offer (E value){
        Node newNode = new Node(value);
        if(empty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public E poll() {
        if (empty()) {
            throw new NoSuchElementException("Queue is empty");
        }    
        E value = front.data;
        front = front.next;
        size--;

        if (front == null) { rear = null; }
        return value;
    }

    public E peek() {
        if(empty()){
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public int size() {
        return size;
    }
    
    public boolean empty() {
        return (size == 0);
    }

    public void move_to_rear() {
        if (size <= 1) return;
        E frontValue = peek();
        poll();
        offer(frontValue);
    }
}
