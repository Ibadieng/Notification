package main;

public class Email implements Notification{
    @Override
    public void notifier() {
        System.out.print("notification avec");
    }
}
