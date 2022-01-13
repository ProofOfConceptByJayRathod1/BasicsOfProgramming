package week1.basicsOfImplementation;
/*Problem

Implement the recursive function given by the following rules and print the last 3 digits:

F(x, y) = {
y + 1 when x = 0,
F(x - 1, 1) when x > 0 and y = 0,
F(x - 1, F(x, y - 1)) when x > 0 and y > 0
}

Input Format
A single line containing two integers X,Y
1 <= X,Y <= 100000

Output Format
The last three digits

Input Constraints
X and Y are non-negative integers. Problem Setter: Practo Tech Team */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
class RecursiveFunction { public static void main(String args[] ) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int x=Integer.parseInt(str.split(" ")[0]);
    int y=Integer.parseInt(str.split(" ")[1]);
    int result=function(x,y);

    System.out.println(result);
}
public static int function(int x,int y)
{
if(x == 0)
    return (y+1)%1000;
 else if(x > 0 && y == 0)
    return (function(x - 1, 1))%1000;
else 
return (function(x - 1, function(x, y - 1)));
}

}