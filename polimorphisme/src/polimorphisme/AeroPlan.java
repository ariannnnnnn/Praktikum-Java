/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme;

/**
 *
 * @author Arian
 */
public class AeroPlan extends Vehicle {
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }

  
    public static void main(String[] args) {
        // TODO code application logic here
 
  
        
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
        
    }
}
