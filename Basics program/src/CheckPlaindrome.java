import java.util.Scanner;
public class CheckPlaindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		int t = n, sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		if (sum == t)
			System.out.println("Plaindrome");
		else
			System.out.println("Not Plaindrome");
		sc.close();
	}
}
