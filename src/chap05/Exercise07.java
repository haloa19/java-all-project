package chap05;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		// 일반 for문
		for(int i = 0; i < array.length; i++) {
			max = array[i] > max ? array[i] : max;
		}
		
		// 향상된 for문
		for(int item : array) {
			max = item > max ? item : max;
		}
		
		System.out.println("max: " + max);

	}

}
