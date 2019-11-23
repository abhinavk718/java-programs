public class Forloop1
{
	public static void main(String[] args)
	{
		double[]percarr= {73.29,60.54,83.22,98.8,90.27};
		for (int i =percarr.length-1 ; i >=0; i--) 
		{
			System.out.print(percarr[i]+" ");
		}
		System.out.println("\n---------------------------");
		for(double d:percarr)
		{
			System.out.println(d);
		}
	}
}
