import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
		c = scan.nextInt();
        int max_1 = gre(a,b);
		int max_2 = gre(max_1,c);
        System.out.print(max_2);
    }
  public static int gre(int a,int b)
  {
    int big;
       if(a == b)
            big = a;
       else if(a>b)
            big = a;
       else
            big = b;
      return big;
   }
}