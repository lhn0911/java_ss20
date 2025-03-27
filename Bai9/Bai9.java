package ss20.Bai9;

import java.time.LocalDate;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Order> orders = List.of(

                new Order(1, "Quý", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25)),

                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),

                new Order(3, "Minh", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 23)),

                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),

                new Order(5, "Việt", LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 30))

        );

        Order.PrinOder(orders);
        Order.PrinInfo(orders);
        Order.countOder(orders, LocalDate.of(2025, 3, 17), LocalDate.of(2025, 3, 25));
    }
}
