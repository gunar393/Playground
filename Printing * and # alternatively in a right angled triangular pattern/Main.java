import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int t=0;
      for(int i = 1;i<=n;i++)
      {
        for(int j = 1;j<=i;j++)
        {
          if(t==0)
          {
             System.out.print("*");
             t=1;
          }
          else
          {
             System.out.print("#");
             t=0;
          }
        }
        System.out.print("\n");
      }
      
	}
}