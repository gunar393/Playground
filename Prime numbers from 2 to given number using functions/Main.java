import java.util.Scanner;
class Main{
  public static int d_f (int n){
    int fact_digit = 0;
    for(int num = 1; num<=n; num++)
    {
      if(n % num == 0)
        fact_digit =fact_digit + 1;
    }
    return fact_digit;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=2; i<=n; i++)
      {
        int f_d = d_f(i);
        if(f_d == 2)
          	System.out.println(i);
      }
          
	}
}