package Lesson08;

/**
 * Created by Vitaliy Tsvetkov on 19.07.2017.
 */
public class User {

    private String email;// приватные поля
    private String password;// приватные поля

    public User() {
    }// дефолтный конструктор

    public User(String email, String password) {
        this.email = email;
        this.password = hashPassword(password);
    }// конструктор с параметрами, принимающий все поля

    public String getEmail() {
        return email;
    }// геттер

    public String getPassword() {
        return password.replace("" +Integer.hashCode(hashCode()), "");
    }// геттер

    public void setEmail(String email) {
        this.email = email;
    }// сеттер

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }// сеттер

    private String hashPassword (String password){
        return password + "_" + Integer.hashCode(hashCode());
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }// объект toString() который выводит стринговое представление объекта
}
