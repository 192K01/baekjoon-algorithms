import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int star_num = sc.nextInt();

    for (int i = 0; i < star_num; i++) {
      for (int j = 0; j < i+1; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}