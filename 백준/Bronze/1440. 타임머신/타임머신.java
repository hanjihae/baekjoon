import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == j || j == k || i == k) continue;
                    // 시 01~12 , 분 00~59, 초 00~59
                    if (arr[i] > 0 && arr[i] < 13 && arr[j] >= 0 && arr[j] < 60 && arr[k] >= 0 && arr[k] < 60) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}