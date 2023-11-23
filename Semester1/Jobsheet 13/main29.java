import java.util.Scanner;
public class main29 {
    static Scanner scan = new Scanner(System.in);
    static int [][] nilai = new int [4][6];
    public static void main(String[] args) {
        input(nilai);
        tampil(nilai);
        int mingguTertinggi = cariMinggu(nilai);
        System.out.println("Nilai tertinggi terdapat pada minggu ke-" + mingguTertinggi);
        String nama = cariOrang(nilai);
        System.out.println("Mahasiswa dengan nama " + nama + " mendapatkan nilai tertinggi pada minggu ke-" + mingguTertinggi);
    }

    static void input(int [][] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                nilai [i][j] = scan.nextInt();
            }
        }
    }

    static void tampil(int [][] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int cariMinggu(int[][] nilai) {
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguTertinggi = j + 1;
                }
            }
        }
        return mingguTertinggi;
    }
        static String cariOrang(int[][] nilai) {
        int orangTertinggi = 0;
        int nilaiTertinggi = 0;
        String nama;
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    orangTertinggi = i;
                }
            }
        }
        switch (orangTertinggi) {
            case 0:
                nama = "Sari";
                break;
            case 1:
                nama = "Rina";
                break;
            case 2:
                nama = "Yani";
                break;
            case 3:
                nama = "Dwi";
                break;
            case 4:
                nama = "Lusi";
                break;
            default:
                nama = "Nama tidak ditemukan";
                break;
        }
        return nama;
    }
}