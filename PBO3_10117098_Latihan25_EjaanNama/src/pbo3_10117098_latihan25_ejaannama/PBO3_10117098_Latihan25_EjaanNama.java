/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan25_ejaannama;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk mengeja per huruf dari
 *                     kata yang di input oleh user
 */
public class PBO3_10117098_Latihan25_EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        int panjang; 
        char huruf; 
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length(); 
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");

        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
