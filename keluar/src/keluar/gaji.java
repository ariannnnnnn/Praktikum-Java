package keluar;

/**
 *
 * @author Arian
 */
public class gaji extends gaji2 {
    int nomorpegawai;
    
    public void keterangan(){
        super.subdivisi();
        System.out.println("admin");
    }
    public void setnomor(int nomorpegawai){
        this.nomorpegawai=nomorpegawai;
    }
    public int getnomorpegawai(){
        return nomorpegawai;
    }
    public void gaji(int pokok,int bonus){
        int total =pokok*bonus;
        System.out.println("Gaji utama yang didapat = "+total);
    }
    public void gaji(int pokok,int bonus,int tambahan){
        int total = pokok*bonus*tambahan;
        System.out.println("gaji yang didapat jika bekerja dengan baik menjadi "+total);
    }
   
    @Override
    public void cetak(){
        System.out.print("nomor pegawai           = ");
    }
}


