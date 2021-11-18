/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop2;

/**
 *
 * @author Arian
 */
public class Loop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dari Deret Aritmatika tersebut buatlah matrix 3x4(3 baris x 4 kolom)
      int a=6;
      int b=12;
      int u=a;
      int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
            System.out.print(u+"\t");
            u=u+b;
            s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret aritmatika adalah "+s);
    }
            
    
}
