import java.util.Scanner;

public class DoWhileCuti229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                while (jumlahHari > jatahCuti) {
                    System.out.println("Jumlah hari yang diminta melebihi jatah cuti yang tersisa.");
                    System.out.print("Jumlah hari: ");
                    jumlahHari = sc.nextInt();
                }

                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti anda: " + jatahCuti);
            }
        } while (konfirmasi.equalsIgnoreCase("y")); 
       }
}