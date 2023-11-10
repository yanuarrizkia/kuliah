import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] identitas = new String[8][2];
        String[] identitasLabels = {
            "Nama", "Alamat", "Kecamatan", "Kelurahan", "Kota", "Provinsi", "Kode pos", "Nomor Telepon"
        };


        while(true) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Masukkan informasi " + ((j == 0) ? "pengirim" : "penerima") + " (Informasi tidak boleh kosong!):");
                
                for (int i = 0; i < 8; i++) {
                    if (i == 4) {
                        boolean valid = true;
                        while (valid) {
                            System.out.print(identitasLabels[i] + " " + ((j == 0) ? "pengirim" : "penerima") + " (Malang/Surabaya/Jakarta/Madiun/Jember): ");
                            String [] kotaDiterima = {"Malang", "Surabaya", "Jakarta", "Madiun", "Jember"};
                            String kota = input.nextLine();
                            for (String kotaD : kotaDiterima) {
                                if (kota.equalsIgnoreCase(kotaD)) {
                                    identitas[i][j] = kota;
                                    valid = false;
                                    break;
                                } else {
                                    System.out.println("Kota yang dimasukkan tidak valid. Silakan masukkan salah satu dari lima kota yang diizinkan.");
                                }  
                            }
                        }
                    } else {
                        System.out.print(identitasLabels[i] + " " + ((j == 0) ? "pengirim" : "penerima") + ": ");
                        identitas[i][j] = input.nextLine();
                    }
                }
            }
            
            System.out.print("Apakah anda ingin merubah data informasi barang?(y/n): ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}