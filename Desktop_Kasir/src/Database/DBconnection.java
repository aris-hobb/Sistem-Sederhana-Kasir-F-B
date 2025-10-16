package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String url = "jdbc:postgresql://localhost:5432/kasirfnb";
    private static final String user = "adminkasirfnb";
    private static final String password = "kasirfnb123";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
