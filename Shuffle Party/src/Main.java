import java.util.Scanner;

//index wise swap not value wise
//@author : Asfia Moon
//*****divisor ber krbona.normally hisab kre ekta pattern e dekhbo je 1 always 2 er power position e thakbe
public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int len = scanner.nextInt();
            int power=0,val=0;

            while(true)
            {
                 val = (int) (Math.pow(2,power));
                 if(val<=len)
                 {
                     power++;

                 }
                 else
                     break;

            }


            int index_1= (int) (Math.pow(2,power-1));



            System.out.println( index_1);

        }
    }
}