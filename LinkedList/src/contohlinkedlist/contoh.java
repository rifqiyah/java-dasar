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
public class contoh {
    public static void main (String[]args){
        //membuat Intence/ Object dari Linked List
        System.out.println(" Membuat Intence Linked List");
        LinkedList<String> buah = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: "+buah.size());
        
        //menambahkan Element pada Object LinkedList
        System.out.println(" Meenambahkan Element Linked List");
        buah.addFirst("kelapa");//Menambahkan Data pada Index Teratas 
        buah.addLast("kelengkeng");//Menambahkan Data pada Index Tebawah
        
        buah.set(2, "cece");// Mengubah Data pada No Index 2
        buah.set(5, "dhyanput");// Mengubah Data pada No Index 5
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);
        
        //mengambil element pada Linked List
        System.out.println(" Mengambil Element Linked List");
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk"); //No Index 0
        buah.add("Jambu"); //No Index 1
        buah.add("Apel"); //No Index 2
        buah.add("Melon"); //No Index 3
        buah.add("Semangka"); //No Index 4
        
        //Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: "+buah.getFirst());
        //Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: "+buah.getLast());
        //Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: "+buah.get(1)); 
        //Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: "+buah.get(3));
        
        // Menghapus Element Linked List
        System.out.println(" Menghapus Elemnet Linked List");
        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        
        buah.removeFirst(); //Menghapus Data pada Urutan Paling Atas
        buah.removeLast(); //Menghapus Data pada Urutan Paling Bawah
        buah.remove(1); //Menghapus Data pada No Index 1
        
        //Mencetak Data
        System.out.println(buah);
        
        
    }
}
