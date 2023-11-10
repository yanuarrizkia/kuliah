import java.util.Scanner;
import java.util.Random;
public class Quiz229 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10):");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number){
                    success = true;
                    System.out.println("Selamat, Anda menebak angka dengan benar!");
                }else if (answer < number){
                    System.out.println("Tebakan Anda terlalu kecil. Coba lagi.");
                }else{
                    System.out.println("Tebakkan Anda terlalu besar. Coba lagi.");
                }
            }while(!success);
            System.out.print("Apakah Anda ingin mengulang permianan (Y/y)?");
            menu = input.nextLine().charAt(0);
        }while(Character.toUpperCase(menu) == 'y');
    }
}
    
