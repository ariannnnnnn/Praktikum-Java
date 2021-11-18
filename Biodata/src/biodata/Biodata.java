package biodata;
import java.util.Scanner;
class Biodata {
    private static Object scan;
    public static void main(String[] args) {
        String nama,namaa,tempat,asals,asalk,hobi,motivasi,prestasi;
        int tanggal;
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
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("<<<<<Asal Kota = ");
        asalk=keyboard.nextLine();
        System.out.print("<<<<<Asal SMP = ");
        asals=keyboard.nextLine();
        System.out.print("<<<<<Hobi = ");
        hobi=keyboard.nextLine();
        System.out.print("<<<<<Motivasi = ");
        motivasi=keyboard.nextLine();
        System.out.print("<<<<<Prestasi = ");
        prestasi=keyboard.nextLine();
                
    }
    
}
