class Pattern3
{
	public static void main(String[] args) {
		int num = 4;
		int a = 1;

		for (int i = 1;i<=num;i++ ) {
				for (int j = 1;j<=i ;j++ ) {
					System.out.print(a++ +" ");
					
				}
				System.out.println();
			
		}
	}
	
}