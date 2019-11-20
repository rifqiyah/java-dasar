/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;
import java.util.Scanner;
/**
 *
 * @author RIFQIYAH
 */
public class PersegiPanjang {
    public void PersegiPanjang(){
        double pp,lep,lp,kp;
        Scanner d = new Scanner (System.in);
        System.out.println("PERSEGI PANJANG");
        System.out.println("===============");
        System.out.println("Masukkan panjang:");
        pp = d.nextDouble();
        System.out.println("Masukkan lebar:");
        lep = d.nextDouble();
        lp = pp*lep;
        kp = (2*pp)+(2*lep);
        System.out.println("Luas Persegi Panjang adalah : "+lp);
        System.out.println("Keliling Persegi Panjang adalah :"+kp);
    }
    
}
