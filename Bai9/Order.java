package ss20.Bai9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order(int id, String customerName, LocalDate createdDate, LocalDate deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = Optional.ofNullable(deliveryDate);
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public static void PrinOder(List<Order> orders) {
        System.out.println("== Danh sách đơn hàng đã giao ==");
        orders.stream()
                .filter(order -> !order.getDeliveryDate().isEmpty())
                .forEach(System.out::println);
        System.out.println();
    }

    public static void PrinInfo(List<Order> orders) {
        System.out.println("== Danh sách đơn hàng chưa giao ==");
        orders.stream()
                .filter(order -> order.getDeliveryDate().isEmpty())
                .forEach(System.out::println);
        System.out.println();
    }

    public static void countOder(List<Order> orders, LocalDate start, LocalDate end) {
        long count = orders.stream()
                .filter(order -> !order.getDeliveryDate()
                        .filter(date -> !date.isBefore(start) && !date.isAfter(end))
                        .isEmpty())
                .count();
        System.out.println("== Số đơn hàng đã giao từ " + start + " đến " + end + " ==");
        System.out.println("Tổng đơn: " + count);
        System.out.println();
    }
    @Override
    public String toString() {
        return String.format("ID: %d  | KH: %-6s | Đặt: %s | Giao: %s",
                id, customerName, createdDate, deliveryDate.map(LocalDate::toString).orElse("Chưa giao"));
    }
}
