import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        int c = son(n);
	    System.out.print(c); 
	}
   
	public static int son(int y)
	{
	    int sum = 0;
	    for(int i = 1; i<= y; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
	}
} 