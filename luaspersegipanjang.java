
    import java.util.Scanner;
public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner inputP = new Scanner(System.in);
        Scanner inputL = new Scanner(System.in);
        int P,L,luas;
        System.out.print("Masukkan panjang persegi: ");
        P = inputP.nextInt();
        System.out.print("Masukkan lebar persegi: ");
        L = inputL.nextInt();
        luas = P * L ;
        System.out.println("Luas dari persegi panjangnya adalah: "+luas);
    }
}
    

