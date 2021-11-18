/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

/**
 *
 * @author Arian
 */
public class Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nilai suku pertama(a) adalah 5, Selisih antara nilai suku-suku yang berdekatan (b) adalah 3, tampilkan
      //deret mulai suku pertama sampai ke 10, dan tampilkan jumlah deret tersebut
      int a=6;
      int b=12;
      int n=10;
      int u=a;
      int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<n;i++){
//            System.out.println("i="+i);
            if(i>4){
            System.out.println(u);
        }
        
            u=u+b;
            s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
    
}
