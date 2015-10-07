import java.util.Scanner;

public class Fibonacciloop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = 0; /* number for fibonacci,Fn */
		int y; /*result of fibonacci Fn= */ 
		int[] a = new int[101]; // the size of array is 101
		                        // and its from 0 to 100
		System.out.println("Enter n for nth fibonacci");
		if (in.hasNextInt()) // if in has the next integer	
			x = in.nextInt(); // x equals the next integer
		y = fibonacci(x,a); //x for value, a for array
		for (int val:a) // read all the elements of array a
			System.out.println(val);
		System.out.println("The xth fibonacci number is " + y);
	} // end main

	public static int fibonacci(int n, int[] b) {
        b[0] = 0; // the number 0 for fibonacci is 0
		b[1] = 1; // the number 1 for fibonacci is 1
		for (int j = 2; j <= n ; j++)
			b[j] =b[j-1] + b[j-2];
        int returnvalue = b[n];
		return returnvalue;
	} // end of fibonacci
} // end classs