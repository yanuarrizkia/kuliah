import java.util.Scanner;
public class BioskopWithScanner29{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukan nama : ");
            nama = sc.nextLine();
            System.out.print("Masukan baris : ");
            baris = sc.nextInt();
            System.out.print("Masukan kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainya? (y/n): ");
            next = sc.nextLine();
 
            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}