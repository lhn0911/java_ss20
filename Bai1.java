package ss20;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list2 = new ArrayList<>();
        list.stream().filter(integer ->  integer % 2 == 0).forEach(integer -> list2.add(integer));
        System.out.println("Danh sach so chan: "+list2);


    }
}
