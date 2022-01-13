package week1.basicsOfImplementation;
/*It's 12 o'clock at midnight

and Simon cannot sleep! So he decided to stare at the clock on his wall until he falls asleep.

He saw the clock's hands and got to thinking 'How many times they'll pass each other until I fall asleep'. Imagine that he fell asleep at 
. Now, you must  figure out how many times clock's hands overlap from  to  (including  and 

).

You can see an overlap in the provided picture.

Note: His clock only has an hour and minute hands.

Input format

The first and only line you will get a time in the

 format.

Output format

Print the number of times that the hour and minute hands pass each other from 
 to .*/
import java.util.Scanner;




class SimonCannotSleep {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner (System.in);

String [] time = sc.nextLine().split(":");


 

int hh = Integer.parseInt(time[0]);

int mm = Integer.parseInt(time[1]);


 

int N = (11*(hh*60+mm))/(12*60); // N = (hh-hh/12) 

System.out.print(N+1);

}

}