package Com.Upskill.java_3;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 20, 30, 35, 45, 89, 55, 42 }; // [0], [1], [2], [3], [4],
													// [5], [6]
		int l = x.length;

		// Lat index number 1
		// System.out.println(1);

		// for(int i = 0; i <= l-1; i = i+1) {
		// System.out.println(x[i]);
		// }

		for (int i = l - 1; i >= 0; i = i-1) {
			System.out.println(x[i]);
		}

	}
}
