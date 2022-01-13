package week1.basicsOfInputOutput;
/*Problem

You are given two arrays
and . In each step, you can set  if . Determine the minimum number of steps that are required to make all

's equal.

Input format

    First line: 

 
Second line:
Third line:

Output format

Print the minimum number of steps that are required to make all

's equal. If it is not possible, then print -1.

Constraints

Sample input

2
5 6
4 3

Sample output

-1
Sample Input*/
import java.io.InputStreamReader;

import java.io.BufferedReader;
 

class NumberOfSteps {

private static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

private static int task()throws Exception{

int n = Integer.parseInt(sc.readLine());

int a[] = new int[n];

int b[] = new int[n];

String data1[] = sc.readLine().split(" ");

String data2[] = sc.readLine().split(" ");

int min = Integer.MAX_VALUE;


 

for( int i=0; i<n; i++ ){

a[i]=Integer.parseInt(data1[i]);

b[i]=Integer.parseInt(data2[i]);

min = Math.min(a[i],min);

}

int count=0, x=0;

boolean flag=true;


 

for(int j=min; j>=0; j-- ){

flag=true;

for( int i=0;i<a.length;i++ ){

if( b[i]<=0 && a[i]!=j )

{

count=0;

flag=false;

break;

}

else if(b[i]<=0 && a[i]==j )

continue;

else if( a[i]>=j && a[i]>=b[i] && (a[i]-j)%b[i] == 0 ){

x = (a[i]-j)/b[i];

count+=x;

}else{

count=0;

flag=false;

break;

}

}

if(flag)

break;

}

return (flag?count:-1);

}

public static void main(String args[] )throws Exception {

 

System.out.println(task());

}

}