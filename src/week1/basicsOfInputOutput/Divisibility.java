package week1.basicsOfInputOutput;
/*
 Problem

You are provided an array 
of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by

.

Note: View the sample explanation section for more clarification.

Input format

    First line: A single integer 

 denoting the size of array 
Second line: 

     space-separated integers.

Output format

If the number is divisible by
, then print . Otherwise, print .*/
import java.util.*;

class Divisibility {
    public static void main(String args[] ) throws Exception {

      Scanner sc = new Scanner(System.in);

int n=sc.nextInt();

int a[]=new int[n];

for(int i=0;i<a.length;i++)

a[i]=sc.nextInt();

if(a[n-1]%10!=0)

System.out.println("No");

else

System.out.println("Yes");
    }
}