package week1.bitManipulation;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.*;


/*Problem

You are given an array of integers. The special property of the array is that exactly two different elements occur once while other elements occur twice.

You are required to determine those two elements.

Input format

    First line: Integer 

 denoting the number of elements in the array
Second line: 

     space-separated integers denoting the values in the array

Output format

Print two space-separated integers that occur once in the array in ascending order.*/

class DeterminingNumbers {

public static void main(String args[] ) throws Exception {

 

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

StringBuilder sb = new StringBuilder();

String name = br.readLine();

int n = Integer.parseInt(name);

String[] arr = br.readLine().split(" ");

int a =0;

Map<Integer,Boolean> m = new TreeMap<Integer,Boolean>();

 

for(int i = 0;i < n;i++)

{

a = Integer.parseInt(arr[i]);

if(m.containsKey(a))

{

m.put(a, false);

}

else

{

m.put(a, true);

}

}

for (Integer i : m.keySet()) {

if(m.get(i))

System.out.print(i+" ");

}}

}