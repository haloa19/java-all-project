package algorithm_pgms;

/*
 * 프로그래머스 > 코딩테스트 연습 > 동적계획법 > 등굣길 (커밋TEST 12345678) 
 * [주의]
 * 1) 1,000,000,007 로 나눈 나머지를 리턴하라?????
 *    => 가지수가 int형을 벗어나므로 모듈러 법칙 필요 ((A + B) % C = ((A % C) + (B % C)) % C)
 * 2) 문제에서 행과 열의 값을 반대로 줌 (확인중)
 * */
public class Lessons_42898 {

	public static void main(String[] args) {
		int m = 3;
		int n = 4;
		int puddles[][] = {{2, 2}};
		int dp[][] = new int[n][m];
		int answer = 0;
		
		for(int[] tmp : puddles) {
			int i = tmp[0];
			int j = tmp[1];
			dp[i-1][j-1] = -1;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i == 0 && j == 0) {
					dp[i][j] = 1;
					continue;
				}
				if(dp[i][j] == -1) {
					continue;
				}
				if(i == 0) {
					dp[i][j] = dp[i][j-1];
				}else if(j == 0) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = Math.max(dp[i][j-1], 0) + Math.max(dp[i-1][j], 0)%1000000007;
				}
			}
		}
		answer = dp[n-1][m-1];
		System.out.println(answer);
		
	}

}
