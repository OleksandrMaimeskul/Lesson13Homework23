public class Homework23 {
    public static void main(String[] args) {
        OS android = new OS("Android");
        OS iPhone = new OS("iPhone");

        android.loadOs();
        android.call();
        android.sms();
        android.internet();
        android.customizeLinux();
        System.out.println();
        iPhone.loadOs();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.iOS();
    }
}