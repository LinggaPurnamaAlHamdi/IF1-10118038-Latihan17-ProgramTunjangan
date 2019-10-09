/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Lingga
 
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Program
 * Tunjangan
 */
public class IF110118038Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============Program Tunjangan==============");
        System.out.print(" Berapa gaji pokok anda perbulan? ");
        double gajiPokok = sc.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String menikah = sc.next();
        menikah = menikah.toUpperCase();
        double tunjangan = 0;
        if(menikah.equals("MENIKAH")) { 
            
            tunjangan = gajiPokok*0.35;
        }   
        
        double totalGaji = gajiPokok+tunjangan;
        
        System.out.println("==========Hasil Perhitungan Gaji Anda============");
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + totalGaji);
        System.out.println("(Developed by : Lingga Purnama Al Hamdi)");
    }
    
}
