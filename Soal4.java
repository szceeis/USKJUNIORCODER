/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Selii
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String input1 =  JOptionPane.showInputDialog("Masukanlah Nilai 1");
      String input2 =  JOptionPane.showInputDialog("Masukanlah Nilai 2");
      String input3 =  JOptionPane.showInputDialog("Masukanlah Nilai 3");
      
      double nilai1 = Double.parseDouble(input1);
      double nilai2 = Double.parseDouble(input2);
      double nilai3 = Double.parseDouble(input3);
      
      double rataRata = (nilai1 + nilai2 + nilai3)/3;
      
      String hasil = (rataRata >= 60) ? "LULUS" : "GAGAL";
      String RataFormatted = String.format("%.2f", rataRata);
      
      String pesan = "Nilai 1 :" + nilai1 + "\n" +
                     "Nilai 2 :" + nilai2 + "\n" +
                     "Nilai 3 :" + nilai3 + "\n" +
                     "Rata-Rata :" + RataFormatted + "\n" +
                     "Hasil :" + hasil;
      
      System.out.printf("Rata-rata (2 angka belakang koma): %.2f%%\n", rataRata);
      JOptionPane.showMessageDialog(null, pesan);
              
    }
    
}
