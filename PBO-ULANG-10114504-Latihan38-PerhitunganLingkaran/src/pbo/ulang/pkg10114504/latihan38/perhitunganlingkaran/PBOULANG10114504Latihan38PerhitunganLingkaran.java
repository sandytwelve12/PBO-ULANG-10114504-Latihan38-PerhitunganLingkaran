/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan38.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program perhitungan
 */
public class PBOULANG10114504Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lingkaran lingkaran1 = new lingkaran();
        
        System.out.println("===Perhitungan Lingkaran===");
        lingkaran1.input();
        lingkaran1.tampilanHasil(lingkaran1.diameter);
    }
    
}
