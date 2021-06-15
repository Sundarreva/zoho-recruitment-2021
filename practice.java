public class practice {
	
	
	public static void main(String arg[]) {
		
		String str = "computer";
		int n = str.length(), j = 0;
		int median = n/2;
		
		if(str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		//logic
		for(int i = 0; i<n; i++) {
			
			for(int k = j; k<n-1; k++)
				System.out.print(" ");
			
			for(j = 0; j <= i; j++) {
				System.out.print(str.charAt( ((median)+j) % n ));
			}
			
			System.out.println();
		}
		
		
	}

}
