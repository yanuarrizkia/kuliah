import java.util.Scanner;

public class Percobaan2_29 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();

        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.print(bilangan + "x");
        for (int i = pangkat - 1; i >= 1; i--) {
            System.out.print(bilangan + "x");
        }
        System.out.print("1 = " + hasil);
    }
}
