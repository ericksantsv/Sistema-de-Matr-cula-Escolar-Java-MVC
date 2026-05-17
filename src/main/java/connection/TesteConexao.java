package connection;

import connection.ConnectionFactory;

public class TesteConexao {

    public static void main(String[] args) {

        System.out.println(
                ConnectionFactory.getConnection()
        );
    }
}