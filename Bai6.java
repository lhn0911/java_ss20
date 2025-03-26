package ss20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String checktime = time.format(formatter);

        Map<String, Integer> itemCounts = new HashMap<>();
        for (String item : items) {
            itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        }
        System.out.println("Thời điểm xử lý: " + checktime);
        System.out.println("Kết quả đếm số lần xuất hiện của từng phần tử:");
        itemCounts.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
