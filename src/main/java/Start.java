import java.sql.*;

public class Start {

    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://WORKSTATION\\SQLEXPRESS01;" +
                "databaseName=MIDTech;" +
                "IntegratedSecurity=true;" +
                "encrypt=true;" +
                "trustServerCertificate=true";

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection established.");
        } catch (SQLException e) {
            System.out.println("Could not establish database connection.");
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Request could not be sent.");
            e.printStackTrace();
        }

        String sql = "SELECT * FROM Kunde";

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
