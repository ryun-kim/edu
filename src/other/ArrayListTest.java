package other;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();  //(상속관계)

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(100);
        myList.add(101);
        myList.print();

        int removeVal = list.remove (0);
        System.out.println("removeVal : " + removeVal);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
