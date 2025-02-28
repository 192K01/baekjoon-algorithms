import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = new int[9];
    for (int i = 0; i < n.length; i++) {
      n[i] = sc.nextInt();
    }
    int max = Arrays.stream(n).max().getAsInt();
    System.out.println(max);
    for (int i = 0; i < n.length; i++) {
      if (n[i] == max) {
        System.out.println(i+1);
      }
    }
  }
}