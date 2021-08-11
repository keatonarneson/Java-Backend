public class SpacedLogger implements Logger {

  @Override
  public void log(String log) {
    String logSpaces = log.replace("", " ").trim();
    System.out.println(logSpaces);
  }

  @Override
  public void error(String error) {
    String errorSpaces = error.replace("", " ").trim();
    System.out.println("ERROR: " + errorSpaces);
  }
  
}
