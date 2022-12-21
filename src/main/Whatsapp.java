package main;

public class Whatsapp extends Decorator{
    public Whatsapp(Notification n) {
        super(n);
    }

    @Override
    public void notifier() {
        super.notifier();
        System.out.print("WhatsApp");
    }
}
