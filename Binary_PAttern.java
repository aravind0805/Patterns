import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        {
            Scanner scan= new Scanner(System.in);
            int n = scan.nextInt();

            for(int i=1;i<=n;i++)
            {
                if(i%2==0)
                {
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("0"+" ");
                    }
                }
                else
                {
                    for(int j=1;j<=n;j++)
                    {
                        System.out.print("1"+" ");
                    }
                }
                System.out.println();
            }

        }
    }
}
