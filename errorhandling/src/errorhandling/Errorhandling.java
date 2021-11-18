/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;

/**
 *
 * @author Arian
 */
public class Errorhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            int x=10;
            int y=0;
            int z=x / y;
            System.out.println(z);
        }
        catch(Exception err){
            System.out.println(err.getMassage());
        }
    }
    
}
