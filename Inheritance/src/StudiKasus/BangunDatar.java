/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudiKasus;

/**
 *
 * @author RIFQIYAH
 */
 public class BangunDatar {
    protected String Lingkaran = "Lingkaran";
    protected String Persegipanjang = "Persegi panjang";
    protected String Segitiga = "Segitiga";
    protected String Persegi = "Persegi";
    
     public void honk() { 
     System.out.println("Rumus Luas Bangun Datar");
     }
}
    class StudiKasus extends BangunDatar {
    private String modelLingkaran = "Lingkaran = phi x r x r ";
    private String modelPersegiPanjang = "Persegi Panjang = P x L ";
    private String modelSegitiga = "Segitiga = 1/2 x a x t ";
    private String modelPersegi = "Persegi = s x s ";

 public static void main(String[] args) {
    StudiKasus myLuas = new StudiKasus ();
    myLuas.honk();

    System.out.println (myLuas.modelLingkaran      );
    System.out.println (myLuas.modelPersegiPanjang );
    System.out.println (myLuas.modelSegitiga       );
    System.out.println (myLuas.modelPersegi        );
}
}
