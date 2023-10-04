import java.util.Scanner;
class Pemilihan2Percobaan129 {
    public static void main(String[] args) {
        Scanner tahun1 = new Scanner(System.in);
        System.out.print("Masukan Tahun Kabisat : ");
        int tahun = tahun1.nextInt();
        if ((tahun % 4) == 0){
            if((tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
        }else 
        System.out.println("Bukan Tahun Kabisat");
    }
}