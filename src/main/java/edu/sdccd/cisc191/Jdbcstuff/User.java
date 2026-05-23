package edu.sdccd.cisc191.Jdbcstuff;

public class User {
    private String login;
    private String passwordHash;
    public User(String login, String passwordHash){
        if(login == null || login.trim().isEmpty()){
            throw new IllegalArgumentException("please choose a new login");
        }
        if(passwordHash == null || passwordHash.trim().isEmpty()){
            throw new IllegalArgumentException("please choose a new password");
        }
        this.login = login;
        this.passwordHash = passwordHash;

    }
    public String getLogin(){
        return login;
    }
    public String getPasswordHash(){return passwordHash;}

}
