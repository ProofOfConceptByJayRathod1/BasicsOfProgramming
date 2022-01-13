package week1.basicsOfImplementation;
/*Problem

There are
people living in a neighborhood. When in debt, neighbors borrow money from each other to clear their debts. A neighbor has already borrowed money from another neighbor for  times to clear a debt. 

All the neighbors want to clear what they owe each other. Their plan is to clear their debts in such a way that the total number of transactions is minimized because the fee per transaction is very high. For example, if the person pays the person dollars, then the amount of this particular transaction is

. 

You are required to minimize the sum of the transaction amount.

Input format

    First line: Two integers 

and
Next 
lines: Three integers , , and  which means that the person has lent the  person

     amount of dollars

Output format

Print only one integer that represents the minimum sum of the transaction amount.*/
import java.util.Scanner;

class MinimumTransactions {
    public static Scanner in= new Scanner(System.in);
    public static void main(String args[] ) {
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i< m;i++){
            int v = in.nextInt();
            int u = in.nextInt();
            long w = in.nextLong();

            arr[v-1] += w;
            arr[u-1] -= w;
        }
        long minTransection =0;
        for(int i = 0; i<n; i++){
            if(arr[i]>=0){
                minTransection += arr[i];
            }
        }
        System.out.println(minTransection);
    }
}