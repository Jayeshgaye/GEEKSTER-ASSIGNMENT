package aprilpre;

public class greatest_no {
	public static void main(String[] args) {
		int num1=25;
		int num2=50;
		int num3=75;
		if (num1>=num2 && num1>=num3)
			System.out.print(num1);
		else if (num2>num1 && num2>num3)
		    System.out.print(num2);
		else 
				System.out.print(num3);
		
	}
}
