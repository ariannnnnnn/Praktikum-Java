/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolabolaa;

/**
 *
 * @author Arian
 */
public class bolabolabolaa {
    private double r;

    public void setJarijari(int newJarijari){
    System.out.println("Jaring jaring bola = "+r);
    }
    
    public void showDiameter(){
        double diameter = r * 2;
        System.out.println("Diameter bola = "+diameter);
    }
    public void showLuasPermukaan(){
        double LP;
        if(r %7==0){
            LP = 4*22/7*r*r;
            System.out.println("Luas permukaan bole = "+LP);
        }else{
            LP = 4*3.14*r*r;
            System.out.println("Luas permukaan bole = "+LP);
        }
    }
    public void showVolume(){
    double V;
    if(r %7==0){
        V=4/3*22/7*r*r*r;
        System.out.println("Volume bola = "+V);
    }else{
        V=4/3*3.14*r*r*r;
        System.out.println("Volume bola = "+V);
    }
}
}
