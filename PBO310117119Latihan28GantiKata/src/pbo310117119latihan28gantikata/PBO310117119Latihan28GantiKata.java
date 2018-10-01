/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan28gantikata;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat mengganti kata yang diinginkan
 */
public class PBO310117119Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        String Kata;
        String K;
        String Gantikata;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====");
        System.out.print("MasukKan Kalimat : ");
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        Kata = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        K = scanner.nextLine();
        
        Gantikata = Kalimat.replace(Kata, K);
        System.out.println("=====Habis Formating=====");
        System.out.println("Kalimat Awal : "+Kalimat);
        System.out.println("Kalimat Baru : "+Gantikata);
    }
    
}
