/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop4;

/**
 *
 * @author Arian
 */
public class Loop4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dari Deret Aritmatika tersebut buatlah matrix 3 kolom dengan model seperti pada gambar A
        int a=6;
        int b=12;
        int u=a;
        int s=a;
        System.out.println("Deret aritmatikanya adalah");
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
            for(int i=0;i<5;i++){
                for(int j=0;j<5-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
                }
                System.out.println();
            }
        s=s-u;
        System.out.println("Jumlah deret aritmatikanya adalah");
    }
    
}

