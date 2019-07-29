import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=n/100;
      int l=n%10;
      int s=f+l;
      System.out.println(s);
	}
}