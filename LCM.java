package GFG;

import java.util.Scanner;

public class LCM {
	
	static int lcm(int a,int b) {
		int res = Math.max(a, b);
		while(true) {
			if(res%a==0 && res%b==0) {
				return res;
			}
			
			res++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		System.out.println(lcm(n1,n2));
	}

}
