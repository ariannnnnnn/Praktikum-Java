/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasgenap;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class UASGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int aa, bb, cc;
        System.out.println(">>>>>Silahkan pilih ingin menampilkan nilai ganjil/genap!");
        System.out.println(" ");
        System.out.println("<<<<<[1]untuk ganjil<<o>>[2]untuk genap");
        cc=input.nextInt();
        
        System.out.print("<o>Awal: ");
        aa=input.nextInt();
        
        System.out.print("<o>Akhir : ");
        bb=input.nextInt();
        
        System.out.println(" ");
        switch (cc){
        case 1 :  
        System.out.println("<<o>>Bilangan Ganjil");
        for(int i=aa;i<=bb;i++){
        if (i%2!=0)
        System.out.print(i+" ");
                    } 
                    break;
        case 2 :
        System.out.println("<<o>>Bilangan Genap");
        for(int i=aa;i<=bb;i++){
        if (i%2==0)
        System.out.print(i+" ");
                    }
                    break;
        }
        System.out.println("");
    }
}    
    
    
