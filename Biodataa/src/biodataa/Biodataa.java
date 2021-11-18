package biodataa;
import java.util.Scanner;
public class Biodataa {
    public static void main(String[] args) {
        String nama,namaa,tempat,asalk,asals,hobi,motivasi,prestasi;
        int tanggal;
        double luas;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(">>>>>Biodata<<<<<");
        System.out.print("<<<<<Nama Lengkap = ");
        nama=scan.nextLine();
        System.out.print("<<<<<Nama Akrab = ");
        namaa=scan.nextLine();
        System.out.print("<<<<<Tempat Lahir = ");
        tempat=scan.nextLine();
        System.out.print("<<<<<Tanggal Lahir = ");
        tanggal=scan.nextInt();
        System.out.print("<<<<<Asal Kota = ");
        asalk=scan.nextLine();
        System.out.print("<<<<<Asal SMP = ");
        asals=scan.nextLine();
        System.out.print("<<<<<Hobi = ");
        hobi=scan.nextLine();
        System.out.print("<<<<<Motivasi = ");
        motivasi=scan.nextLine();
        System.out.print("<<<<<Prestasi = ");
        prestasi=scan.nextLine();
    }
    
}
