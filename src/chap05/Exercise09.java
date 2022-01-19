package chap05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				if(scores != null) {
					for(int i = 0; i < studentNum; i++) {
						System.out.println("scores[" + i + "]> ");
						scores[i] = scanner.nextInt();
					}
				} else {
					System.out.println("학생수를 먼저 입력하세요!");
				}
			} else if(selectNo == 3) {
				if(scores != null) {
					for(int i = 0; i < studentNum; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);
					}
				} else {
					System.out.println("학생수를 먼저 입력하세요!");
				}
			} else if(selectNo == 4) {
				int maxNum = 0;
				double sum = 0;
				for(int item : scores) {
					maxNum = item > maxNum ? item : maxNum;
					sum += item;
				}
				System.out.println("최고 점수: " + maxNum);
				System.out.println("평균 점수: " + Math.round(sum/studentNum*100)/100.0);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
