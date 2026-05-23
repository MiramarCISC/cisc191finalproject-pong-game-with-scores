package edu.sdccd.cisc191.Jdbcstuff;

import edu.sdccd.cisc191.PlayerStats;

import java.sql.SQLException;
import java.util.List;

public class UserService{
    private final UserRepository repository;
public UserService(UserRepository repository){
    this.repository = repository;
}
public boolean createAccount(String user, String password){
    if(user.isBlank() || password.isBlank()) {
        return false;
    }
        if (repository.usernameExists(user)) return false;

        String Hpassword = PasswordUtil.hash(password);
        repository.createAccount(user, Hpassword);
        return true;
    }
    public boolean login(String username, String password){
        if(username== null || username.isBlank()) return false;
        if(password == null || password.isBlank()) return false;
        String hashed = PasswordUtil.hash(password);
        return repository.checkLogin(username, hashed );
    }

    public List<Integer> getAllScores() throws SQLException {
    return repository.getAllScores();
    }
    public void saveScore(int score) throws SQLException {
        repository.saveScore(score);
    }
}
