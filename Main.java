package PAYREN;

import java.io.IOException;

public class Main {
    public static void main(String[] aegs) throws IOException {
        Menu data = new Menu();
        data.tambahLayanan("1", "potong rambut", 10000);
        data.tambahLayanan("2", "Creambath", 20000);
        data.tambahLayanan("3", "Hair Extention", 5000);
        data.tambahLayanan("4", "Rebonding", 100000);
        data.tambahLayanan("4", "Hair Spa", 30000);
        data.tambahLayanan("5", "Hair Colur", 50000);
        data.tambahLayanan("6", "Bleaching", 40000);
        data.tambahLayanan("7", "Catok", 10000);
        data.tambahLayanan("8", "Pedicure", 20000);
        data.tambahLayanan("9", "Manicure", 20000);
        data.menuUtama();
    }
}

