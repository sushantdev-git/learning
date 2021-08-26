package cp;
import java.util.*;
public class Tic_tac_toe {
	
	static Scanner sc = new Scanner(System.in);
    
    static String[][] Transpose(String[][] mat){
    	
    	print(mat);
    	
    	String[][] mat_t = new String[3][3];
    	
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			mat_t[i][j] = mat[j][i];
    		}
    	}
    	
    	
    	
    	return mat_t;
    }
    
    static String[][] makeMat(){
        String[][] mat = new String[3][3];
        for(int i=0; i< 3; i++){
            mat[i] = sc.nextLine().split(""); 
        }
        return mat;
    }
    
    static void print(String[][] mat) {
    	for(String[] i:mat) {
    		for(String j:i) {
    			System.out.print(j+" ");
    		}
    		
    		System.out.println();
    	}
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		
		
		int n=sc.nextInt();
		for (int i=0; i<n; i++){
		   String mat[][] = makeMat();
//		   System.out.print(mat.length);
		   Transpose(mat);
		}
		
		sc.close();
		
	}
	
}
