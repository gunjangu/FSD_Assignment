import java.util.*;
public class reversearray {
	static void reversearray(int arr[],int n) {
		 int[] b = new int[n];
	        int j = n;
	        for (int i = 0; i < n; i++) {
	            b[j - 1] = arr[i];
	            j = j - 1;
	        }
	        System.out.println("Reversed array is: \n");
	        for (int k = 0; k < n; k++) {
	            System.out.println(b[k]);
	        }
	    }
		
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements: ");
		for(int i =0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Elements are: ");
		for(int i =0; i<n;i++) {
			System.out.println(a[i]);	
		}
		System.out.println();  
		
		reversearray(a,n);
	}

}
