package operator_and_for_loop;

public class For_loop {
	
	public static void main(String args[]) {
			
		//for Loop
		//loop is made up of three thing
		//initialization , condition , loop step(i++)
		int n=10;
		for(int i=0; i<=n; i++) {//here scope of i is only inside for loop
			System.out.print(i+" ");//and if you want to use i after for loop then
			//initialize i before for loop
		}
		
		int x=0;
		for(;x<10;) {
			System.out.print(x+" ");
			x++;//you can remove parts of for loop here for loop is converted into while loop
		}
		
		//for loop variations
		
		for(int j=100,i=1; i<=n && j<=200 ; i++,j+=20) {
			System.out.println(i+" "+j);
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				System.out.println("i "+i+" j "+j);
			}
		}
	}
}
