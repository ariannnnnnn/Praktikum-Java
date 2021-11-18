/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Arian
 */
public class cobalah {
public static void main (String [] args){
    Line uji = new Line (2.5,3,4,5);
    Line awal = new Line (3,4,5,6);
    uji.getLength();
    uji.isGreater(uji, awal);
    System.out.println(uji.isGreater(uji,awal));
}
}


