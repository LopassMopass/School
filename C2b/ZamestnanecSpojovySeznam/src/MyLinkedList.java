import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public String toString() {
        String sb = "";
        Node<T> current = head;
        while(current!= null) {
            sb+=current.getValue()+" ";
            current = current.getNext();
        }
        return sb;
    }

    public void addLast(T value) {
        if(head == null){
            this.add(value);
            return;
        }
        Node<T> newNode = new Node<T>(value);
        Node<T> current = head;
        while(current.getNext()!= null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        size++;
    }

    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.setNext(head);
        head.setPrevious(newNode);
        head = newNode;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean search(Node<T> head, int data) {
        Node<T> current = head;
        while (current != null){
            if (current.getData() == data){
                current = current.getNext();
                return true;
            }
        }
        return false;
    }

    public T popFirst() {
        if(head == null){
            throw new RuntimeException("Cannot pop");
        }
        T value = head.getValue();
        Node<T> secondNode = head.getNext();
        if(secondNode == null){
            head = null;
            tail = null;
            size = 0;
            return value;
        }
        head = secondNode;
        head.setPrevious(null);
        size--;
        return value;
    }

    public T popLast() {
        if(tail == null){
            throw new RuntimeException("Cannot pop");
        }
        T value = tail.getValue();
        Node<T> secondNode = tail.getPrevious();
        if(secondNode == null){
            head = null;
            tail = null;
            size = 0;
            return value;
        }
        tail = secondNode;
        tail.setNext(null);
        size--;
        return value;
    }
    public int size() {
        return size;
    }

    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        int i = 0;
        while(current!= null) {
            if(index == i){
                return current.getValue();
            }
            current = current.getNext();
            i++;
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListInterator(this);
    }
}
