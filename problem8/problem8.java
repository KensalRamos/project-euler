import java.io.*;
import java.util.*;

class Main {
  
  public static void main(String[] args) {

    Scanner scanner;
    int lowBound, highBound;
    long maxProduct = 0;
    long tempProduct = 1;

    try {
      scanner = new Scanner(new File("input.txt"));
    } catch (Exception e) {
      System.out.println("Exception: ");
      e.printStackTrace();
      return;
    }

    char[] numArr = scanner.next().toCharArray();

    for (int i = 0; i < 988; i++) {

      tempProduct = 1;
      lowBound = i;
      highBound = i + 12;

      for (int j = lowBound; j <= highBound; j++) {
        if (numArr[j] == '0') {
          i = j;
          tempProduct = 0;
          break;
        }

        tempProduct *= Integer.parseInt(String.valueOf(numArr[j]));
      }

    if (tempProduct > maxProduct)
      maxProduct = tempProduct;

    }

    System.out.println("Max product is: " + maxProduct);
    scanner.close();
  } 

}