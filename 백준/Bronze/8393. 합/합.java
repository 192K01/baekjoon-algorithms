import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // n
    int sum = 0;

    // 계산
    for (int i = 1; i <= n; i++){
      sum += i;
    }

    System.out.println(sum); // 결과 출력
  }
}