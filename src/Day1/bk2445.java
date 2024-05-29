package Day1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bk2445 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i=1; i <= N; i++) {
            for (int j=0; j < i; j++) {
                System.out.print("*");
            }
            for (int k=0; k < 2*(N-i); k++) {
                System.out.print(" ");
            }
            for (int l=0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=N-1; i >= 1; i--) {
            for (int j=0; j < i; j++) {
                System.out.print("*");
            }
            for (int k=0; k < 2*(N-i); k++) {
                System.out.print(" ");
            }
            for (int l=0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
