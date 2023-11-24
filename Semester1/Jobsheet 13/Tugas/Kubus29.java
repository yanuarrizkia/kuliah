import java.util.Scanner;
/**
 * Kubus05
 */
public class Kubus29 {
    static int hitungLuasPersegi(int a){
        int Luas = a*a;
        return Luas;
    }
    static int hitungVolume(int a){
        int volume = hitungLuasPersegi(a)*a;
        return volume;
    }
    static int hitungLuasPermukaan(int a, int b){
        int LuasPermukaanKubus = hitungLuasPersegi(a)*b;
        return LuasPermukaanKubus;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r, V, LP;
        System.out.print("Masukkan panjang rusuk kubus : ");
        r = inp.nextInt();

        V=hitungVolume(r);
        System.out.println("Volume kubus tersebut = "+V);
        LP=hitungLuasPermukaan(r,6);
        System.out.print("Luas permukaan kubus tersebut = "+LP);
        inp.close();
    }
}