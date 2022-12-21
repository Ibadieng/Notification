package main;

public class Sms extends Decorator {
    public Sms(Notification n) {
        super(n);
    }

    @Override
    public void notifier() {
        super.notifier();
        System.out.print("SMS");
    }
}
