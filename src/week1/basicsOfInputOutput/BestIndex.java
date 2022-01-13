package week1.basicsOfInputOutput;
/*
 Problem

You are given an array
of elements. Now you need to choose the best index of this array

. An index of the array is called best if the special sum of this index is maximum across the special sum of all the other indices.

To calculate the special sum for any index
, you pick the first element that is and add it to your sum. Now you pick next two elements i.e. and and add both of them to your sum. Now you will pick the next

elements and this continues till the index for which it is possible to pick the elements. For example:

If our array contains
elements and you choose index to be then your special sum is denoted by -
, beyond this its not possible to add further elements as the index value will cross the value

.

Find the best index and in the output print its corresponding special sum. Note that there may be more than one best indices but you need to only print the maximum special sum.

Input
First line contains an integer
as input. Next line contains space separated integers denoting the elements of the array .
Output
In the output you have to print an integer that denotes the maximum special sum
 */
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.StringTokenizer;

class BestIndex {

public static void main(String args[] ) throws Exception {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int n = Integer.parseInt(br.readLine());

StringTokenizer st = new StringTokenizer(br.readLine());

int[] arr = new int[n];

for(int i=0; i<n; i++) {

arr[i] = Integer.parseInt(st.nextToken());

}

long max = Long.MIN_VALUE;

for(int i=0; i<arr.length; i++) {

long sum = 0;

int left = arr.length-i;

int vo = 1;

int k = i;

while(left>0) {

for(int j=0; j<vo; j++) {

sum += (long)arr[k++];

}

vo++;

left -= vo;

}

if(max<sum) max = sum;

}

System.out.println(max);

}

}


