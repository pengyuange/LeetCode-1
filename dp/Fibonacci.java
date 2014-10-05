package Algorithms.dp;

import java.util.ArrayList;

/*************************************************************************
 *  Compilation:  javac Fibonacci.java
 *  Execution:    java Fibonacci N
 *
 *  Computes and prints the first N Fibonacci numbers.
 *
 *  WARNING:  this program is spectacularly inefficient and is meant
 *            to illustrate a performance bug, e.g., set N = 45.
 *
 *
 *   % java Fibonacci 7
 *   1: 1
 *   2: 1
 *   3: 2
 *   4: 3
 *   5: 5
 *   6: 8
 *   7: 13
 *
 *   Remarks
 *   -------
 *    - The 93rd Fibonacci number would overflow a long, but this
 *      will take so long to compute with this function that we
 *      don't bother to check for overflow.
 *
 *************************************************************************/
public class Fibonacci {
	public static long fib(int n) {
		//System.out.println("Enter rec once.");

		if (n <= 2) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);
	}
	
	public static ArrayList<Integer> fibDp(int n) {
	    ArrayList<Integer> ret = new ArrayList<Integer>();
	    
	    // We use the arrayList to store the result to avoid multiply count.
	    for (int i = 0; i < n; i++) {
	        if (i <= 1) {
	            ret.add(1);
	        } else {
	            ret.add(ret.get(i - 1) + ret.get(i - 2));
	        }
	    }
	    
	    return ret;
    }

	public static void main(String[] args) {
		int N = 5;

		System.out.print(fib(5) + " ");
//		for (int i = 1; i <= N; i++) {
//			System.out.print(fib(i) + " ");
//		}
		
		ArrayList<Integer> list = fibDp(500);
		System.out.println(list.toString());
	}

}
