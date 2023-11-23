import java.util.Scanner;
public class UcapanTerimaKasih_229{
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tulisan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +"you inspired in me a love for learning and me feel Like I could ask you anything.");
    }
    public static void main(String[] args) {
           UcapanTerimaKasih();
    }
}