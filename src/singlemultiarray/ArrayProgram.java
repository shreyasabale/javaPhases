package singlemultiarray;

public class ArrayProgram {

	public static void main(String[] args) {
		
		
		int[] A={7,6,3,4};
		int[] B={4,9,7,2};
		int[] C= new int[4];
		 
		for(int i=0;i<C.length;i++){
			C[i]=A[i]+B[i];
		}
		
		System.out.println("The Addition of two array A and B is: ");
		
		for(int i=0;i<C.length;i++){
			System.out.println(C[i]);
		}
	}
}
