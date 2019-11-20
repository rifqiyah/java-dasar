/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author RIFQIYAH
 */
public class Biodata {
     public static void main (String[]args){
        BufferedReader input = new  BufferedReader (new InputStreamReader (System.in) );
        
        String Nama,Alamat,Jurusan,Jenis_Kelamin,Nim,Tahun_Angkatan;
       
        try{
             
            System.out.print("Masukkan Nama              : ");
            Nama = input.readLine();
            
            System.out.print("Masukkan Alamat            : ");
            Alamat = input.readLine();
            
            System.out.print("Masukkan Jurusan           : ");
            Jurusan = input.readLine();
            
            System.out.print("Masukkan Jenis_Kelamin     : ");
            Jenis_Kelamin = input.readLine();
            
            System.out.print("Masukkan Nim               : ");
            Nim = input.readLine();
            
            System.out.print("Masukkan Tahun_Angkatan    : ");
            Tahun_Angkatan = input.readLine();
            
            System.out.println("==================================   ");
            
                System.out.println("Nim         :    " + Nim);          
		System.out.println("Nama    :    " + Nama);         
		System.out.println("Kelas   :    " + Alamat);         
		System.out.println("Jurusan :    " + Jurusan);         
		System.out.println("Semester:    " + Tahun_Angkatan);  
                System.out.println("Semester:    " + Jenis_Kelamin);
                
        }catch (IOException ex){
            System.out.println("");
            
        }
     }
}
