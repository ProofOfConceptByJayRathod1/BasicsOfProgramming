package week1.bitManipulation;
import java.util.*;

/*Problem

You are given an integer
such that the XOR of two integers is . In short

(⊕ denotes the bitwise the XOR operation).

Out of all possible pairs of
and

, you must find two integers such that their product is maximum. 

Let us define
as the length of in its binary representation. Then, and

.

Input format 

A single integer representing
(

)

Output format 

Print the maximum product you can achieve under the given conditions.*/

class AXorChallenge {

   public static void main(String args[] ) throws Exception {

 

       // Write your code here

       Scanner sc = new Scanner(System.in);

       int c= sc.nextInt();

 

       int len = (int)(Math.log(c)/Math.log(2));

       int a = (int)Math.pow(2,len)-1;

       int b = a^c;

       System.out.println((long)a*(long)b);

   }

}