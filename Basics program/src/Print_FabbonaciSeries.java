import java.util.Scanner;
public class Print_FabbonaciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int pd=0,nd=1,sum=0;
		for (int i = 0; i <=n; i++)
		{
			sum=pd+nd;
			System.out.print(sum+" ");
			pd=nd;
			nd=sum;
			sum=pd;
		}
		sc.close();
	}
}
