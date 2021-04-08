
public class fifth {

	public static void main(String[] args) {
		  for(int i=0;i<10;i++){
	            System.out.println(i);
	        }

	        /**
	         * nested for loop
	         * */
	        for(int i=0;i<5;i++){
	            for(int j=0;j<5;j++){
	                System.out.println(i +" - "+j);
	            }
	        }
	        /**
	         * Pyramid
	         * */
	        System.out.println("---------------------------------------------------------");
	        for(int i=0;i<5;i++){
	            for(int j=0; j<=i;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}

}
