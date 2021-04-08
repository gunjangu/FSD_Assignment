
public class Third {

	public static void main(String[] args) {
	        int age = 21;
	        if(age > 20){
	            System.out.println("Eligible for voting");
	        }else{
	            System.out.println("Not Eligible for voting");
	        }

	        int number = 10;
	        if(number%2==0){
	            System.out.println("Even number");
	        }else{
	            System.out.println("Odd number");
	        }

	        System.out.println((number%2==0?"even": "odd"));


	        /**
	        if-esle-if
	        * */
	        int marks = 40;
	        if(marks < 50){
	            System.out.println("D grade");
	        }
	        else if(marks>=50 && marks <70){
	            System.out.println("C grade");
	        }
	        else if(marks>=70 && marks <90){
	            System.out.println("B grade");
	        }
	        else if(marks>=90 && marks <100){
	            System.out.println("A grade");
	        }
	        else{
	            System.out.println("Fail");
	        }

	        /**
	         * nested if-else
	         * */
	        int num1 = 50;
	        int num2 = 20;
	        if(num1>=10){
	            if(num2>=20){
	                System.out.println("a and b are greater");
	            }else{
	                System.out.println();
	            }
	        }else{

	        }


	}

}
