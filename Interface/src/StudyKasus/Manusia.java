/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author RIFQIYAH
 */
  // Interface
interface Manusia {
  public void ManusiaSound(); // interface method (does not have a body)
  public void laugh(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Cewek implements Manusia {
  public void ManusiaSound() {
    // The body of animalSound() is provided here
    System.out.println("CECE'S says: wkwkwkwkwkw");
  }
  public void laugh() {
    // The body of sleep() is provided here
    System.out.println("kwwkkwkwwk");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Cewek myCECE = new Cewek();  // Create a Pig object
    myCECE.ManusiaSound();
    myCECE.laugh();
  }
}
