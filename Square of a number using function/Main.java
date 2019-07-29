import java.util.Scanner;
public class Main 
{
public static void main(String [] args)
{
Scanner in = new Scanner(System.in);
int num = in.nextInt();
System.out.println(square(num));
}
public static int square(int num) 
{
return (int)Math.pow(num,2);
}
}