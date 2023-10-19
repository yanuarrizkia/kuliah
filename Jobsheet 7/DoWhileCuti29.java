import java.util.Scanner;
class DoWhileCuti29{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String konfirmasi;
    
    System.out.print("jatah cuti : ");
    jatahCuti = sc.nextInt();
    
    do{ 
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc.next();
 if (konfirmasi.equals("y")){
            System.out.print("Jumlah hari: ");
            jumlahHari = sc.nextInt();
        
            if(jumlahHari <= jatahCuti){
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti : " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
              break;
                
                }
                }
                }while(jatahCuti > 0);
}
}