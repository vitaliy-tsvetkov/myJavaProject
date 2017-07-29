package Lesson09;

/**
 * Created by Vitaliy Tsvetkov on 24.07.2017.
 */
public class EqApp {
    public static void main(String[] args) {
        Author author1 = new Author("qwe", "qwe");
        Author author3 = new Author("qwe", "qwe");
        Author author2 = new Author("asd", "asd");

        System.out.println(author1.equals(author2));
        System.out.println(author1.equals(author3));
    }
}
