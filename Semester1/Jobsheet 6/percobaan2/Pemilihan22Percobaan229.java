import java.util.Scanner;

class Pemilihan2Percobaan229 {
    public static void main(String[] args) {
        Scanner SudutA = new Scanner(System.in);
        System.out.print("Masukkan total sudut dalam sebuah segitiga: ");
        int sudut = SudutA.nextInt();

        if (sudut == 180) {
            System.out.print("Masukkan sudut pertama: ");
            int sudut1 = SudutA.nextInt();
            System.out.print("Masukkan sudut kedua: ");
            int sudut2 = SudutA.nextInt();
            System.out.print("Masukkan sudut ketiga: ");
            int sudut3 = SudutA.nextInt();
            int totalSudut = sudut1 + sudut2 + sudut3;

            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if (sudut1 == sudut2 && sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
            int ketidakSudutan = 180 - totalSudut;
            System.out.println("Total ketidak-sudutan segitiga: " + ketidakSudutan);
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}