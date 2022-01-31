package week3.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> list = new ArrayList<>();
        // if size of array is less than 3 then return empty list as no triplet is possible
        if (a.length < 3) {
            return list;
        }
        Arrays.sort(a);
        // we will be using 3 pointer approach
        // a[i] will be the first pointer which won't move
        // low and high
        // should satisfy the equation b + c = -a
        // so if a[low] + a[high] = -a[i] <--- then this is the triplet
        // validation and checks
        // 1. a[i] shouldn't be same as a[i-1]
        // 2. similarly a[low], a[low+1] and a[high], a[high+1] shouldn't be same once triplet is found
        for (int i = 0; i < a.length - 2; i++) {
            int num1 = a[i];
            if (i == 0 || (num1 != a[i - 1])) {
                int low = i + 1, high = a.length - 1;
                while (low < high) {
                    int num2 = a[low];
                    int num3 = a[high];
                    if ((num2 + num3) == -num1) {
                        list.add(Arrays.asList(num1, num2, num3));

                        while (low < high && a[low + 1] == num2) {
                            low++;
                        }
                        while (low < high && a[high - 1] == num3) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if ((num2 + num3) < -num1) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return list;
    }
}