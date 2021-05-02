import java.util.Scanner; // We import this line to be able to use the scanning function.

 public class Main {        
	public static void main(String[] args) {  // This line means standart Java main entry point.
	    
    Scanner scan= new Scanner(System.in);  // This expression is neccessary for scanning function to be valid.
   
    System.out.println("\nEnter the lower limit:"); // Tell the user to enter the lower limit of the range.
        int lower=scan.nextInt();      // The next integer taken from user will be assigned to "lower" variable.
    System.out.println("\nEnter the upper limit");  // Tell the user to enter the lower limit of the range.
    int upper=scan.nextInt();          // The next integer taken from user will be assigned to "upper" variable.
    
    System.out.println("All prime numbers from " +lower+" till " +upper +" are: " );
	int i,j;   // These are counter variables for loops.
	int flag;  //we used this as the controlling variable.
  
	if (lower<2)      
	   lower=2; // Even if user enters a number less than 2, counter should begin from 2 as the rule of prime numbers.
	   for(i=lower; i<=upper; i++) { //first for opened
	    flag=1;   // counter variable
	    for(j=2; j<=i/2; j++) {  //second for opened.
	        if (i%j==0) {  // if block opened.
	            flag=0;
	        break;       // if flag ==0, we use break to end the loop.
	        }      // if block closed.
	    
   } // bracket for closing second for. 

	    if(flag==1) {    //last if opening bracket
	     System.out.println(i);
	       
	    }      //last if closing bracket
    }	    // first for closing bracket
	
	
	}   //main void closing bracket
}    // class closing bracket
