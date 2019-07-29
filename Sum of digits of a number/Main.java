import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum = 0;
      while( temp > 0)
      {
        int d = temp%10;
        temp = temp/10;
        sum = sum + d;
      }
      System.out.println(sum);
	}
}