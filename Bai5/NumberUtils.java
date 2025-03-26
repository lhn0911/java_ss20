package ss20.Bai5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumberUtils {
    public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst();
    }

    public static void printInfo(List<Integer> numbers) {
        Optional<Integer> secondLargest = findSecondLargest(numbers);
        secondLargest.ifPresentOrElse(
                value -> System.out.println("Số lớn thứ hai: " + value),
                () -> System.out.println("Không tìm thấy số lớn thứ hai")
        );
    }
}
