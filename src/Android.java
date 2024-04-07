public class Android implements Smartphones, OS{
    @Override
    public void call() {
        System.out.println("Calling from Android.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on Android.");
    }
    @Override
    public void implementationOfOS() {
        System.out.println("Implementation of LinuxOS...");
    }
}

