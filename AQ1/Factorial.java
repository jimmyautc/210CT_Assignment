import java.util.*;
public class Factorial {
    public static void main(String [] args){

        int n;
		int m;
		int fac;
			Scanner scanner = new Scanner(System.in);		
		while(true){       

			System.out.println("Please input a Number for factorial:");
				n = scanner.nextInt();			
			if(n>231){
				System.out.println("The number for factorial must less then 231");							
			}else if(n<0){
				System.out.println("The number for factorial must be non-negative integer");					
			}
			else{
				break;
			}		

		 }
		 while(true){       
			System.out.println("Please input a Number for divide:");
				m = scanner.nextInt();			
			if(m>231){
				System.out.println("The number for divide must less then 231");							
			}else if(m<0){
				System.out.println("The number for divide must be non-negative integer");					
			}
			else{

				break;
			}		

		 }
		fac=factorial(n);
        System.out.println("Factorial of " + n + " is " + fac);		
		if (fac%m == 0){
			System.out.println(m+" can be divide"+n+"!");	
		}
		else{
			System.out.println(m+" can not be divide"+n+"!");			
		}
    }
	public static int factorial(int n){
        int fac=1;
           if (n == 1||n == 0) {
                fac = 1;
            } else if (n < 231) {
                fac = 1;
                for (int i = 1; i <= n; i++) {
                    fac = fac * i;
                }
            }
		return fac;

	}
}