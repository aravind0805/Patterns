import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        
        for(int i=num;i>=1;i--)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
