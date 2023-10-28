import java.util.Scanner;

public class LinearSearch229 {
    public static void main(String[] args) {
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        System.out.println("34, 18, 26, 48, 72, 20, 56, 63 ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin Anda cari: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arrayInt.length) {
            int value = arrayInt[index];
            System.out.println("Nilai pada indeks ke-" + index + "adalah :" + value);
        } else {
            System.out.println("Indeks tidak valid. Indeks harus antara 0 dan " + (arrayInt.length -1.));
        }

        sc.close();
    }

    public static int searchArray(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Return -1 if the key is not found in the array
    }
}