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
public class Persegi extends BangunDatar{
    public void Persegi (){
        double sb,lb,kb;
        Scanner c = new Scanner(System.in);
        System.out.println("PERSEGI");
        System.out.println("======");
        System.out.println("Masukkan sisi :");
        sb = c.nextDouble();
        lb = sb*sb;
        kb = 4*sb;
        System.out.println("Luas Persegi adalah :"+lb);
        System.out.println("Keliling Persegi adalah :"+kb);
    }
}
