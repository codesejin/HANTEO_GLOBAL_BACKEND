import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1; // 합계가 0을 만드는 방법은 1가지 (아무 동전도 사용하지 않는 경우)
        // 동전을 사용하여 방법의 수를 업데이트
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];

            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        // 예시 1
        int[] coins1 = {1, 2, 3};
        int sum1 = 4;
        int result1 = coinChange(coins1, sum1);
        System.out.println("입력: 합계 = " + sum1 + ", coins[] = " + Arrays.toString(coins1));
        System.out.println("출력: " + result1);

        // 예시 2
        int[] coins2 = {2, 5, 3, 6};
        int sum2 = 10;
        int result2 = coinChange(coins2, sum2);
        System.out.println("입력: 합계 = " + sum2 + ", coins[] = " + Arrays.toString(coins2));
        System.out.println("출력: " + result2);
    }
}