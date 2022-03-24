package matrices;

public class Matrices {
	public static void main(String[] args) 
	{
		int r1 = 2, c1 = 3;
	    int r2 = 3, c2 = 2;
	    int[][] Matrix1 = { {3, -3, 2}, {2, 0, 4} };
	    int[][] Matrix2 = { {2, 4}, {-9, 4}, {4, 0} };
	    int[][] product = Matrices(Matrix1, Matrix2, r1, c1, c2);
	    displayProduct(product);
	 }

	public static int[][] Matrices(int[][] Matrix1, int[][] Matrix2, int r1, int c1, int c2) 
	{
	    int[][] product = new int[r1][c2];
	    for(int i = 0; i < r1; i++) 
	    {
	        for (int j = 0; j < c2; j++) 
	        {
	             for (int k = 0; k < c1; k++) 
	             {
	                  product[i][j] += Matrix1[i][k] * Matrix2[k][j];
	             }
	         }
	    }
	    return product;
	}
	public static void displayProduct(int[][] product) 
	{
	    System.out.println("Product of two matrices is: ");
	      	for(int[] row : product) 
	      	{
	            for (int column : row) 
	            {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	}

}
