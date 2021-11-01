/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.Scanner;

/**
 *
 * @author Arian
 */
public class mainLaundry {

    public static void main(String[] args) {
        //untuk input dari user
        Scanner input = new Scanner(System.in);

        //membuat variabel utk mengondisikan program masih berjalan atau berhenti
        boolean stay = true;

        //untuk menyimpan input user
        String key;

        //pembuatan object yang berisi daftar jenis laundry
        listJenisLaundry listlaundry = new listJenisLaundry();

        //pembuatan object yang berisi daftar petugas
        listPetugas listPetugas = new listPetugas();

        //pembuatan object yg berisi daftar client
        listClient listClient = new listClient();

        //selama nilai "stay" = true maka program terus berjalan
        while (stay) {

            //menu pilihan
            System.out.println("-- Laundry --");
            System.out.println("1. List Laundry");
            System.out.println("2. List Petugas");
            System.out.println("3. List Client");
            System.out.println("4. Transaksi");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            //pengkondisian pilihan menu
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");

                //menampilkan daftar jenis laundry
                listlaundry.viewJenisLaundry();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 2) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");

                //menampilkan daftar petugas
                listPetugas.viewListPetugas();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");

                //menampilkan daftar client
                listClient.viewListClient();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 5) {
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            } else if (menu == 4) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Transaksi Laundry ---");

                //variabel "jumlahLaundry" untuk menyimpan data 
                //banyaknya jenis laundry yg dipilih
                //variabel "selectedIDClient" utk menyimpan data id client yg dipilih
                int jumlahLaundry, selectedIDClient;

                System.out.print("Masukkan id client:");
                selectedIDClient = input.nextInt();

                // "foundIndex" menyimpan posisi index dari data client yg dipilih
                int foundIndex = listClient.cariClient(selectedIDClient);

                //"selectedClient" menyimpan data client yg dipilih
                Client selectedClient = listClient.list[foundIndex];

                System.out.print("\nMasukkan jumlah laundry pada transaksi ini:");
                jumlahLaundry = input.nextInt();

                //array transaksi dengan space sebanyak yg diinputkan user */
                Transaksi[] listTransaksi = new Transaksi[jumlahLaundry];

                //proses pemilihan jenis laundry
                for (int i = 0; i < jumlahLaundry; i++) {
                    //menampilkan daftar jenis laundry
                    listlaundry.viewJenisLaundry();

                    System.out.print("Pilih id laundry yang diinginkan:");
                    int selectedIDJenisLaundry = input.nextInt();

                    // "foundLaundry" menyimpan posisi index dari jenis laundry yg dipilih
                    int foundLaundry = listlaundry.cariJenisLaundry(selectedIDJenisLaundry);

                    //"selectedLaundry" menyimpan data jenis laundry yg dipilih
                    jenisLaundry selectedLaundry = listlaundry.list[foundLaundry];

                    System.out.print("\nMAsukkan jumlah "
                            + listlaundry.list[foundLaundry].getJenisLaundry()
                            + " yang dicuci: ");

                    int qty = input.nextInt();

                    //penambahan data transaksi ke dalam array
                    listTransaksi[i] = new Transaksi(selectedLaundry, qty);
                }

                // variabel untuk menyimpan total seluruh transaksi
                double total = 0;

                //menampilkan daftar transaksi
                System.out.println("--- List Transaksi ---");
                System.out.println("Client: " + selectedClient.getNama());
                System.out.println("Jenis Laundry \t Harga \t Jumlah \t Total");
                for (int i = 0; i < listTransaksi.length; i++) {
                    System.out.println(listTransaksi[i].selectedLaundry.getJenisLaundry() + " \t "
                            + listTransaksi[i].selectedLaundry.getHarga() + " \t "
                            + listTransaksi[i].jumlah + " \t " + listTransaksi[i].total);

                    total += listTransaksi[i].total;
                }

                System.out.println("Total Harga: " + total);

                ///engurangan saldo dari client yg dipilih
                listClient.list[foundIndex].kurangiSaldo(total);

                System.out.println("Press any key and enter...");
                key = input.next();
            }

        }

    }

}