import java.util.Scanner;
public class  Main
{
    public static void main(String[] args) 
    {
        int n, sea_1, sea_2;
        int ele_1 = -1;
        int ele_2 = -1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
      sea_1 = s.nextInt();
      sea_2 = s.nextInt();
      for(int i = 0; i < n; i++)
        {
            if(sea_1 == a[i])
            {
              ele_1 = i;
            }
            if(sea_2 == a[i])
            {
              ele_2 = i;
            }
        }
        System.out.println(ele_1);
        System.out.println(ele_2);
    }
}