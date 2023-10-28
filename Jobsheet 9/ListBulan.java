import java.util.Scanner;
public class ListBulan {
    public static void main(String[] args) {
        
        String[] bulan = {"january","febuary","maret","april","mei","juni","juli","agustus","september","oktober","november","desember"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("masukan indexs yang ingin Anda cari: ");
        int index = input.nextInt();

        if (index >= 0 && index < bulan.length) {
            String nilai = bulan[index];
            System.out.println("bulan indexs ke-" + index + " adalah " + nilai );
    }
}
}
 