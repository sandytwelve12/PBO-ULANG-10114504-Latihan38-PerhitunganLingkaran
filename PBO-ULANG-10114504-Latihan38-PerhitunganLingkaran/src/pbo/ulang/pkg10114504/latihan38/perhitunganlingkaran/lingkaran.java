/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi class lingkaran
 */
class lingkaran {
    public double diameter;
    public double jariJari;
    double phi = 3.14;
    boolean cek ;
    Scanner scan = new Scanner(System.in);
    
    public void input(){
        String s;
         try
        {    
        System.out.print("Masukan Nilai Diameter Lingkaran = ");
        diameter = scan.nextInt();
        }
        catch (Exception e)
        {
            cek = false;
            System.out.println("Nilai Diameter tidak Sesusai");
   
        }
       
        
    } 
    
    public double hitungJariJari (double diameter){
        return diameter/2;
    }
    public double LuasLingkaran (double parJariJari){
        return phi*parJariJari*parJariJari;
    }
    public double kelilingLingkaran(double parJariJari){
        return 2*phi*parJariJari;
    }
    public void tampilanHasil(double diamaeter){
        System.out.println("===Hasil Perhitungn Lingakaran===");
        System.out.println("Jari Jari Lingkaran = "+hitungJariJari(diameter));
        System.out.println("Keliling Lingkaran = "+kelilingLingkaran(hitungJariJari(diameter)));
        System.out.println("Luas Lingakaran = "+LuasLingkaran(hitungJariJari(diameter)));
    }
    
}
