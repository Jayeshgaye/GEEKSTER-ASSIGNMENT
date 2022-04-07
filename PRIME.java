package aprilpre;
import java.util.Scanner;
public class PRIME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number");
      int num = sc.nextInt();
      int i=2;
      while(i<num)
      {
    	  if (num%i==0)
    		  break;
    	  i++;
    			  
      }
      if (num==i)
    	  System.out.print("It is a prime number");
    	  else
    		  System.out.print("It is a not prime number");  
	}

}