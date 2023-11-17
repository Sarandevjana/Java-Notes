package Doc.Datatype;

import java.util.Scanner;

public class FindSum { 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between '0' to '1000'");
		int num = s.nextInt();
		
	    int firstDigit = num%10;
	    int remaining = num/10;
	    int SecondDigit = remaining%10;
	    int remainingNum = remaining/10;
	    int thirdDigit = remainingNum%10;
	    int remainingNumber = remainingNum/10;
	    int FourthDigit =remainingNumber%10;
	    int fianlRem= remainingNumber/10;
	    Integer sum = firstDigit + SecondDigit + thirdDigit + FourthDigit;
	    System.out.println("Sum of the number is : " + sum);
	    		
	}
}
