package week1.basicsOfInputOutput;
/*

 Problem

You are given a table with
rows and

columns. Each cell is colored with white or black. Considering the shapes created by black cells, what is the maximum border of these shapes?

A shape is a set of connected cells. Two cells are connected if they share an edge. Note that no shape has a hole in it.

Input format

    The first line contains 

 denoting the number of test cases.
The first line of each test case contains integers 
 denoting the number of rows and columns of the matrix. Here, '#' represents a black cell and '.' represents a white cell. 
Each of the next 
lines contains

    integers.

Output format

Print the maximum border of the shapes.
 
 */


import java.util.*;

class MaximumBorder{

public static void main(String args[] ) throws Exception {

Scanner scanner=new Scanner(System.in);     

        int t=scanner.nextInt();

        scanner.nextLine();

        while(t > 0) {

            int maxBorder=0;

            int n=scanner.nextInt();    //rows

            int m=scanner.nextInt();    //columns

            scanner.nextLine();

 

            //Using 2d array [row][column]

            char[][] str=new char[n][m];

            

            for(int i=0;i<n;i++) {

                String s=scanner.nextLine();

                char []colArr=s.toCharArray();

                

                for(int j=0;j<m;j++) {

                    str[i][j]=colArr[j];

                }

            }            

//          counting borders

            for(int i=0; i<n;i++) {

                int count=0;

                for(int j=0;j<m;j++) {

                    if(str[i][j]=='#') {

                        count++;

                        try{

                            for(int l=1;i<n;l++) {                                

                                if(str[i+l][j]=='#') {

                                    str[i+l][j]='$';

                                }else {

                                    break;

                                }

                            }                            

                        }catch(ArrayIndexOutOfBoundsException e) {

                            continue;

                        }                        

                    }

                }

                if(count>=maxBorder) {

                    maxBorder=0;

                    maxBorder+=count;

                }

            }          

            System.out.println(maxBorder);          

            t--;

        }

}

}

