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
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public Bus3(int maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(int penumpang)
    {
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang=temp;
        }     
        }    
        
        public void getpenumpang(int password){
        if (password==24){
            System.out.println("Password anda benar");
}else{
            System.out.println("Password anda salah");
        }
}
        public void cetakpenumpang()
        {
            System.out.println("Penumpang bus sekarang = "+penumpang);
            System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
        }
}