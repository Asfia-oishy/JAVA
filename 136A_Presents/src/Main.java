import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //input nibo Pi.mane jara gift pailo.output e jara dilo tader show krbo
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] rcv = new int[num];

        for(int i=0;i<num;i++)
        {
            rcv[i]=scanner.nextInt();
            //System.out.println(rcv[i]);
        }

        int[] out= new int[num];
        int val;
        for(int i=0;i<num;i++)
        {
           val = rcv[i];
           out[val-1]=i+1;
        }
        for(int i=0;i<num;i++)
        {
            if(i==num-1){
                System.out.print(out[i]);
            }
            else
            {System.out.print(out[i]+" ");}
        }





    }
}