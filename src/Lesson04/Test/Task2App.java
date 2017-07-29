package Lesson04.Test;

/**
 * Created by Vitaliy Tsvetkov on 04.07.2017.
 */

/*
Write a command line program that works as Magic 8 Ball.
        Question should be entered as command line param in ""
        Program should output one random answer from the list of answers:
        "It is certain", "It is decidedly so", "Without a doubt", "Yes, definitely", "You may rely on it",
        "As I see it, yes", "Most likely", "Outlook good", "Yes", "Sings point to yes", "Reply hazy try again",
        "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
        "Don’t count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"
*/

public class Task2App {
    public static void main(String[] args) {
        int randomAnswer = (int) (Math.random() * 20);

        switch (randomAnswer) {
            case 1:
                System.out.println("It is certain");
                break;
            case 2:
                System.out.println("...");
                break;
            ///...
            default:
                System.out.println("...");
        }
    }
}
