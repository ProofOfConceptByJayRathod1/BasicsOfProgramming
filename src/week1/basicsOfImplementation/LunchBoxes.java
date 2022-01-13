package week1.basicsOfImplementation;
/*Problem

Alice works as a restaurant manager. The restaurant has prepared
lunch boxes and Alice plans to distribute them to some schools. Consider that there are  schools and an  school orders

 lunch boxes.

She wants to distribute lunch boxes to as many schools as possible. Also, she has the following rule:

    For an 

 school, she gives either zero or 

     lunch boxes

Your task is to help Alice to determine the maximum number of schools that can get lunch boxes.

Input format    

    The first contains an integer 

 that denotes the number of test cases in the input.
Each test case consists of two lines:

    The first line contains two integers 

 and
.
The second line contains
 integers 

        .

Output format

For each test case, you are required to print one integer that represents the maximum number of schools that can receive lunch boxes.*/
import java.util.*;

class LunchBoxes {

public static void main(String args[] ) throws Exception {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
for(int i=0;i<t;i++){
int N=s.nextInt();
int M=s.nextInt();
List<Integer> lunchBoxes=new ArrayList<Integer>();
for(int j=0;j<M;j++){
int Ai=s.nextInt();
lunchBoxes.add(Ai);
}
Collections.sort(lunchBoxes);
int count=0;
int schoolsGot=0;
for(int k=0;k<lunchBoxes.size();k++){
if((schoolsGot+lunchBoxes.get(k)) <=N){
count++;
schoolsGot+=lunchBoxes.get(k);
}
}
System.out.println(count);
}
}//end of main
}//end of class TestClass