import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa:");
        for (int i = 1; i <= 30; i++) {
            System.out.print("Nama mahasiswa ke-" + i + ": ");
            String nama = scanner.next();
            System.out.print("Jenis kelamin (Laki-laki/L perempuan) untuk " + nama + ": ");
            String jenisKelamin = scanner.next();
            
            if (jenisKelamin.equalsIgnoreCase("perempuan") || jenisKelamin.equalsIgnoreCase("L")) {
                System.out.println("Mahasiswa perempuan: " + nama);
            }
        }
    }
}