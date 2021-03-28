import java.util.Scanner;

public class ColoringTrees {

	static int n, m, k;
	static int[] tree;
	static int[][] p;
	public static long sol(int n, int color, int gC, long[][][] dp) {

		if (gC > k) {
			return 100000000000000L;
		}

		if (n == 0) {
			if (gC == k) {
				return 0;
			}

			return 100000000000000L;
		}
		
		if(dp[n][color][gC] != -1) {
			return dp[n][color][gC];
		}
		
		long ans = 100000000000000L;
		if (tree[n - 1] != 0) {
			ans = sol(n - 1, tree[n - 1], gC + (tree[n - 1] == color ? 0 : 1), dp);
		} else {
			for (int c = 1; c <= m; c++) {
				ans = Math.min(ans, p[n - 1][c - 1] + sol(n - 1, c, gC + (c == color ? 0 : 1), dp));
			}
		}

		return dp[n][color][gC] = ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		m = s.nextInt();
		k = s.nextInt();

		tree = new int[n];
		for (int i = 0; i < n; i++) {
			tree[i] = s.nextInt();
		}

		p = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				p[i][j] = s.nextInt();
			}
		}
		
		long[][][] dp = new long[n + 1][m + 1][k + 1];
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= m; j++) {
				for(int l = 0; l <= k; l++) {
					dp[i][j][l] = -1;
				}
			}
		}

		System.out.println(sol(n, 0, 0, dp) == 100000000000000L ? -1 : sol(n, 0, 0, dp));
	}

}
