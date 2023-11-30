public class penjumlahanBilangan {

    static int penjumlahanBilangan(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanBilangan(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan nilai n: "));
        System.out.println("Hasil penjumlahan: " + penjumlahanBilangan(n));
    }
}

