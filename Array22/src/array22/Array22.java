/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array22;

/**
 *
 * @author Arian
 */
public class Array22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{6,3,3},{4,8,4}};
        int b[][]={{5,2},{6,7},{1,2}};
        int h[][]={{0,0},{0,0}};
            System.out.println("Hasil AxB");    
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                 h[i][j]=h[i][j]+a[i][k]*b[k][j];
        }
    }
 }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
             System.out.print(h[i][j]+"\t");
        }
          System.out.println();
 }
    }
}

