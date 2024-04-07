class OS implements Smartphones, LinuxOS, IOS {
    private final String osName;

    public OS(String osName) {
        this.osName = osName;
    }

    public void loadOs() {
        System.out.println("Loading " + osName + " OS...");
    }

    @Override
    public void call() {
        System.out.println("Calling from " + osName + ".");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from " + osName + ".");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on " + osName + ".");
    }

    @Override
    public void customizeLinux() {
        System.out.println("Customizing Linux on " + osName + "...");
    }

    @Override
    public void iOS() {
        System.out.println("Using iOS features on " + osName + "...");
    }
}