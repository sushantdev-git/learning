package operator_and_for_loop;

public class Continue_keyword {
	
	public static void main(String x[]) {
		
		int i=1;
		int n=5;
		while(i <= n) {
			i++;
			if(i == 4) {
				continue;//here 4 will be skipped
				//if you use continue you go back to beginning of the loop
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int j=0; j<=n ;j++) {
			if(j==4) {
				continue;
			}
			System.out.print(j+" ");
		}
	}

}
