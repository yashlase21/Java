class Pattern1{
	public static void main(String[] args) {
		int num = 5;

		for (int i = 1;i<=5;i-- ) {
				for (int j = 1;j<=(5-i) ;j++ ) {
					System.out.print("* ");

					
				}for (int j = 1;j<=i ;j++ ) {
					if (j==1||i==5||i==j) {
						System.out.println("*");
						
					}else {
						System.out.print(" *");
					}
					
					System.out.println();

				}
				
			
		}
	}
	
}