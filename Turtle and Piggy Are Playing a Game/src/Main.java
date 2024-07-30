import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++)
        {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = r;
            int score = 0;
            int p = 2;
            while (x!=1)
            {
                if(x%p==0)
                {
                    score+=1;
                    x=x/p;
                }
                else
                {
                    x--;
                }
            }
            System.out.println(score);
        }
    }
}