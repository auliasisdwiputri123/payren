package PAYREN;

public class StrucLayanan {
    public String idLayanan;
    private String namaLayanan;
    private double harga;

    public void setNamaLayanan(String serviceName) {
        namaLayanan = serviceName;
    }
    public String getNamaLayanan() {
        return namaLayanan;
    }
    public void setHarga(double price) {
        harga = price;
    }
    public double getPrice() {
        return harga;
    }
}
