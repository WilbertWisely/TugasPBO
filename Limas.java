
import java.util.Scanner;
public class Limas {
    public static void main(String[]args) throws Exception{
        float p,l,t;
        System.out.print("\nPerhitungan Volume dari Limas Segi Empat \n\n");
        Scanner temp = new Scanner (System.in);
        System.out.print("Masukkan panjang limas : ");
        p = temp.nextInt();
        System.out.print("\nMasukkan lebar limas : ");
        l = temp.nextInt();
        System.out.print("\nMasukkan tinggi limas : ");
        t = temp.nextInt();
        float vol =p*l*t*1/3;
        System.out.print("\nPanjang limas segi empat adalah : "+p);
        System.out.print("\nLebar limas segi empat adalah : "+l);
        System.out.print("\nTinggi limas segi empat adalah : "+t);
        System.out.print("\nVolume limas segi empat adalah : "+vol);
        temp.close();
    }
}