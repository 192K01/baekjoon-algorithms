import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정수의 개수 N
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i]= sc.nextInt();
        }
        int v = sc.nextInt();
        sc.close();

        int vNum = 0;
        for (int num : nums) {
            if (num == v)
                vNum++;
        }
        System.out.println(vNum);
    }
}