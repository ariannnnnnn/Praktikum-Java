/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overridingg;

/**
 *
 * @author Arian
 */
public class Overridingg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tumbuhan melati = new Tumbuhan();
        Mawar mawar = new Mawar();
        Tumbuhan miripmawar = new Tumbuhan();
       
        miripmawar.makan();
        mawar.duri();
    }
    
}
