package week2.arrays;

import java.util.*;

/*You will be given a matrix A of integers and K add operations to execute. An add operation adds a constant to all of the entries in a square sub-matrix of A and it is specified by 4 integers and D where R is the row number, C is the column number, S is the size of the sub-matrix and D is the constant to add to the entries. The entry at row R and column C is denoted by

. The row and column numbers in a query correspond to the upper-left corner of the square sub-matrix to update.

Your task it to print the matrix after applying all of the K add operations.

Input:

The first line of input contains three numbers
representing the number of rows, the number of columns and the number of add operations respectively. N lines follow each containing M space-separated integers. K lines follow each containing four numbers

and D as described above.

Output:

Print the matrix after applying all of the K add operations. The matrix should be printed on N lines each containing M space-separated integers.*/


class SubmatrixUpdates{

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


 

try{


 

Scanner scanner = new Scanner(System.in);


 

int N = scanner.nextInt();


 

int M = scanner.nextInt();


 

int K = scanner.nextInt();


 

 


 

int arr[][] = new int[N][M];


 

for(int i=0;i<N;i++){

 

for(int j=0;j<M;j++){

if(scanner.hasNextInt()){


 

arr[i][j] = scanner.nextInt();

}

}


 

}

 


 

for(int m=0;m<K;m++){

 


 

int R = scanner.nextInt();

int C = scanner.nextInt();


 

int S = scanner.nextInt();


 

int D = scanner.nextInt();

 

for(int i=R-1;i<R+S-1;i++){



 

for(int j=C-1;j<C+S-1;j++){


 

arr[i][j]+=D;

}

}

 


 

 

}



 

 



 

for(int i=0;i<arr.length;i++){



 

for(int j=0;j<arr[0].length;j++){


 

System.out.print(arr[i][j]+" ");

}

System.out.println();

}


 

}

catch(Exception e){

return;

}



 

}

}


