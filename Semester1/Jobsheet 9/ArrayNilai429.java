import java.util.Scanner;
public class ArrayNilai429 {
    public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int[] nilaiAkhir = new int[10];
    
        for (int i = 0; i < nilaiAkhir.length; i++){
         System.out.print("Masukan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
     for (int i = 0 ; i < nilaiAkhir.length; i++){ 
        if(nilaiAkhir[i] > 70){
        System.out.println("Masukan ke- " + i + " lulus");
        }else{
            System.out.println("Masukan ke- "+ i +" Tidak lulus");
            }
        }
     }
}
    