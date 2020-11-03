package GFG;
import java.util.Scanner;
public class TrailingZeros {
	
	static int trailingZeros(int n) {
		int res=0;
		for(int i =5;i<=n;i=i*5) {
			return res+n/i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		sc.close();
		System.out.println(trailingZeros(number));
				
	}

}
