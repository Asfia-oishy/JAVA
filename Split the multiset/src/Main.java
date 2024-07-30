import java.util.Scanner;
//@author- Asfia Moon
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=1;i<=T;i++)
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int result = 0;

            if(n==1)
            {
                System.out.println(result);
            }
            else
            {
                while(n>1)
                {
                    n=n-k+1;
                    //System.out.println(n);
                    result+=1;

                }
                System.out.println(result);
            }


        }
    }
}