import java.util.Scanner;

//@author- Asfia Moon
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            boolean f = false;
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    arr[r][c] = scanner.nextInt();
                }
            }//done input
            if (m == 1 && n == 1) {
                System.out.println(-1);
                f = true;
            }
            char even = 'x';
            if (n % 2 == 0) {
                even = 'r'; //num of rows is even
            } else if (m % 2 == 0) {
                even = 'c';
            }
            if (even == 'c')
            {
                // System.out.println("col even");

                for (int r = 0; r < n; r++) {
                    for (int c = m - 1; c >= 0; c--) {
                        if (c == 0) {
                            System.out.println(arr[r][c]);
                            break;
                        }
                        System.out.print(arr[r][c] + " ");

                    }
                }

            }
            else if (even == 'r')
            {
                // System.out.println("row even");
                for (int r = n - 1; r >= 0; r--) {
                    for (int c = 0; c < m; c++) {
                        if (c == m - 1) {
                            System.out.println(arr[r][c]);
                            break;
                        }
                        System.out.print(arr[r][c] + " ");

                    }
                }

            }
            else if (f == false)
            {
                if (n != 1 && m != 1)
                {
                    for (int r = 1; r < n; r++) { //2nd to last.finally 1st row
                        for (int c = 0; c < m; c++) {
                            if (c == m - 1) {
                                System.out.println(arr[r][c]);
                                break;
                            }
                            System.out.print(arr[r][c] + " ");

                        }
                    }
                    int r = 0;

                    for (int c = 0; c < m; c++) {
                        if (c == m - 1) {
                            System.out.println(arr[r][c]);
                            break;
                        }
                        System.out.print(arr[r][c] + " ");
                    }
                }
                else {
                    if(n==1)
                    {
                        int r=0;
                        for(int c=1;c<m;c++)
                        {
                            System.out.print(arr[r][c]+" ");
                        }
                        System.out.println(arr[r][0]);
                    }
                    else
                    {
                        int c=0;
                        for(int r=1;r<n;r++)
                        {
                            System.out.println(arr[r][c]);
                        }
                        System.out.println(arr[0][c]);
                    }


                }

            }
        }
        }
    }

