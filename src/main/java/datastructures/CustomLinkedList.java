package datastructures;

/**
 * Created by Jeremy on 7/22/2016.
 */

public class CustomLinkedList<E> {

    public static void main(String[] args){
        CustomLinkedList<Integer> list = new CustomLinkedList<>(1);

        printList(list);

        list.add(2);
        printList(list);

        list.addHead(0);
        printList(list);

        list.addTail(3);
        printList(list);

        list.add(5);
        printList(list);

        list.insert(4, 4);
        printList(list);

        list.remove(2);
        printList(list);
    }

    public static void print(Object num){
        System.out.println((int)num);
    }

    public static void printList(CustomLinkedList<Integer> list){
        for(int i=0; i<list.getSize(); i++){
            print(list.get(i));
        }
        System.out.println();
    }

    private Node head;
    private int size;

    CustomLinkedList(E value) {
        addHead(value);
    }


    public void addHead(E value){
        // Add new head to empty list
        if(this.head == null){
            this.head = new Node<E>(value);
            // Add new head to list
        } else{
            Node tmp = head;
            this.head = new Node(value);
            this.head.prev = (null);
            this.head.next = tmp;
            tmp.prev = this.head;
        }
        ++size;
    }

    public void add(E value){
        if(this.head == null){
            addHead(value);
            return;
        }else{
            addTail(value);
            return;
        }
    }

    // Returns the node's data at (index)
    public Object get(int index){
        Object current = getNode(index);
        if(current == null) return null;
        return ((Node)current).value;
    }


    private Node getNode(int index){
        if(index > size || index < 0 ) return null;

        Node current = head;
        int counter = 0;
        while(current.next != null && counter < index){
            current = current.next;
            ++counter;
        }
        return current;
    }


    public boolean insert(E value, int index){
        if(index > size) return false;
        if(index == 0){
            addHead(value);
            return true;
        }
        if(index == size){
            addTail(value);
            return true;
        }

        Node toInsert = new Node(value);
        Node atIndex = getNode(index);

        toInsert.next = atIndex;
        toInsert.prev = atIndex.prev;
        atIndex.prev.next = toInsert;
        atIndex.prev = toInsert;

        ++size;
        return true;
    }


    public boolean remove(int index){
        if(index < 1 || index > size) return false;

        Node toRemove = getNode(index);

        Node previous = toRemove.prev;
        Node next = toRemove.next;

        previous.next = next;
        next.prev = previous;

        --size;
        return true;
    }


    public Node getTail(){
        return getNode(size-1);
    }

    public void addTail(E value){
        Node tail = getTail();

        if(tail == null){
            tail = new Node(value);
            tail.prev = head;
            ++size;
            return;
        }

        Node newTail = new Node(value);
        newTail.prev = tail;
        newTail.next = null;
        tail.next = newTail;
        ++size;
    }


    public int getSize(){
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


        Node(E value){
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }



}
