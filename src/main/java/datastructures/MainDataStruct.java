package main.java.datastructures;
import main.java.datastructures.CustomHashMap;

public class MainDataStruct {
    public static void main(String[] args) {
        //runLinkedList();
        runHashMap();
    }

    private static void runHashMap() {
        CustomHashMap<String, String> hashMap = new CustomHashMap<>();
        hashMap.put("firstKey", "firstValue");

        System.out.println(hashMap.get("firstValue"));
    }

    private static void runLinkedList() {
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