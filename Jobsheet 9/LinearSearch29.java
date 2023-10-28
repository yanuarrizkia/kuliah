import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        System.out.println("34, 18, 26, 48, 72, 20, 56, 63 ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan indeks yang ingin Anda cari: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arrayInt.length) {
            int value = arrayInt[index];
            System.out.println("Nilai pada indeks ke-" + index + " adalah: " + value);
        } else {
            System.out.println("Indeks tidak valid. Indeks harus antara 0 dan " + (arrayInt.length - 1));
        }
    }
}