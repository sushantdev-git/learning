package operator_and_for_loop;

public class Break_keyword {
	
	public static void main(String x[]) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<=n; j++) {
				
				if(i==j) {
					break;//here break will stop the j for loop only
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		while(i <= n) {
//			if(i==4) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("Outside while");
//		
//		
//		for(int j=0; j<=n; j++) {
//			if(j== 2) {
//				break;
//			}
//			
//			System.out.println(j);
//		}
	}

}
