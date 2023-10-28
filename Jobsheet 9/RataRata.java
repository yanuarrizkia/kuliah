import java.util.Scanner;
public class RataRata {
    public static void main(String[] args) {
        int n = 8 ;
        int[] bilangan = new int[n];
        Scanner input =  new Scanner(System.in);

        for(int i = 0; i < n; i++){
        System.out.print("Masukan nilai ke-" + (i + 1) + ":");
        bilangan[i] = input.nextInt();
        }
        
    int total = 0;
    for (int i = 0; i < n; i++) { 
            total +=  bilangan[i];
        }
        double rataRata = (double) total / n;
    
    System.out.println("rata_rata nilai array  : "+ rataRata);
        }
    }