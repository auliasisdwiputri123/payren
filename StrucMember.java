package PAYREN;

public class StrucMember {
    public String kode;
    private String nama;
    private String jenisKelamin;
    private String alamat;
    private String noTelpon;

    public void setNama(String namaMember) {
        nama = namaMember;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(String jenisK) {
        jenisKelamin = jenisK;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public void setAlamat(String alamatMember) {
        alamat = alamatMember;
    }

    public String getAlamat() {
        return alamat;
    }
    public void setNoTelpon(String noTelponMember) {
        noTelpon = noTelponMember;
    }
    public String getNoTelpon() {
        return noTelpon;

    }
}
