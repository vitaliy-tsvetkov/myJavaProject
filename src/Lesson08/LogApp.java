package Lesson08;

import Infrastructure.TestLogger;

/**
 * Created by Vitaliy Tsvetkov on 22.07.2017.
 */
public class LogApp {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger();

        logger.log("Step 1");
        logger.log("Step 2");
        logger.log("Step 3");
        logger.log("Step 4");
        logger.log("Step 5");
        logger.log("Step 6");
        logger.log("Step 7");
        logger.log("Step 8");
    }
}
