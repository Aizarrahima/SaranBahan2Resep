package saranbahan2resep;

import java.util.Scanner;

/**
 *
 * @author Aizar
 */
public class SaranBahan2Resep {

    public static void main(String args[]) {
        String identitas = "Aizar Rahima Suprayitno / X RPL 4 / 02";
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama : ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan Anda ");
        int bahan1 = scanner.nextInt();
    }
}
