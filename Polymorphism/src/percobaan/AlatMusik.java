/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author RIFQIYAH
 */
public class AlatMusik {
     public void AlatMusikSound() {
    System.out.println("The AlatMusik makes a sound");
  }
}

class drum extends AlatMusik {
  public void AlatMusikSound() {
    System.out.println("The drum says: dum tak dumdum tak dumdum");
  }
}

class gitar extends AlatMusik {
  public void AlatMusikSound() {
    System.out.println("The gitar says: jreng jreng jreng jreng");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    AlatMusik myAlatMusik = new AlatMusik();  // Create a  AlatMusik object
    AlatMusik mydrum = new drum();  // Create a drum object
   AlatMusik mygitar = new gitar();  // Create a gitar object
    myAlatMusik. AlatMusikSound();
    mydrum. AlatMusikSound();
    mygitar.AlatMusikSound();
  }
}
