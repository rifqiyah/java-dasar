/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;
   import java.util.*;
/**
 *
 * @author RIFQIYAH
 */
public class BangunDatar {
    public static void main (String[] args){
        int pil;
        Lingkaran L = new Lingkaran();
        Segitiga S = new Segitiga ();
        Persegi P = new Persegi ();
        PersegiPanjang PP = new PersegiPanjang ();
        
        Scanner inp = new Scanner  (System.in);
        System.out.println("MENU");
        System.out.println("===");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. PersegiPanjang");
        System.out.println("5. Exit");
        System.out.println("Pilihan : ");
        
        pil = inp.nextInt();
        switch(pil){
            case 1 :L.Lingkaran();break;
            case 2 :S.Segitiga();break;
            case 3 :P.Persegi();break;
            case 4 :PP.PersegiPanjang();break;
            case 5 :System.exit(0);
        }
    }
}
        
        
    
    
    

