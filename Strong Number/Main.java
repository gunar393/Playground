import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int i; 
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
      int sum = 0;
      int temp = n;
      while(temp > 0)
      {
         int fact=1;
         int d = temp%10;
         for(i=1;i<=d;i++)
         {    
         fact=fact*i;  
         }  
        sum = sum +fact;
        temp = temp/10;
      }
      if(sum == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}