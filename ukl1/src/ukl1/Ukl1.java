/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl1;

/**
 *
 * @author Arian
 */
public class Ukl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a=14;
      int b=8;
      int n=25;
      int u=a;
      int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=13;i<n;i++){
            System.out.println(u);
            u=u+b;
            s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
    
}
