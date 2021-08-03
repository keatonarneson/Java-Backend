public class Week3 {
  public static void main(String[] args) {

    // Step 1
    int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
    
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    // int[] newAges = { 3, 9, 23, 64, 2, 8, 28, 93, 103 };

    // System.out.println(newAges[newAges.length - 1] - newAges[0]);

    int agesSum = 0;

    for (int age : ages) {
      agesSum += age;
    }

    System.out.println("Average of ages = " + agesSum / (double) ages.length);

    // Step 2
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    int nameLengthSum = 0;

    for (String name : names) {
      nameLengthSum += name.length();
    }

    System.out.println("Average number of letters in names = " + nameLengthSum / (double) names.length);

    String nameConcat = "";

    for (String name : names) {
      nameConcat = nameConcat + name + " ";
    }

    System.out.println(nameConcat);

    // Steps 3 & 4
    
    // int[] arr = {1, 2, 3, 4, 5};
    // First element: arr[0];
    // Last element: arr[arr.length - 1];

    // Steps 5 & 6
    int[] nameLengths = new int[names.length];

    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }

    int lengthSum = 0;

    for (int length : nameLengths) {
      lengthSum += length;
    }

    System.out.println("Sum of all name lengths = " + lengthSum);

    // Testing methods
    // System.out.println(wordConcat("Hello", 3));
    // System.out.println(fullName("Keaton", "Arneson"));
    // int[] testArr = {60, 41};
    // System.out.println(arrGreaterOneHundred(testArr));
    // double[] testArr = {20.5, 50.0, 122.1};
    // System.out.println(averageArr(testArr));
    // double[] testArr1 = {10.0, 20, 30};
    // double[] testArr2 = {5, 11.5, 5};
    // System.out.println(isFirstArrBigger(testArr1, testArr2));
    // System.out.println(willBuyDrink(true, 10));
    // System.out.println(getAreaRectangle(5.5, 2));
    }

    // Step 7
    public static String wordConcat(String word, int n) {
      String wordConcat = "";
     
      for (int i = 0; i < n; i++) {
        wordConcat += word;
      }

      return wordConcat;
    }

    // Step 8
    public static String fullName(String firstName, String lastName) {
      return firstName + " " + lastName;
    }

    // Step 9
    public static boolean arrGreaterOneHundred(int[] arr) {
      int arrSum = 0;

      for (int item : arr) {
        arrSum += item;
      }

      return arrSum > 100;
    }

    // Step 10
    public static double averageArr(double[] items) {
      double sum = 0;

      for (double item : items) {
        sum += item;
      }

      return sum / items.length;
    }

    // Step 11
    public static boolean isFirstArrBigger(double[] firstArr, double[] secondArr) {
      return averageArr(firstArr) > averageArr(secondArr);
    }

    // Step 12
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
      return isHotOutside && moneyInPocket > 10.50;
    }

    // Step 13
    public static double getAreaRectangle(double width, double length) {
      // getAreaRectangle takes in width and length of rectangle and returns the area
      return width * length;
    }
}