import java.util.Scanner;

public class EkspedisiLogin {
    public static void main(String[] args) {
        String username = "pengguna";
        String password = "katasandi";

        boolean berhasilLogin = false;

        try (Scanner scan = new Scanner(System.in)) {
            while (!berhasilLogin) {
                System.out.print("Masukkan nama pengguna: ");
                String inputUsername = scan.nextLine();
                System.out.print("Masukkan kata sandi: ");
                String inputPassword = scan.nextLine();

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    System.out.println("Selamat datang, " + username + "!");
                    berhasilLogin = true;
                } else {
                    System.out.println("Login gagal. Nama pengguna atau kata sandi salah.");
                }
            }
        } // Objek Scanner akan ditutup secara otomatis setelah keluar dari blok try
    }
}