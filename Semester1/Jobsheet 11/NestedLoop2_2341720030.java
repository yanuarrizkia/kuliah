import java.util.Scanner;
public class NestedLoop_2341720030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temps[][] = new double[5][7] ;

        for (int i = 0; i < temps.length; i++){
            System.out.println("Kota ke- " + i);
            for (int j = 0 ; j < temps[0].length; j++) {
                System.out.print("Hari je-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
            }
            for (double[] cityTemps : temps) {
                for (double temp : cityTemps){
                    System.out.print(temps+" " );
                }
                System.out.println();
            }
        }
    }