public class App {
    public static void main(String[] args) throws Exception {

        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        System.out.println(); //just for formatting purposes
        asteriskLogger.log("Asterisk");
        System.out.println(); //just for formatting purposes
        asteriskLogger.error("Logger");

        System.out.println(); //just for formatting purposes

        spacedLogger.log("Spaced");
        spacedLogger.error("Logger");

    }
}
