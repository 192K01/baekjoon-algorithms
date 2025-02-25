import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 바구니의 개수 N과 변경 횟수 M 입력
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 바구니 배열 생성 및 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        // 바구니 순서 변경
        for (int m = 0; m < M; m++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;

            // start부터 end까지의 바구니 순서 역순으로 변경
            while (start < end) {
                int temp = baskets[start];
                baskets[start] = baskets[end];
                baskets[end] = temp;
                start++;
                end--;
            }
        }

        // 바구니의 순서 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
