import java.util.Scanner;

public class Expedisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Input
        System.out.print("Masukkan berat paket (kg): ");
        double beratPaket = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarakPengiriman = input.nextDouble();

        System.out.print("Masukkan jenis layanan (express/regular/standard): ");
        String jenisLayanan = input.next();

        // Langkah 2: Proses
        double biayaPengiriman = 0.0;

        if (jenisLayanan.equals("express")) {
            biayaPengiriman = beratPaket * jarakPengiriman * 0.2; // Contoh perhitungan express
        } else if (jenisLayanan.equals("regular")) {
            biayaPengiriman = beratPaket * jarakPengiriman * 0.1; // Contoh perhitungan regular
        } else if (jenisLayanan.equals("standard")) {
            biayaPengiriman = beratPaket * jarakPengiriman * 0.05; // Contoh perhitungan standard
        } else {
            System.out.println("Jenis layanan tidak valid.");
            System.exit(1); // Keluar dari program jika jenis layanan tidak valid
        }

        // Langkah 3: Output
        System.out.println("Biaya pengiriman: $" + biayaPengiriman);

        input.close();
    }
}