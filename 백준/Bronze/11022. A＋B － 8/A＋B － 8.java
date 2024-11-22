import java.util.*;
// Case #x: A + B = C
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int[] A = new int[x];
    int[] B = new int[x];
    int[] C = new int[x];

    // A, B값 입력
    for (int i = 0; i < x; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }

    // A+B=C 계산
    for (int i = 0; i < x; i++) {
      C[i] = A[i] + B[i];
    }

    // 출력
    for (int i = 0; i < x; i++) {
      System.out.printf("Case #%d: %d + %d = %d\n", i+1, A[i], B[i], C[i]);
    }
  }
}