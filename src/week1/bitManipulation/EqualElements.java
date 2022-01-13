package week1.bitManipulation;
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

/*Problem

You are given an integer array
consisting of elements. You can perform the following operations on array

:

    Choose any element and increase or decrease it by 3 for 1 coin.
    Choose any element and increase or decrease it by 2 for free.

You are required to spend the minimum number of coins in order to make all the elements in array

equal.

Input format

    The first line contains an integer 

denoting the number of test cases. 
The first line of each test case contains an integer
denoting the number of elements in array
.
The second line of each test case contains
space-separated integers of array

    .

Output format

Print
lines. For each test case, print a single line denoting the minimum number of coins to make all elements equal.*/
class EqualElements {
  public static void main(String args[] ) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int testcase = Integer.parseInt(br.readLine()); //Length of Array
      while(testcase>0){
      int length = Integer.parseInt(br.readLine());
      //Scanner sc = new Scanner(System.in);
      String s= br.readLine(); //Input the number seperated by space
      int[] arr= new int[length];
      String[] s1 = s.split(" ");
      long odd=0;
      for(int i=0;i<length;i++)    
          {
               arr[i]=Integer.parseInt(s1[i]);
                 odd+=(arr[i]&1);
          }
//logic here

    long ans=Math.min(odd,length-odd);
  System.out.println(ans);

      testcase--;}
  }
}
