import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sum = 0;
      int digit_count = 0;
      int temp1 = n;
      int temp2 = n;
      while(temp1 > 0)
      {
        digit_count = digit_count+1;
        temp1 = temp1/10;
      }
      while(temp2 > 0)
      {
        int d= temp2 % 10;
        sum = sum + (int) Math.pow(d, digit_count);
        temp2 = temp2/10;
      }
      if(sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}
