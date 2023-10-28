import java.util.Scanner;

public class FiturJenisLayanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diskon = 0.0, berat, jarak;
        int biaya, jenLay = 0;
        String jenis;

        System.out.print("Masukkan jenis layanan yang dipilih (Express, Regular, Standard) : ");
        jenis = input.nextLine();
        System.out.print("Masukkan berat paket(kg) : ");
        berat = input.nextDouble();
        System.out.print("Masukkan jarak pengiriman paket (km) : ");
        jarak = input.nextDouble();

        if (jenis.equalsIgnoreCase("express")) {
            jenLay = 500;
            if (jarak > 10 || berat > 10) {
                diskon = 0.2;
                System.out.println("Anda telah mendapat diskon 20%!");
            } else if (jarak > 5 || berat > 5) {
                diskon = 0.1;
                System.out.println("Anda telah mendapat diskon 10%!");
            } else {
                diskon = 0.0;
                System.out.println("Anda tidak mendapatkan diskon");
            }
        } else if (jenis.equalsIgnoreCase("regular")) {
            jenLay = 400;
            if (jarak > 10 || berat > 10) {
                diskon = 0.15;
                System.out.println("Anda telah mendapat diskon 15%!");
            } else if (jarak > 5 || berat > 5) {
                diskon = 0.1;
                System.out.println("Anda telah mendapat diskon 10%!");
            } else {
                diskon = 0.0;
                System.out.println("Anda tidak mendapatkan diskon");
            }
        } else if (jenis.equalsIgnoreCase("standard")) {
            jenLay = 300;
            diskon = 0.0;
            System.out.println("Anda tidak mendapatkan diskon");
        } else {
            System.out.println("Masukan jenis layanan Anda salah. Harap pilih Express, Regular, atau Standard.");
            return; // Mengakhiri program jika jenis layanan tidak valid
        }

        biaya = (int) ((berat * jarak * jenLay) - (berat * jarak * jenLay * diskon));
        System.out.println("Biaya pengiriman paket Anda adalah: " + biaya);
    }
}