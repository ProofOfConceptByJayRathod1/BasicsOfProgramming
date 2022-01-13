package week1.recursionAndBacktracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MovementInArrays {
	static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 };

	static boolean solve(long a[], int start, long moves, long target) {// start is int
		if (moves == 0 && start == target) {
			return true;
		} else if (moves == 0 && start != target) {
			return false;
		}
		if (start < 0 || start > target) {
			return false;
		} else {
			for (int i = 0; i < 12; i++) {
				if (a[start] % primes[i] == 0) {// converted start from long to int
					return (solve(a, start + primes[i], moves - 1, target)
							|| solve(a, start - primes[i], moves - 1, target));
				}
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine()); // Length of Array

		while (testcase > 0) {
			int i;
			int size = Integer.parseInt(br.readLine());
			long a[] = new long[size];
			String s = br.readLine();
			String[] s1 = s.split(" ");
			for (i = 0; i < size; i++) {
				a[i] = Integer.parseInt(s1[i]);

			}

			long m = Long.parseLong(br.readLine());

			if (solve(a, 0, m, size - 1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			testcase--;
		}

	}
}
