/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero Hero = new Hero();
        Enemy Enemy = new Enemy();
        GameObject GameObject = new GameObject();
        
        Scanner input = new Scanner(System.in);
        GameObject.display();
        
        System.out.print("Masukan nama hero = ");
        Hero.setName(input.next());
        
        System.out.print("Masukan HP Hero = ");
        Hero.setHP(input.nextInt());
        
        System.out.print("Masukan Damage Hero = ");
        Hero.setdamage(input.nextInt());
        
        System.out.print("Masukan ID Hero = ");
        Hero.setID(input.nextInt());
        
        System.out.println("--------------");
        
        System.out.print("Masukan nama Enemy = ");
        Enemy.setName(input.next());
        
        System.out.print("Masukan HP enemy = ");
        Enemy.setHP(input.nextInt());
        
        System.out.print("Masukan Damage enemy = ");
        Enemy.setdamage(input.nextInt());;
        
        System.out.println(" ");
        System.out.println("  ");
        Hero.cetak();
        Enemy.cetak();
        
        if (Hero.HP>Enemy.HP){
            System.out.println(Hero.name + " Winner from "+ Enemy.name);
        }else{
            System.out.println(Hero.name + " Defeat from "+ Enemy.name);
        }
    }
    
}
