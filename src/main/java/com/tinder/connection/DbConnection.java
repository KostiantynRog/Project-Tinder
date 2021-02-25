package com.tinder.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private String path = "jdbc:postgresql://ec2-54-247-158-179.eu-west-1.compute.amazonaws.com:5432/dc63pq3mn9vl9d";
    private String username = "lqqpdmsfgjwrri";
    private String password = "682e15056783c86eaa8f2f0aa3847718338e240ad818ac79af56dd5ad65080a8";

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
