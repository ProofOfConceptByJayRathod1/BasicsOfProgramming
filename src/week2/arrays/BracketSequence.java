package week2.arrays;
/*Problem

A bracket sequence is a string that contains only characters '(' and ')'.

A correct bracket sequence is a bracket sequence that can be transformed into a correct arithmetic expression by inserting characters '1' and '+' between the original characters of the sequence. For example, bracket sequences '()()' and '(())' are correct. The resulting expressions of these sequences are: '(1)+(1)' and '((1+1)+1)'. However, '(', ')(', and '(' are incorrect bracket sequences. 

You are given a bracket sequence
, where  denotes the type of 's bracket (open or close). It is not mandatory that  is necessarily correct. Your task is to determine the number of 's such that 

 is a correct bracket sequence.

Input format

The single line contains sequence 

.

Output format 

Print the number of shifts denoting the correct bracket sequence.*/
import java.util.*;

class BracketSequence

{

  public static void main(String[] args)

  {

    Scanner sc=new Scanner(System.in);

    String s=sc.next();

    char ch[]=s.toCharArray();

    int flag,c=0,i,j,n=ch.length;

    for(i=0;i<n;i++)

      {

        flag=0;

        if(ch[i]==')')

          continue;

        for(j=i;j<i+n;j++)

        {

          if(ch[(j%n)] == '(' )

            flag++;

          else

            flag--;

         if(flag<0)

           break;

       }

       if(flag==0)

         c++;

     }

     System.out.println(c);

  }

}