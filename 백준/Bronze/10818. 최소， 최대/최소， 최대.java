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
        OptionalInt max = Arrays.stream(nums).max();
        OptionalInt min = Arrays.stream(nums).min();
        if (max.isPresent() && min.isPresent())
            System.out.printf("%d %d", min.getAsInt(), max.getAsInt());
        else
            System.out.print("error!");
    }
}