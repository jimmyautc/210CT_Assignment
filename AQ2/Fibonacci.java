import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
			int fib;
			Scanner scanner = new Scanner(System.in);	
			System.out.println("Please input a Number for Fibonacci:");
			fib = scanner.nextInt();
			series(fib);
    }
    public static void series(int count){
        int temp1 = 1;
        int temp2 = 1;
        int current = 1;
        System.out.print("F1 to F"+count+": "+temp1+" , "+temp2);
        count=count-2;
        while(count>0){
            current = temp1+temp2;
            temp1= temp2;
            temp2=current;
            System.out.print(" , "+current);
            count--;
        }
    }
}

