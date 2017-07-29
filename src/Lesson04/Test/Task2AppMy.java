package Lesson04.Test;


import java.util.Random;

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

public class Task2AppMy {
    public static void main(String[] args) {
        String[] answers = {"It is certain", "It is decidedly so", "Without a doubt", "Yes, definitely", 
        "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Sings point to yes", 
        "Reply hazy try again", "Ask again later", "Better not tell you now", "Cannot predict now", 
        "Concentrate and ask again", "Don’t count on it", "My reply is no", "My sources say no", 
        "Outlook not so good", "Very doubtful"};

        Random ra = new Random();
        int answerNumber = ra.nextInt(19) + 0;

        System.out.println("\nQ: " + args [0]);
        System.out.println("A: " + answers[answerNumber]);
    }
}
