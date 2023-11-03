import java.util.Scanner;

public class BioskopWithScanner229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama;
        int baris, kolom;

        while (true) {
            System.out.print("Pilih menu (input/penonton/Exit): ");
            String menu = sc.nextLine();

            switch (menu.toLowerCase()) {
                case "input":
                    System.out.print("Masukan nama : ");
                    nama = sc.nextLine();
                    System.out.print("Masukan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (isValidSeat(baris, kolom) && isSeatAvailable(penonton, baris, kolom)) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton telah ditambahkan.");
                        } else {
                            System.out.println("Maaf, kursi ini sudah ditempati. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Baris atau kolom tidak valid.");
                    }
                    break;
                case "penonton":
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                            }
                        }
                    }
                    break;
                case "exit":
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }

    public static boolean isValidSeat(int baris, int kolom) {
        return (baris >= 1 && baris <= 4) && (kolom >= 1 && kolom <= 2);
    }

    public static boolean isSeatAvailable(String[][] penonton, int baris, int kolom) {
        return penonton[baris - 1][kolom - 1] == null;
    }
}
