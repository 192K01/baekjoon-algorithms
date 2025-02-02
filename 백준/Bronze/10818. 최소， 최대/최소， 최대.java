import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수의 개수 N
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]= sc.nextInt();
        }
        sc.close();

        // 최대 구하기
        int max = nums[0];
        for (int num : nums) {
            if (num > max)
            max = num;
        }
        // 최소 구하기
        int min = nums[0];
        for (int num : nums) {
            if (num < min)
                min = num;
        }
        System.out.printf("%d %d", min, max);
    }
}