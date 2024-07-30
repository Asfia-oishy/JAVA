import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for(int i=0; i<T; i++)
        {

            int a,b,c,d;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            //a,c min kore nibo
            int tmp;
            if(b<a)
            {
                tmp=a;
                a=b;
                b=tmp;
            }

            if(d<c)
            {
                tmp=c;
                c=d;
                d=tmp;
            }



            if((c>a && d<b) || (c<a && d>b) || c>b || d<a)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }

    }
}