import java.util.*;
class sum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();
		int sum = 0;

		while(num>0){


			int temp = num%10;
			sum = temp+sum;
			num = num/10;
		}
		System.out.print(sum);
	}
}