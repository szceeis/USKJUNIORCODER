/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Selii
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Input1 = JOptionPane.showInputDialog("Masukan nilai 1");
        String Input2 = JOptionPane.showInputDialog("Masukan nilai 2");
        
        int nilai1 = Integer.parseInt(Input1);
        int nilai2 = Integer.parseInt(Input2);
        
        int Hasil = nilai1 * nilai2;
        
        JOptionPane.showMessageDialog(null, 
                "Nilai 1: " + nilai1 + "\n" +
                "Nilai 2: " + nilai2 + "\n" + 
                "Hasil X : " + Hasil 
                        );          
                        
    }
    
}
