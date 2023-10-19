import java.util.Scanner;
class ForKelipatan229{
    public static void main(String[]args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Masukkan bilang kelipatan (1-9) : ");
        int kelipatan = scan.nextInt();
        int total = 270 ;
        int counter = 14;
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
                System.out.printf("Bayaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan keliling %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
                break;
            }
        }
    }
}