import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	int num1,num2;
	char op,error;
	String option;
	System.out.print("Enter number 1 :");
	num1=input.nextInt();
	System.out.print("Enter number 2 :");
	num2=input.nextInt();
	System.out.print("Please enter an operator (+,-,*,/) ");
	option=input.next();
	op=option.charAt(0);
	error=option.charAt(1);

	input.close();
	
	if(op=='+') {	
			
		System.out.format("%d + %d = %d",num1,num2,add(num1,num2));
		}
	else if(op=='-') {
		System.out.format("%d - %d = %d",num1,num2,sub(num1,num2));
	}
	else if(op=='*') {
		System.out.format("%d * %d = %d",num1,num2,mul(num1,num2));
	}
	else if(op=='/') {
		System.out.format("%d / %d = %f",num1,num2,div(num1,num2));
	}
	else {
		System.out.println("Invalid Option!");
	}
}
public static int add(int x, int y) {
	return(x+y);
}
public static int sub(int x, int y) {
	return(x-y);
}
public static int mul(int x, int y) {
	return(x*y);
}
public static double div(int x, int y) {
	return((double)x/y);
}

}
