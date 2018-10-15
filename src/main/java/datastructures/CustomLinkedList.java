package main.java.datastructures;

public class CustomLinkedList<E> {
    private Node head;
    private int size;

    CustomLinkedList() {
    }

    public void addHead(E value){
        if(this.head == null){
            this.head = new Node<E>(value);
        } else{
            Node tmp = this.head;
            this.head = new Node<E>(value, null, tmp);
            tmp.prev = this.head;
        }
        ++size;
    }

    public void add(E value){
        if(this.head == null) {
            addHead(value);
        } else {
            addTail(value);
        }
    }

    public Object get(int index){
        Object current = getNode(index);
        if(current == null) return null;
        return ((Node)current).value;
    }

    private Node getNode(int index){
        if(index >= size || index < 0 ) return null;

        Node current = head;
        int counter = 0;
        while(current.next != null && counter < index){
            current = current.next;
            ++counter;
        }
        return current;
    }

    public boolean insert(E value, int index) {
        if (index > size) return false;

        if (index == 0) {
            addHead(value);
            return true;
        }

        if (index == size) {
            addTail(value);
            return true;
        }
        
        Node atIndex = getNode(index);
        Node toInsert = new Node(value, atIndex.prev, atIndex);

        atIndex.prev.next = toInsert;
        atIndex.prev = toInsert;

        ++size;
        return true;
    }


    public boolean remove(int index) {
        if(index < 1 || index >= size) return false;

        Node toRemove = getNode(index);

        Node previous = toRemove.prev;
        Node next = toRemove.next;

        previous.next = next;
        // if is tail
        if (next != null) {
            next.prev = previous;
        }

        --size;
        return true;
    }


    public Node getTail() {
        return getNode(size-1);
    }

    public void addTail(E value) {
        Node tail = getTail();

        // if empty list
        if (tail == null){
            tail = new Node(value, this.head, null);
            ++size;
            return;
        }

        Node newTail = new Node(value, tail, null);
        tail.next = newTail;
        ++size;
    }

    public int getSize() {
        return size;
    }

    private class Node<E> {
        private E value;
        private Node next;
        private Node prev;

        Node(E value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        Node(E value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public void addAndPrint(E value) {
        add(value);
        this.print();
    }

    public void print() {
        Node current = this.head;
        while(current != null) {
            System.out.print(" - " + current.value);
            current = current.next;
        }
        System.out.println();
    }
}
