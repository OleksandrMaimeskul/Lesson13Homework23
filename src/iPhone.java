public class iPhone implements Smartphones, OS{

    @Override
    public void call() {
        System.out.println("Calling from iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on iPhone.");
    }

    @Override
    public void implementationOfOS() {
        System.out.println("implementation of IOS...");
    }
}
