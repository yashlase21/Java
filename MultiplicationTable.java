import java.util.*;
class MultiplicationTable{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Multiplication Table of " + number + ":");
		for (int i = 1;i<=10 ;i++ ) {
			 System.out.println(number + " x " + i + " = " + (number * i));
		}

	}
}