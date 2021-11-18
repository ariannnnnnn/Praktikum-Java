/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array21;

/**
 *
 * @author Arian
 */
public class Array21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a[][]={{6,3,3},{4,8,4},{4,3,7}};
    int b[][]={{5,2,4},{6,7,5},{1,2,6}};
    System.out.println("Hasil A-B");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
    System.out.print(a[i][j]-b[i][j]+"\t");
    }
    System.out.println();
        }
    }
    
}
