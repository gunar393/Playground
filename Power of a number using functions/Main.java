import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, exponent;
		long power = 1;
		sc = new Scanner(System.in);
		number = sc.nextInt();	
		exponent = sc.nextInt();	
		for(i = 1; i <= exponent; i++)
		{
			power = power * number;
		}
		System.out.println(power);
	}
}