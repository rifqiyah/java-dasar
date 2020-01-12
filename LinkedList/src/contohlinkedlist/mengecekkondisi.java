/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohlinkedlist;

import java.util.LinkedList;

/**
 *
 * @author RIFQIYAH
 */
public class mengecekkondisi {
    public static void main (String []args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");
        
        //Mengecek Apakah Data pada Objek barang, Kosong
        if(barang.isEmpty()){
            System.out.println("Data Kosong");
        }else{
            System.out.println("Data Penuh");
        }
        
        //Mengecek Apakah Sebuah Element ada Didalam LingkedList
        if(barang.contains("Komputer")){
            System.out.println("Barang Ditemukan");
        }else{
            System.out.println("Barang Tidak Ditemukan");   
        
        }
    }
}
