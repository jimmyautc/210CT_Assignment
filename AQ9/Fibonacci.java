import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
			int fib;
			Scanner scanner = new Scanner(System.in);	
			System.out.println("Please input a Number for Fibonacci:");
			fib = scanner.nextInt();
				System.out.print("F1 to F"+fib+": ");			
			
			for(int i=1;i<=fib;i++){
				System.out.print("  "+series(i));
			}
		
    }
    public static int series(int fib){

		if (fib==0 || fib==1){
			return fib;
		}
		else{
			return series(fib-1) + series(fib-2) ;
		}
    }
}

