package PAYREN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
private final String db = "PAYREN";
    private final String url = "jdbc:postgresql://localhost:5432/" + db;
    private final String user = "payren";
    private final String password = "payren123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}

