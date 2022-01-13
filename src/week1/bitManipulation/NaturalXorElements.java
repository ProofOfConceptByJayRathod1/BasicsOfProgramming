package week1.bitManipulation;
/*Problem

You are given an integer
. To solve the problem, you must find the minimum number of elements that must be removed from the set such that the bitwise XOR of the remaining elements is

.

Input format

    The first line contains an integer 

representing the number of test cases.
The first and only line of each test case contains an integer

    representing the number presented to you.

Output format

For each test case, print a single line.

The first integer
represents the minimum number of elements and you must remove from . Then, space-separated integers follows representing the elements that you have to remove from

.

If there are multiple possible solutions, output the lexicographically largest one. A solution
is lexicographically larger than solution , if where is the smallest index where

. 

It can be proved that in an optimal solution
.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
class NaturalXorElements {
  public static void main(String args[] ) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int testcase = Integer.parseInt(br.readLine()); //Length of Array
      while(testcase>0){

        int xo;

      int totalNumbers = Integer.parseInt(br.readLine());

        switch (totalNumbers % 4) {

            case 0:

                System.out.println("1 " + totalNumbers );

                break;

            

            case 1:
                System.out.println("1 " + 1 );
 

                break;



            case 2:
                System.out.println("2 " + totalNumbers +" " +  (totalNumbers ^ totalNumbers + 1));

                break;



            default:
                System.out.println("0 ");


                break;

        }


//     long ans=Math.min(odd,length-odd);
//   System.out.println(ans);

      testcase--;}
  }
}