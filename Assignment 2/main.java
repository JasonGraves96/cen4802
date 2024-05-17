import java.util.Scanner;

/** Jason Graves
 *  Fibonnaci calculator,
 *  this class calculates a certain number in the fib sequence
 *  change X to what number you want to find.
 */

public class main {
    public static void main(String args[]){
        System.out.println(Fibonacci(10));
        /**
         * @param
         */
    }

    private static int Fibonacci(int x) {
        int result = 0;
        this is an issue?
        int no1=0, no2=1;

        for(int i=0;i<x-1;i++){
            result = no1+no2;

            no1 = no2;
            no2 = result;
        }
        return result;
        /**
         * @result
         */
    }
}
