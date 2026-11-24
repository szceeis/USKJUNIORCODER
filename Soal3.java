/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author Selii
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Harga Barang : Rp. ");
        double HargaBarang = scanner.nextDouble();
        
        System.out.print("Diskon  : ");
        double Diskon = scanner.nextDouble();
        
        double DiskonRp = HargaBarang * (Diskon / 100);
        double TotalHarga = HargaBarang - DiskonRp;
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);
        
        System.out.println("\nRincian Pembayaran");
        System.out.println("Harga Barang : Rp. " + formatter.format(HargaBarang));
        System.out.println("Diskon : " + (int)Diskon + " %");
        System.out.println("Diskon(Rp.) : Rp. " + formatter.format(DiskonRp));
        System.out.println("Total Harga : Rp. " + formatter.format(TotalHarga));

        scanner.close();
        
        
    }
    
}
