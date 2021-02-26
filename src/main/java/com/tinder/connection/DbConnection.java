package com.tinder.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String path = "jdbc:postgresql://ec2-34-203-255-149.compute-1.amazonaws.com:5432/d1f8rcke0pddcb?password=502e3859de9d715ea9c63f5114e4b9276d130b9a3d4937309f7bb17242b986ff&sslmode=require&user=qxzmabpushcemd";
    private String username = "qxzmabpushcemd";
    private String password = "502e3859de9d715ea9c63f5114e4b9276d130b9a3d4937309f7bb17242b986ff";

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
