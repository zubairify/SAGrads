
public class ArrayDemo {

	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};
		
		System.out.println("Printing array elements using for..loop");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("Printing array elements using for..each loop");
		for (int i : ar) {
			System.out.println(i);
		}
		
		System.out.println("Output of Two-dimension array");
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		for (int r = 0; r < mat.length; r++) {
			for (int c = 0; c < mat[r].length; c++) {
				System.out.print(mat[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Output of Jagged array");
		int[][] jag = {{1,2},{3,4,5},{6,7,8,9}};
		for (int r = 0; r < jag.length; r++) {
			for (int c = 0; c < jag[r].length; c++) {
				System.out.print(jag[r][c] + "\t");
			}
			System.out.println();
		}
	}
}
