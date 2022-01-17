package week2.arrays;

import java.util.*;


/*Problem

You are given an array
 consisting of positive integers. Your task is to find an array of length

satisfying the following conditions:

for all
, for all
is divisible by for all

    is minimum

You are given

test cases.

Input format

    The first line contains a single integer 

denoting the number of test cases.
The first line of each test case contains a single integer 
denoting the length of the array.
The second line of each test case contains
space-separated integers denoting the integer array

    .

Output format

For each test case (in a separate line), print
space-separated integers denoting . If there are multiple answers, you can print any of them. It is guaranteed that under the given constraints at least 1 exists.*/

class NonDecreasingArrays {

    public static void main(String args[])throws Exception {

        //Scanner

        Scanner s =new Scanner(System.in);

        long t;

        t = s.nextInt();


 

        while(t-->0){

            StringBuilder sb =new StringBuilder();

            int n, i,j,k;

            n = s.nextInt();

            

            long[] a =new long[n];

            long[] b =new long[n];

            long r,d;


 

            for(i=0;i<n;i++){

                a[i]= s.nextLong();


 

                if(i==0)

                    b[i]= a[i];

                else if(a[i]>= b[i-1])

                    b[i]= a[i];

                else

                    {

                        r = b[i-1]% a[i];

                        d = r ==0?0: a[i]- r;

                        b[i]= b[i-1]+ d;

                    }

            }


 

            for(i=0;i<n;i++)

                sb.append( b[i]+" ");

            System.out.println(sb.toString());  

        }

        

    }

}