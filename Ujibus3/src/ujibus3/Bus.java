/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus3;

/**
 *
 * @author Arian
 */
class Bus {
    private double penumpang,maxpenumpang,Average,BeratP,TotalB;
    
    // konstruktor
    public Bus(double maxpenumpang){
        this.maxpenumpang=maxpenumpang; 
        penumpang = 0;
        BeratP = 0;
        TotalB = 0;
    }
    
    //method mutator 
    public void pluspenumpang(double penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
        
    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }
    public void getWeight(double beratPenumpang){
        TotalB=this.BeratP+BeratP;
        this.BeratP=TotalB;
        
    }
    public void getAverage(){
    Average=TotalB / penumpang;
    this.Average = Average;
    }     
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
        System.out.println("Rata rata berat adalah ="+Average);
        System.out.println("");
        System.out.println("");
}
}
