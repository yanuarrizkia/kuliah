import java.util.Scanner;
public class Tugas29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.print("Masukkan banyaknya nilai: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt(); 

        }
            input.close();

            int maksimum = nilai[0];
            int minimum = nilai[0];
            int total = nilai[0];

            for (int i = 1; i < n; i++) {
                if (nilai[i] > maksimum) {
                maksimum = nilai[i];

            }
                if (nilai[i] < minimum) {
                minimum = nilai[i];

            }   
                total += nilai[i];

            }
            double rata_rata = (double) total / n;

            System.out.println("Nilai tertinggi: " + maksimum);
            System.out.println("Nilai terendah: " + minimum);
            System.out.println("Rata-rata: " + rata_rata);

        }
}