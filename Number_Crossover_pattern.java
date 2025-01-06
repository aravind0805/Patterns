import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(i>1)
            {
                for(int j=i;j<=n;j++)
                {
                    System.out.print(j);
                }
                for(int j=1;j<i;j++)
                {
                    System.out.print(j);
                }
            }
            else{
                for(int j=1;j<=n;j++)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
