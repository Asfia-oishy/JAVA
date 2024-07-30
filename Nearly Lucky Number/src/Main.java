import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String val=String.valueOf(n);

      //  System.out.println(val.charAt(0));
        int count=0;

        for (int i = 0; i<val.length(); i++) {

            if (val.charAt(i)=='7' || val.charAt(i)=='4')
            {
                count++;

            }
        }
        if (count==4 || count==7)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}