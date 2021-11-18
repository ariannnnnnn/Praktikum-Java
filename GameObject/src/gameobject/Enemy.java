/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

/**
 *
 * @author Arian
 */
public class Enemy extends GameObject{
    public void setName(String name){
    super.name=name;
    }
    public String getname(){
        return name;
    }
    public void setdamage(int damage){
        super.Damage=damage;
    }    
    public int getdamage(){
        return Damage;
    }
    public void setHP(int HP){
        super.HP=HP;
    }
    public int getHP(){
        return HP;
    }
    public void cetak(){
        System.out.println("Nama player = "+getname());
        System.out.println("Hit Points = "+getHP());
        System.out.println("Damage     = "+getdamage());
    }
        
}

