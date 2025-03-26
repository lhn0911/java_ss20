package ss20.Bai3;

import ss20.Bai3.User;

import java.util.List;

public class Bai3 {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Quý", "0987654321"),
                new User("Lan", null),
                new User("Minh", "0933222111"),
                new User("Huyền", null)
        );

        users.forEach(User::printInfo);
    }
}
