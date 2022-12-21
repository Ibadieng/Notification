package main;

public class Test {
    public static void main (String[] args){
        Notification sms = new Sms(new Email());
        sms.notifier();
        System.out.println("\n*****");

        Notification whatsapp = new Whatsapp(new Email());
        whatsapp.notifier();
    }
}
