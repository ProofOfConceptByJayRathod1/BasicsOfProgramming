package week1.recursionAndBacktracking;
/*Problem

You are given two numbers n and k. For each number in the interval [1, n], your task is to calculate its largest divisor that is not divisible by k. Print the sum of these divisors.

Note: k is a prime number.

Input format

    The first line contains an integer T representing the number of test cases that will follow.
    Each test case consists of one line containing two integers n and k.

Output format

The output must contain the answer for each test case on a different line.

Each answer consists of a single integer.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Problem

You are given two numbers n and k. For each number in the interval [1, n], your task is to calculate its largest divisor that is not divisible by k. Print the sum of these divisors.

Note: k is a prime number.

Input format

    The first line contains an integer T representing the number of test cases that will follow.
    Each test case consists of one line containing two integers n and k.

Output format

The output must contain the answer for each test case on a different line.

Each answer consists of a single integer.*/
//import for Scanner and other utility classes
import java.util.*;
class NumberOfDivisors {
	static long recur(long sum,long N,long k){

sum = sum - k*(N*(N + 1)/2) + (N*(N + 1)/ 2);

N = N / k;

if(N<=0) return sum;
else if(N>0) recur(sum,N,k);
return (long) 0;
}
  public static void main(String args[] ) throws Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testcase = Integer.parseInt(br.readLine()); 
    while(testcase>0){
    Scanner sc = new Scanner(System.in);
	  long n=sc.nextLong();
	  long k=sc.nextLong();
	  long sum;
	  sum = (n*(n + 1)) / 2;

		long N = n / k;
while(N > 0)

{

sum = sum - k*(N*(N + 1)/2) + (N*(N + 1)/ 2);

N = N / k;

}

//System.out.println(sum);
System.out.println(recur(sum,N,k));
  
    testcase--;}

  }


}
