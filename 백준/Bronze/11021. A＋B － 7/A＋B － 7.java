import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트케이스의 개수


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            String str = "Case #" + (i+1) + ": " + sum;
            bw.write(str);
            bw.newLine();
        }

    // BufferedWriter를 플러시하고 닫습니다.
        bw.flush();
        bw.close();

    // BufferedReader를 닫습니다.
        br.close();
    }
}