package edu.sdccd.cisc191.Jdbcstuff;
import java.security.MessageDigest;
public class PasswordUtil {
    public static String hash(String password){
        try{
            MessageDigest messaged = MessageDigest.getInstance("SHA-256");
            byte[] hashed = messaged.digest(password.getBytes());
            StringBuilder BuildString = new StringBuilder();
            for(byte s : hashed){
                BuildString.append(String.format("%02x", s));
            }
            return BuildString.toString();
        } catch(Exception e){
            throw new RuntimeException(e);
        }


    }

}
