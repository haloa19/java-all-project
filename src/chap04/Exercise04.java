package chap04;

public class Exercise04 {

	public static void main(String[] args) {
		boolean result = true;
		
		while(result) {
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			if((num1 >= 1 && num1 <= 6) && (num2 >= 1 && num2 <= 6)) {
				if(num1 + num2 == 5) {
					result = false;
				}
				System.out.println("(" + num1 + ", " + num2 + ")");
			}
			
		}

	}

}
