/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studykasus;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIFQIYAH
 */
public class mahasiswa {
    public static void main (String[]args) {
       //membuat object array list dengan tipe data String
       List <String> mahasiswa =  new ArrayList<>();
       //menambahkan Data String pada Object mahasiswa
       mahasiswa.add ("Rifqiyah");
       mahasiswa.add ("Ainun Gita");
       mahasiswa.add ("Elmaidah");
       mahasiswa.add ("Dyanput");
       
       //membuat object array dengan tipe data Integer
       List <Integer> nim = new ArrayList<>();
       //menambahkan data integer pada objek nim
       nim.add (001);
       nim.add (002);
       nim.add (003);
       nim.add (004);
       
       //mencetak nilai semua nilai menggunakan for-loop
       System.out.println (mahasiswa);
       System.out.println (nim);
    }
}