/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author RIFQIYAH
 */
public class Biodata {
    public static void main (String[]args){
        long Nim;
        int Tahun_Angkatan;
        String Nama,Alamat,Jurusan,Jenis_Kelamin;
        System.out.println("Sistem Input Biodata");
        
        Scanner input = new Scanner (System.in); //membuat objek
        
            
            
            System.out.print("Masukkan Nama              : ");
            Nama = input.nextLine();
            
            System.out.print("Masukkan Alamat            : ");
            Alamat = input.nextLine();
            
            System.out.print("Masukkan Jurusan           : ");
            Jurusan = input.nextLine();
            
            System.out.print("Masukkan Jenis_Kelamin     : ");
            Jenis_Kelamin = input.nextLine();
            
            System.out.print("Masukkan Nim               : ");
            Nim = input.nextLong();
            
             System.out.print("Masukkan Tahun_Angkatan   : ");
            Tahun_Angkatan = input.nextInt();
            
            System.out.println("==================================:   ");
            

                System.out.println("Nim     :    " + Nim);          
		System.out.println("Nama    :    " + Nama);         
		System.out.println("Kelas   :    " + Alamat);         
		System.out.println("Jurusan :    " + Jurusan);         
		System.out.println("Semester:    " + Tahun_Angkatan);  
                System.out.println("Semester:    " + Jenis_Kelamin);
                
    }
}

