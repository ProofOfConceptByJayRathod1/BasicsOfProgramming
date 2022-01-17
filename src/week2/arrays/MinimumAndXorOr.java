package week2.arrays;

/*Problem

You are given an array
of  integers. Determine the minimum value of the following expression for all valid 

:

, where 

.

Input format

    First line: A single integer 

 denoting the number of test cases
For each test case:

    First line contains a single integer 

, denoting the size of the array
Second line contains
 space-separated integers 

Output format

For each test case, print a single line containing one integer that represents the minimum value of the given expression*/

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Scanner;

import java.util.StringTokenizer;

import java.util.*;


 

 





 

class MinimumAndXorOr {

 


 

static class FastReader {

BufferedReader br;

StringTokenizer st;

 

public FastReader()

{

br = new BufferedReader(

new InputStreamReader(System.in));

}

 

String next()

{

while (st == null || !st.hasMoreElements()) {

try {

st = new StringTokenizer(br.readLine());

}

catch (IOException e) {

e.printStackTrace();

}

}

return st.nextToken();

}

 

int nextInt() { return Integer.parseInt(next()); }

 

long nextLong() { return Long.parseLong(next()); }

 

double nextDouble()

{

return Double.parseDouble(next());

}

 

String nextLine()

{

String str = "";

try {

str = br.readLine();

}

catch (IOException e) {

e.printStackTrace();

}

return str;

}

}

public static void main(String args[] ) throws Exception {

/* Sample code to perform I/O:

* Use either of these methods for input


 

//BufferedReader

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT


 

//Scanner

Scanner s = new Scanner(System.in);

String name = s.nextLine(); // Reading input from STDIN

System.out.println("Hi, " + name + "."); // Writing output to STDOUT


 

*/


 

// Write your code here

FastReader fr = new FastReader();

int t = fr.nextInt();

while(t-- != 0)

{

int n = fr.nextInt(),min = Integer.MAX_VALUE ;

int arr[] = new int[n];

for(int i = 0; i < n; i++)

{

arr[i] = fr.nextInt();

}

Arrays.sort(arr);

for(int i = 0; i < n - 1; i++)

{

 

int temp = (arr[i] & arr[i+1]) ^ (arr[i] | arr[i+1]);

if(temp < min)

min = temp;


 

 

}

System.out.println(min);

}


 

}

}


