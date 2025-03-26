package ss20;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        List<Integer> list2 = new ArrayList<>();
        list.stream().filter(integer -> integer % 2 != 0).forEach(integer -> list2.add(integer));
        System.out.println(list2);
        int a = list2.stream().reduce((integer, integer2) ->  integer + integer2).get();

        System.out.println(a);

    }
}
