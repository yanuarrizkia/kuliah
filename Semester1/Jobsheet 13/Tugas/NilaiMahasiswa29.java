import java.util.Scanner;

public class NilaiMahasiswa29{

    static Scanner input = new Scanner(System.in);
    static int jumlahMahasiswa;
    static int jumlahMinggu;
    static String[] namaMahasiswa;
    static double[][] nilaiTugas;

    public static void inputNilai() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();
        }

        System.out.print("Masukkan jumlah minggu: ");
        jumlahMinggu = input.nextInt();

        nilaiTugas = new double[jumlahMahasiswa][jumlahMinggu];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Input nilai tugas untuk Mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextDouble();
            }
            System.out.println();
        }
    }

    public static void tampilNilai() {
        System.out.println("Nilai Tugas Mahasiswa:");
        System.out.printf("%-20s", "Nama Mahasiswa");

        for (int j = 0; j < jumlahMinggu; j++) {
            System.out.printf("%-15s", "Minggu " + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-20s", namaMahasiswa[i]);
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.printf("%-15.2f", nilaiTugas[i][j]);
            }
            System.out.println();
        }
    }

    public static void mingguNilaiTertinggi() {
        int mingguTertinggi = 0;
        double nilaiTertinggi = 0;

        for (int j = 0; j < jumlahMinggu; j++) {
            double totalNilaiMinggu = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalNilaiMinggu += nilaiTugas[i][j];
            }

            if (totalNilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMinggu;
                mingguTertinggi = j + 1;
            }
        }

        System.out.println("Minggu ke-" + mingguTertinggi + " memiliki nilai tertinggi.");
    }

    public static void nilaiTertinggiMahasiswa() {
        double[] totalNilaiMahasiswa = new double[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                totalNilaiMahasiswa[i] += nilaiTugas[i][j];
            }
        }

        double nilaiTertinggi = totalNilaiMahasiswa[0];
        int mahasiswaTertinggi = 0;

        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (totalNilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa[i];
                mahasiswaTertinggi = i;
            }
        }

        System.out.println("Mahasiswa " + namaMahasiswa[mahasiswaTertinggi] + " memiliki nilai tertinggi.");
        System.out.println("Detail nilai Mahasiswa " + namaMahasiswa[mahasiswaTertinggi] + ":");

        System.out.printf("%-15s%-15s%n", "Minggu", "Nilai");
        for (int j = 0; j < jumlahMinggu; j++) {
            System.out.printf("%-15s%-15.2f%n", "Minggu " + (j + 1), nilaiTugas[mahasiswaTertinggi][j]);
        }
    }

    public static void main(String[] args) {
        inputNilai();
        tampilNilai();
        mingguNilaiTertinggi();
        nilaiTertinggiMahasiswa();
        input.close();
    }
}