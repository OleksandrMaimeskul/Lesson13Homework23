class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from an Android phone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an Android phone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone.");
    }

    @Override
    public void customizeLinux() {
        System.out.println("Customizing Linux on an Android phone.");
    }
}