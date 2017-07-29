package Lesson08;

/**
 * Created by Vitaliy Tsvetkov on 21.07.2017.
 */
public class Application {
    public static void main(String[] args) {
        User user1 = new User("max@rtest.com", "123");
        User user2 = new User("test@test.com", "456");

        System.out.println(user2.toString());
        System.out.println(user1.toString());

        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());

        user1.setPassword("qwerty");
        user2.setPassword("asdfg");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
