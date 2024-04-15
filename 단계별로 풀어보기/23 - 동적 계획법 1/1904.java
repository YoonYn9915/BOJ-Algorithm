import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    /*

    길이가 N인 이진 수열의 개수는 피보나치 수열과 같다.
    문제의 상황에서 맨 앞에 올 수 있는 타일은 2가지이다.
    00 타일과 1 타일이 앞으로 오는 두가지 경우가 있고 00 타일이 올 경우 00..으로 시작하고, 1 타일이 올 경우 1...로 시작한다.

    이때 '길이가 N인 이진 수열의 개수'를 f(N)이라고 정의한다면 00 타일이 맨 앞에 오는 경우의 가짓수는 f(N-2)가 되고 경우 1 타일의 가짓수는 f(N-1).
    따라서 전체 경우의 수는 f(N) = f(N-1) + f(N-2)

    또한 f(0) = f(1) = 1이므로 피보나치 수열과 같다.
    */


    static Scanner scanner = new Scanner(System.in);

    static int[] dp = new int[1000001];


    public static void main(String[] args) {


        int n = scanner.nextInt();

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        for (int i = 4; i <= 1000000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        System.out.println(dp[n]);

    }


}