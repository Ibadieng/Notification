package main;

public class Decorator implements Notification{
    protected Notification notification;
    public Decorator(Notification n){
        this.notification = n;
    }
    @Override
    public void notifier() {
        this.notification.notifier();

    }
}
