package week1.basicsOfInputOutput;
/*Problem

You are required to enter a word that consists of 
 and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 

.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

    First line: A word that starts with several Zs and continues by several Os.
    Note: The maximum length of this word must be 

    .

Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.*/
import java.util.*;

import java.util.Scanner;
class Zoos {
    public static void main(String args[] ) throws Exception {


         Scanner sc=new Scanner(System.in);

        String s = sc.next();

        int z=0;int o=0;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='z'){z++;}

            else{z=z;}

            if(s.charAt(i)=='o'){o++;}

            else{o=o;}

        }

        if(2*z==o){System.out.println("Yes");}

        else{System.out.println("No");
    }
}
}
