package org.lld.questions.loggersystem;

public class Demo {
    public static void run() {
        Logger logger = Logger.getInstance();
        logger.info("Revelation Indeed");
        logger.error("Error message");
    }
    public static void main(String[] args) {
        run();
    }
}
