import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int count = 1;count <= n;)
      {
        
        
        System.out.println(2*(count)-1);
        count = count+1;
        
      }
	}
}