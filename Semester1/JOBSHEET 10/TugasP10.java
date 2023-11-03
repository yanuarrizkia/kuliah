import java.util.Scanner;

public class TugasP10 {
    public static void main(String[] args) {
        var clearScreen = ("\033[H\033[2J");
        System.out.println(clearScreen);

        // TODO: transaksi

        String[][] identitas = new String[11][2]; // Membuat array 2 dimensi untuk identitas pengirim dan penerima

        Scanner transaksi = new Scanner(System.in);

        while (true) {
            // input data pengirim
            System.out.print("Nama Pengirim : ");
            identitas[0][0] = transaksi.nextLine();
            System.out.print("Alamat Pengirim : ");
            identitas[1][0] = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            identitas[2][0] = transaksi.nextLine();

            System.out.println(clearScreen);

            // input data penerima
            System.out.print("Nama Penerima : ");
            identitas[0][1] = transaksi.nextLine();
            System.out.print("Alamat Penerima : ");
            identitas[1][1] = transaksi.nextLine();
            System.out.print("Kecamatan : ");
            identitas[2][1] = transaksi.nextLine();
            System.out.print("Kota/Kabupaten : ");
            identitas[3][1] = transaksi.nextLine();
            System.out.print("Provinsi : ");
            identitas[4][1] = transaksi.nextLine();
            System.out.print("Kode Pos : ");
            identitas[5][1] = transaksi.nextLine();
            System.out.print("No. Handphone : ");
            identitas[6][1] = transaksi.nextLine();
            System.out.print("Tanggal Kirim : ");
            identitas[7][1] = transaksi.nextLine();

            System.out.print(clearScreen);
            for (int i = 0; i < identitas.length; i++) {
                System.out.println(identitas[i][0]);
            }
            for (int i = 0; i < identitas.length; i++) {
                System.out.println(identitas[i][1]);
            }

            System.out.print("apakah anda ingin memasukan data lain (y/n) : ");
            String jawaban = transaksi.next();
            if (jawaban.equals("n")) {
                break;
            }
            System.out.println(clearScreen);
            transaksi.nextLine();
        }
    }
}