package ss20.Bai5;

import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);

        NumberUtils.printInfo(normalList);
        NumberUtils.printInfo(singleElementList);
        NumberUtils.printInfo(allSameList);
    }
}
