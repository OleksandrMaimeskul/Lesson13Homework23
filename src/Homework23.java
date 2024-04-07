public class Homework23 {
        public static void main(String[] args) {
            Android android = new Android();
            iPhone iPhone = new iPhone();

            android.call();
            android.sms();
            android.internet();
            android.implementationOfOS();
            System.out.println();
            iPhone.call();
            iPhone.sms();
            iPhone.internet();
            iPhone.implementationOfOS();
        }
    }