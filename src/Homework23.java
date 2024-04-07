public class Homework23 {
    public static void main(String[] args) {
        Smartphones android = new Androids();
        Smartphones iPhone = new iPhones();

        android.call();
        android.sms();
        android.internet();
        ((LinuxOS) android).customizeLinux();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        ((IOS) iPhone).iOS();
    }
}