class iPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from an iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from an iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone.");
    }

    @Override
    public void iOS() {
        System.out.println("Implementing IOS on an iPhone.");
    }
}