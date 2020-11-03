//optimized Euclidean Algorithm to find GCD or HCF..
package GFG;

import java.util.Scanner;

public class GCD {

	static int  gcd (int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		System.out.println(gcd(n1,n2));
	}

}
