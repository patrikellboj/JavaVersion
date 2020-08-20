public class Info {
    private final String OSUserName = System.getProperty("user.name");
    private final String OSName = System.getProperty("os.name");
    private final String OSVersion = System.getProperty("os.version");
    private final String JavaVersion = System.getProperty("java.version");
    private final String JavaHomeDir = System.getProperty("java.home");

    public String getOSUserName() {
        return OSUserName;
    }

    public String getOSName() {
        return OSName;
    }

    public String getOSVersion() {
        return OSVersion;
    }

    public String getJavaVersion() {
        return JavaVersion;
    }

    public String getJavaHomeDir() {
        return JavaHomeDir;
    }

}


//        display.append("  User account name\t" + System.getProperty("user.name") + "\n\n" );
//        display.append("  Operating system name\t" + System.getProperty("os.name") + "\n\n" );
//        display.append("  Operating system version\t" + System.getProperty("os.version") + "\n\n" );
//        display.append("  JRE version number\t" + System.getProperty("java.version") + "\n\n" );
//        display.append("  Installation directory for JRE\t" + System.getProperty("java.home") + "\n\n" );