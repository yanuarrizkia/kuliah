public class cekBilangan {

    static boolean cekBilangan(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan nilai n: "));
        System.out.println("Apakah n bilangan prima? " + cekBilangan(n));
    }
}