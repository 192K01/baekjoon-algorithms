import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> result = new ArrayList<>();
    while (true) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      if (A == 0 && B == 0)
        break;
      result.add(A+B);
    }
    for (int num : result) {
      System.out.println(num);
    }
  }
}