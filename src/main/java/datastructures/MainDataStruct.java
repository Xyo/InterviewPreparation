package main.java.datastructures;

public class MainDataStruct {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList<Integer>();

        list.addAndPrint(2);

        list.addHead(0);
        list.print();

        list.addTail(3);
        list.print();

        list.add(5);
        list.print();

        list.insert(4, 3);
        list.print();

        list.remove(3);
        list.print();
    }
}