public class five29 {

  public static void main(String[] args) {
    int angka = 5;
      for (int i = 1; i <= angka; i++) {
        for (int j = 1; j <= angka; j++) {
          if (i == 1 || i == angka || j == 1 || j == angka) {
            System.out.print(angka);
          } else {
            System.out.print(" ");
          }
          if (j < angka) {
            System.out.print(" ");
          }
        }
        System.out.println();
    }
    }
}