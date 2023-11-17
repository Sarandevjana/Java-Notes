package Doc.Datatype;

import java.util.Scanner;

public class Squares {
  public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter a Number"); 
	   int square = s.nextInt();
	   System.out.println("square is :" + Math.pow(square, 2));
	   System.out.println("Cube is : " + Math.pow(square, 3));
	   System.out.println("power Fourth is " + Math.pow(square, 4));
}
  
}
