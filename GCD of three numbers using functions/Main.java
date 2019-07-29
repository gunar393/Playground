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
        int gcd_1 = gcd(a,b);
		int gcd_2 = gcd(gcd_1,c);
        System.out.print(gcd_2);
    }
  public static int gcd(int n1,int n2)
  {
    int min;
    int gcd = 0;
       if(n1<n2)
            min = n1;
       else
            min = n2;
      while(min >= 1)
      {
        if((n1%min == 0) && (n2%min == 0))
        {
          gcd = min;
          break;
        }
        min--;
      }
    return gcd;
  }
}