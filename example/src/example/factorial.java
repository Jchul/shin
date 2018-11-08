package example;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int n = 0;
		int n2 = 0;
		int result = 0;
		int result2 = 0;
		for (n = 1; n <= 10000; n++) {
			if (a % n == 0 && b % n == 0) {
				result = n;
			}
		}
		System.out.println("최대공약수 : " + result);

		for (n = 1; n <= 10000; n++) {
			for (n2 = 1; n2 <= 10000; n2++) {
				if (a * n == b * n2) {
					result2 = n * a;
					break;
				}
			}
			if (result2 != 0)
				break;
		}
		System.out.println("최소공배수 : " + result2);
	}

}