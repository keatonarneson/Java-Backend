public class AsteriskLogger implements Logger {

  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");
    
  }

  @Override
  public void error(String error) {
    // length of error + length of 6 asterisks + length of "Error: "
    int strLength = error.length() + 6 + 7;
    StringBuilder asterisks = new StringBuilder();

    for (int i = 0; i < strLength; i++) {
      asterisks.append("*");
    }

    System.out.println(asterisks);
    System.out.println("***Error: " + error + "***");
    System.out.println(asterisks);
  }
  
}
