import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 킹의 위치
        String king = st.nextToken();
        int kingX = king.charAt(0)-'A'+1;
        int kingY = king.charAt(1)-'0';
        // 돌의 위치
        String stone = st.nextToken();
        int stoneX = stone.charAt(0)-'A'+1;
        int stoneY = stone.charAt(1)-'0';
        // 움직이는 횟수
        int n = Integer.parseInt(st.nextToken());
        //          R  L   B  T RT  LT  RB LB
        int[] dx = {1, -1, 0, 0, 1, -1, 1, -1};
        int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};
        for (int i=0; i < n; i++) {
            String move = br.readLine();
            int idx = 0;
            int tmpX = kingX;
            int tmpY = kingY;
            switch (move) {
                case "R": idx = 0; break;
                case "L": idx = 1; break;
                case "B": idx = 2; break;
                case "T": idx = 3; break;
                case "RT": idx = 4; break;
                case "LT": idx = 5; break;
                case "RB": idx = 6; break;
                case "LB": idx = 7; break;
            }
            tmpX += dx[idx];
            tmpY += dy[idx];
            // 킹과 돌의 위치가 체스판 범위 안에 있는지 확인
            if (tmpX >= 1 && tmpX <= 8 && tmpY >= 1 && tmpY <= 8) {
                if (tmpX == stoneX && tmpY == stoneY) {
                    if (stoneX+dx[idx] >= 1 && stoneX+dx[idx] <= 8 && stoneY+dy[idx] >= 1 && stoneY+dy[idx] <= 8) {
                        stoneX += dx[idx];
                        stoneY += dy[idx];
                    } else {
                        continue;
                    }
                }
                kingX = tmpX;
                kingY = tmpY;
            }
        }
        king = Character.toString((char)(kingX+'A'-1)) + kingY;
        stone = Character.toString((char)(stoneX+'A'-1)) + stoneY;

        System.out.println(king);
        System.out.println(stone);
    }
}