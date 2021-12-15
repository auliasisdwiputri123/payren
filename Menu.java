package PAYREN;

import java.io.*;

public class Menu extends Salon {
    @Override
    public void menuUtama() throws IOException {
        super.menuUtama();
        pilih = member.readLine();
        if (pilih.equals("1")) {
            subMenuMember();
        } else if (pilih.equals("2")) {
            hitung();
        } else if (pilih.equals("3")) {
            Systemexit(0);
        }
        System.out.println("");
    }

    private void Systemexit(int i) {
    }

    @Override
    public void subMenuMember() throws IOException {
        super.subMenuMember();
        System.out.println("");
        System.out.println("==============================");
        System.out.println("1. Buat data member baru");
        System.out.println("2. Tampilkan semua data member");
        System.out.println("3. Transaksi Member");
        System.out.println("4. Kembali");
        System.out.println("----------------------------");
        System.out.print("Silahkan masukkan pilihan : ");

        pilihSubMenu = member.readLine();
        if (pilihSubMenu.equals("1")) {
            inputDataMember(namaMember, kodeMember, jenisKelaminMember, alamatMember, noTelponMember);
        } else if (pilihSubMenu.equals("2")) {
            tampilkanDataMember();
        } else if (pilihSubMenu.equals("3")) {
            do {
                caridataMember();
                System.out.println("Apakah data benar ? [y/t] ");
                konfirmMember = member.readLine();
            } while (konfirmMember.equals("t"));
            hitung();
            totalAkhirCustomer(totalHargaMember, diskonHargaMember);
            menuUtama();

        } else if (pilihSubMenu.equals("4")) {
            menuUtama();
        }
    }
}
