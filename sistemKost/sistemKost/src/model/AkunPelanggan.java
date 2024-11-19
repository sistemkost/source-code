/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

//import java.sql.ResultSet;

public class AkunPelanggan{
    private final String username;
    private final String password;
    private final String noTelp;
    
    public AkunPelanggan(String username, String password, String noTelp) {
        this.username = username;
        this.password = password;
        this.noTelp = noTelp;
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getNoTelp() {
        return noTelp;
    }
}