import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Lebar: ");
        int lebar = input.nextInt();

        gambar(panjang, lebar); 
        Keliling(panjang, lebar);   
        luas(panjang, lebar);
    }
    
    private static void gambar(int Panjang, int lebar) {
        for (int i = 0; i < lebar; i++) { 
            for (int j = 0; j < Panjang; j++) { 
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
    

    private static int Keliling(int Panjang, int lebar) {
        return 2 * (Panjang + lebar);
    }
    private static int luas(int Panjang, int lebar) {
        return Panjang*lebar;
    }
}
