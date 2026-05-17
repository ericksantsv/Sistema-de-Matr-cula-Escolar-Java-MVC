package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL =
            "jdbc:mysql://localhost:3306/escola";

    private static final String USER = "root";

    private static final String PASSWORD = "123456";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

        } catch (Exception e) {

            throw new RuntimeException(
                    "Erro na conexão com banco",
                    e
            );
        }
    }
}