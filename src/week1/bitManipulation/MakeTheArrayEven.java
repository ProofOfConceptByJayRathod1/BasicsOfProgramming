package week1.bitManipulation;
/*Problem

You are given an array A of N integers. If you make the array whole using the following operation, then what is the minimum number of operations required to make the entire array even?

Note: It can be proved that this is always possible.

Operation

Select an index  

  and perform operation:

P=Ai+Ai+1; Q=Ai-Ai+1;

Ai=P; Ai+1=Q;

Input format

    The first line contains an integer T denoting the number of the test cases.
    In each test case:
        The first line contains an integer N denoting the number of elements in the array.
        The second line contains N space-separated integers of array A.

Output format

For each test case print a single line denoting the minimum number of operations required to make the whole array even.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//import for Scanner and other utility classes
class MakeTheArrayEven {
  public static void main(String args[] ) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int testcase = Integer.parseInt(br.readLine()); //Length of Array
      while(testcase>0){
      int n = Integer.parseInt(br.readLine());
      //Scanner sc = new Scanner(System.in);
      String s= br.readLine(); //Input the number seperated by space
      int[] arr= new int[n];
      String[] s1 = s.split(" ");
    //   long odd=0;
      for(int i=0;i<n;i++)    
          {
               arr[i]=Integer.parseInt(s1[i]);
                //  odd+=(arr[i]&1);
                
          }

         long ans=0,ok=0;

      for(int i=0;i<n;i++){

          if((arr[i]&1)==1){

              ok++;

          }

          else{

              ans+=(ok/2)+2*(ok&1);

              ok=0;

          }

      }

      ans+=(ok/2)+2*(ok&1);

      System.out.println(ans);


      testcase--;}
  }
}
