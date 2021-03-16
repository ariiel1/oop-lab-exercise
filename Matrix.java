public class Matrix {
	  public static void main(String[] args){
		  System.out.println("Multiplication:");
		  
		  int m1[][] = {{3,6},{7,2}};
		  int m2[][] = {{1,3},{8,0}};
		    
		  int m3[][] = new int[2][2];
		    
		  for(int i=0;i<2;i++){
		    for(int m=0; m<2 ;m++){
		    	m3[i][m] = 0;
		    	for(int n=0; n<2; n++) {
		    		 m3[i][m] += m1[i][n] * m2[n][m];
		        }
		    	System.out.print(m3[i][m] + " ");
		      }
		    System.out.println();
		    }

		    System.out.println("Dot Product: ");

		    int d1[] = {3,7,3};
		    int d2[] = {8,3,1};
		    int sum = 0;

		    for(int j=0;j<3;j++){
		      sum += d1[j]*d2[j];	      
		    }
		    System.out.println(sum);
		  }
}
