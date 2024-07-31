import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i=1;i<=T;i++)
        {
            //screen-5*3=15
            int x = scanner.nextInt(); //1cell
            int y = scanner.nextInt(); //4cells

            float scrn_y = (float) Math.ceil(y/2.0f);


            int s_x= (int)((scrn_y*15.0f)-(y*4.0f));
            if (s_x-x>=0)
            {
                System.out.println((int)scrn_y);
            }
            else
            {
                int need = x-s_x;
                int scrn_x = (int) Math.ceil(need/15.0f);
                System.out.println((int)(scrn_x+scrn_y));

            }


        }


    }

}