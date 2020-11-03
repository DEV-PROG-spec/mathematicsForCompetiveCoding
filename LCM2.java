package GFG;

import java.util.Scanner;

public class leastCommonMultiple {
	static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		else {
			return(gcd(b,a%b));
		}
	}
	static int lcm(int a ,int b) {
		return a*b/gcd(a,b);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		System.out.println(lcm(n1,n2));
	}

}
