public class Week3 {
  public static void main(String[] args) {

    // Step 1 *********************************************************************************
    int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
    
    System.out.println(ages[ages.length - 1] - ages[0]);
    
    // int[] newAges = { 3, 9, 23, 64, 2, 8, 28, 93, 103 };

    // System.out.println(newAges[newAges.length - 1] - newAges[0]);

    int agesSum = 0;

    for (int age : ages) {
      agesSum += age;
    }

    System.out.println("Average of ages = " + agesSum / (double) ages.length);

    // Step 2 ************************************************************************************
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

    // Steps 3 & 4 ************************************************************************************
    
    // int[] arr = {1, 2, 3, 4, 5};
    // First element: arr[0];
    // Last element: arr[arr.length - 1];

    // Steps 5 ************************************************************************************

    

    

    }
}