import java.util.*;
public class subarrays {

	public static void main(String[] args) {
		 int[] array = new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
	      int[] subArray = Arrays.copyOfRange(array, 3, 8);
	      System.out.println("Array: ");
	      for(int i = 0; i < array.length; i++) {
	         System.out.print(array[i] + " ");
	      }
	      System.out.println("\nSub array: ");
	      for(int i = 0; i < subArray.length; i++) {
	         System.out.print(subArray[i] + " ");
	      }

	}

}
