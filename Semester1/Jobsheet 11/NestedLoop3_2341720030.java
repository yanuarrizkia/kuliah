import java.util.Scanner;

public class NestedLoop3_2341720030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            double totalTemperature = 0;

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
                totalTemperature += temps[i][j];
            }

            double averageTemperature = totalTemperature / temps[i].length;
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + averageTemperature);
            System.out.println();
        }

        // Menampilkan array menggunakan foreach
        for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}
