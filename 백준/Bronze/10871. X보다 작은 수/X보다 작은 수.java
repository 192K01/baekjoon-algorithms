import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수의 개수 N
        int X = sc.nextInt(); // X보다 작은 수
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]= sc.nextInt();
        }
        sc.close();

        List<Integer> lowX = new ArrayList<>();
        for (int num : nums) {
            if (num < X)
                lowX.add(num);
        }
        for (int i : lowX) {
            System.out.println(i);
        }
    }
}