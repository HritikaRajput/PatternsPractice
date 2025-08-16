package org.example.patterns.bridge;

import org.example.patterns.bridge.abstraction.Notification;
import org.example.patterns.bridge.abstraction.OrderConfirmation;
import org.example.patterns.bridge.abstraction.PasswordReset;
import org.example.patterns.bridge.implementor.Channel;
import org.example.patterns.bridge.implementor.Email;
import org.example.patterns.bridge.implementor.SMS;

public class Demo {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        // Create a notification using SMS channel
        SMS smsChannel = new SMS();
        Email emailChannel = new Email();

        Notification smsNotification = new OrderConfirmation(smsChannel, "Your order has been confirmed!", "1234567890");
        Notification emailNotification = new PasswordReset(emailChannel, "Your password has been reset", "23232");

        smsNotification.send();
        emailNotification.send();
    }
}
