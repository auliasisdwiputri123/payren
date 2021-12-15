package PAYREN;

import java.io.IOException;
import PAYREN.Koneksi;

public class Testing {
    public static void main(String[] aegs) throws IOException {
        Koneksi koneksi = new Koneksi();

        koneksi.connect();
    }
}
