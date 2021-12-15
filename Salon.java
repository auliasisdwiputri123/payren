package PAYREN;

import java.io.*;

public class Salon {
    StrucMember[] daftar =new StrucMember[100];
    int banyakData =1;InputStreamReader data =new InputStreamReader(System.in);
    BufferedReader member = new BufferedReader(data);String lagi, kodeLayanan, tempBayar;
    double totalAkhir, total, totalHargaMember,totalHargaNonMember, dibayar, kembali, diskonHargaMember,totalBiayaNonMember;
    String pilih, kodeMember, pilihSubMenu, konfirmMember,namaMember, jenisKelaminMember, alamatMember, noTelponMember;
  
    public void tambahDataMember(String IdMember, String name,String sex, String address, String phone) {
      daftar[banyakData] =new StrucMember();
      daftar[banyakData].kode =IdMember;
      daftar[banyakData].setNama(name);
      daftar[banyakData].setJenisKelamin(sex);
      daftar[banyakData].setAlamat(address);
      daftar[banyakData].setNoTelpon(phone);
      banyakData++;
    }
  
    public void inputDataMember(String IdMember, String namaMember, String jenisK, String alamat, String noTelpon) throws IOException {
      try {System.out.println("");
      System.out.print("Id Member : ");
      IdMember = member.readLine();
      System.out.print("Nama : ");
      namaMember =member.readLine();
      System.out.print("Jenis Kelamin : "); 
      jenisK =member.readLine();
      System.out.print("Alamat : ");
      alamat =member.readLine();
      System.out.print("No. Telpon : ");noTelpon =member.readLine();
      if (IdMember.equals("") || namaMember.equals("")) {
        throw new NullPointerException();
      }
        tambahDataMember(IdMember, namaMember, jenisK, alamat,noTelpon);
        subMenuMember();
        } catch (NullPointerException npe) {
        System.out.println("");
        System.out.println("ID ATAU NAMA TIDAK BOLEH KOSONG");
    }
        subMenuMember();
    }
    public void tampilkanDataMember() throws IOException {
      System.out.println("");
      daftar[banyakData] =new StrucMember();
      if (banyakData == 1) {System.out.println("Data masih kosong");
      } else {
        for (int isi =1; 
        isi < banyakData; 
        isi++) {
        System.out.println("----------------------");
        System.out.println(" Tampilan Data Member ");
        System.out.println("----------------------");
        System.out.println("Data ke " + isi);
        System.out.println("Id member : " +daftar[isi].kode);
        System.out.println("Nama : " +daftar[isi].getNama());
        System.out.println("Jenis Kelamin : " +daftar[isi].getJenisKelamin());
        System.out.println("Alamat : " +daftar[isi].getAlamat());
        System.out.println("No. Telepon : " +daftar[isi].getNoTelpon());
        System.out.println("");
        }
      }
      subMenuMember();
    }
  
    public String getNamaMember(String IdMember) {
      for (int isi =1; isi < banyakData;isi++) {
        if (IdMember.equals(daftar[isi].kode)) {
          return daftar[isi].getNama();
         }
      }
      return null;
    }
      public String getAlamatMember(String IdMember) {
        for (int isi =1; isi < banyakData; isi++) {
          if (IdMember.equals(daftar[isi].kode)) {
            return daftar[isi].getAlamat();
        } 
      }
      return null;
    }
  
    public void caridataMember() throws IOException {
      try {
      String kodeMemberCari;
      System.out.print("Masukkan Id Member :");
      kodeMemberCari =member.readLine();
      if (kodeMemberCari.equals("")) {
        throw new NullPointerException();
      }
      System.out.println("Data dari kode member " +kodeMemberCari);
      System.out.println("Nama : " +getNamaMember(kodeMemberCari));
      System.out.println("Alamat : " +getAlamatMember(kodeMemberCari));
  
      } catch (NullPointerException ex) {System.out.println("Id Member harus di isi !");
     }
    }
    
    public void menuUtama() throws IOException {
      System.out.println("=======================");
      System.out.println("| MENU APLIKASI SALON |");
      System.out.println("=======================");
      System.out.println("1. Member");
      System.out.println("2. Non member");
      System.out.println("3. Keluar");
      System.out.println("--------------------------");
      System.out.print("Silahkan Masukkan pilihan : ");
    }
  
    public void subMenuMember() throws IOException {
    }
      StrucLayanan[] info = new StrucLayanan[25];
      int banyakLayanan = 1;
  
    public void tambahLayanan(String code, String nameOfServeice,double priceOfService) {
      info[banyakLayanan] = new StrucLayanan();
      info[banyakLayanan].idLayanan =code;
      info[banyakLayanan].setNamaLayanan(nameOfServeice);
      info[banyakLayanan].setHarga(priceOfService);
      banyakLayanan++;
    }
  
    public void dispaly() {
      for (int i =1; i < banyakLayanan; i++) {
        System.out.println("Id layanan : " +info[i].idLayanan);
        System.out.println("Layanan : " +info[i].getNamaLayanan());
        System.out.println("Harga : " +info[i].getPrice());
        System.out.println("");
      }
    }
  
    public void hitung() throws IOException {
      System.out.println("");
      dispaly();
      total = 0;
      do {
        System.out.println("--------------------------");
        System.out.print("Silahkan masukkan pilihan : ");
        kodeLayanan = member.readLine();
        for (int isiLay = 1; isiLay < banyakLayanan; isiLay++){
          if (kodeLayanan.equals(info[isiLay].idLayanan)) {
            System.out.println("nama : " +info[isiLay].getNamaLayanan());
            System.out.println("harga : " +info[isiLay].getPrice());
            total = total + info[isiLay].getPrice();
            isiLay =isiLay + 1;
          }
        }
        System.out.println("--------------------");
        System.out.print("apakah lagi ? [y/t] ");
        lagi =member.readLine();
      } while (lagi.equals("y"));
    }
  
    public void totalAkhirCustomer(double totalHarga, double hargaDiskon) throws IOException {
      try {
        hargaDiskon = 0.1 * total;
        totalHarga =total - hargaDiskon;
        System.out.println("Total Biaya : " + totalHarga);
        System.out.print("Dibayar : ");
        tempBayar = member.readLine();
        if (tempBayar.equals("")) {
          throw new NullPointerException();
        }
        dibayar = Double.parseDouble(tempBayar);
        kembali = dibayar - totalHarga;
        if (kembali < 0) {
          throw new ArithmeticException();
          }
          System.out.println("Kembali : " + kembali);
        } catch (NumberFormatException xy) {
            System.out.println("ERROR: NOMINAL YANG DIMASUKKANSALAH !");
        } catch (NullPointerException ab) {
            System.out.println("ERROR: NOMINAL HARUS DISI !");
        } catch (ArithmeticException cd) {
            System.out.println("ERROR: NOMINAL KEMBALIAN TIDAK BOLEH NEGATIF !");
        }
        System.out.println("");
    }
  
    public void totalAkhirCustomer(double totalHarga) throws IOException {
      try {
        System.out.println("Total Biaya : " + total);
        if (total > 150000) {totalBiayaNonMember = total - 10000;
          System.out.println("Dapat potongan harga sebesar10000");
          System.out.println("Total Biaya : " +totalBiayaNonMember);
          System.out.print("Dibayar : ");
          tempBayar = member.readLine();
        if (tempBayar.equals("")) {
          throw new NullPointerException();
          }
          dibayar = Double.parseDouble(tempBayar);
          totalHarga =dibayar - totalBiayaNonMember;
          if (totalHarga <0) {
            throw new ArithmeticException();
          }
            System.out.println("Kembali : " + totalHarga);
            } else {
              System.out.print("Dibayar : ");
              tempBayar = member.readLine();
              if (tempBayar.equals("")) {
                throw new NullPointerException();
                }
                dibayar = Double.parseDouble(tempBayar);
                totalHarga =dibayar - total;
                if (totalHarga <0) {
                  throw new ArithmeticException();
                }
                System.out.println("Kembali : " + totalHarga);
                }
              } catch (NullPointerException cd) {
                System.out.println("NOMINAL HARUS DISI !");
              } catch (NumberFormatException ef) {
                System.out.println("NOMINAL YANG DIMASUKKAN SALAH !");
              } catch (ArithmeticException gh) {
                System.out.println("ERROR: NOMINAL KEMBALIAN TIDAK BOLEH NEGATIF !");
              }
              System.out.println("");
            }
}
