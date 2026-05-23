package edu.sdccd.cisc191.Jdbcstuff;


import java.sql.Connection;

public class DatabaseInitializer {

    public static void initialize() {
        try(Connection conn = DatabaseConfig.getConnection();
            var stmt = conn.createStatement()){
            stmt.execute("""
            CREATE TABLE IF NOT EXISTS users( id  INT AUTO_INCREMENT  PRIMARY KEY,
            username VARCHAR(100) NOT NULL UNIQUE,
                password VARCHAR(100) NOT NULL)
""");


        } catch(Exception e) {
            throw new RuntimeException("error running new database", e);
        }}}
