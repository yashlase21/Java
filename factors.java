import java.util.*;
class factors{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbet :");
		int num = sc.nextInt();
		int cnt = 0;
		 for (int i=2;i<num ;i++) {

		 	if(num%i==0)
		 		cnt++;
		 	System.out.println(num+"is not prime");
		 	
		 }
	}
}