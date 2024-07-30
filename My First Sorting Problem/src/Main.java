import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int x,y;
        for (int i = 1; i <= T; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x<=y)
            {
                System.out.println(x+" "+y);
            }
            else {
                System.out.println(y+" "+x);
            }

        }
    }
}