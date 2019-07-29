import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int pow=in.nextInt();
      int pro=1;
      int count=0;
      while(count<pow)
      {
        pro=pro*base;
        count++;
      }
      System.out.println(pro);
    }
}
