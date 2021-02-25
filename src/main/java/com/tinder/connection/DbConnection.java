package com.tinder.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String path = "jdbc:postgresql://ec2-54-87-34-201.compute-1.amazonaws.com:5432/d6v53i4ls3ic6f?password=e12eac9edd68d754787d6973520eb9077ea57bad9530c03593448c0e68d92921&sslmode=require&user=vlmwivepgaengh";
    private String username = "vlmwivepgaengh";
    private String password = "e12eac9edd68d754787d6973520eb9077ea57bad9530c03593448c0e68d92921";

    private Connection connection = null;

    private Connection connect() throws SQLException {

        return DriverManager.getConnection(path, username, password);

    }

    public Connection connection() {

        if (connection == null) {
            try {
                connection = connect();
            } catch (SQLException e) {
                throw new IllegalStateException("Something went wrong.");
            }
        }

        return this.connection;

    }

}
