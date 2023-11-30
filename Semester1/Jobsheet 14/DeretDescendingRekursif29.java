public class DeretDescendingRekursif29 {

    static void deretDescendingRekursif(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            deretDescendingRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan nilai n: "));
        deretDescendingRekursif(n);
    }
}