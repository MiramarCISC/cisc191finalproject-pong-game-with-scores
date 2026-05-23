package edu.sdccd.cisc191.Jdbcstuff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface UserRepository {



    //creation
    void   createAccount(String username, String password);
    // find the username in database
    User findUserByUsername(String username);
    // for if it's true or false
    boolean usernameExists(String username);

    boolean checkLogin(String username, String password);

    List<Integer> getAllScores() throws SQLException;

    void saveScore(int score) throws SQLException;
}
