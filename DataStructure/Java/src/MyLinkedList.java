import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String args[]){
        // 1, new
        List<Integer> listInteger1 = new LinkedList<>();

        // 2, add
        System.out.println("2.1: " + listInteger1.add(2));
        listInteger1.add(1, 5);
        listInteger1.add(1, 3);
        listInteger1.add(1, 1);
        System.out.println("2.2: " + listInteger1);

        // 3, create
        List<Integer> listInteger2 = new LinkedList<>(listInteger1);
        System.out.println("3.1: " + listInteger2);

        // 4, concatenate
        listInteger1.addAll(3, listInteger2);
        System.out.println("4.1: " + listInteger1);

        // 5, get
        System.out.println("5.1: " + listInteger1.get(3));
        System.out.println("5.2: " + listInteger1.indexOf(3));

        // 6, update
        listInteger1.set(3, 100);
        System.out.println("6.1: " + listInteger1);

        // 7, delete
        listInteger1.remove(3);
        System.out.println("7.1: " + listInteger1);



    }
}
