package com.shadowdrone.abmpersona;

import javax.persistence.*;

/**
 * Usuario
 */
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "usuario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int usuarioId;
    private String userName;
    private String password;
    @Column (name= "email")
    private String userEmail;
    @Column(name = "persona_id")
    private int personaId;

    public Usuario (String userName, String password, String email){
        this.userName = userName;
        this.password = password;
        this.userEmail = email;
    }

    public Usuario(){

    }


    public Usuario (String password){
        this.password = password;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "Usuario [User Name=" + userName + ", Password=" + password + ", User Email=" + userEmail + "]";
    }

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public Usuario(int personaId) {
        this.personaId = personaId;
    }

   


}