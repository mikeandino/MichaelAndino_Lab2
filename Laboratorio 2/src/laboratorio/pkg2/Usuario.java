package laboratorio.pkg2;

import java.util.ArrayList;

public class Usuario {
    public String nombre;
    public int edad;
    public String lugar;
    public String username; 
    public String pass; 
    public ArrayList amigos;
    public ArrayList mensajes;

    public Usuario(String nombre, int edad, String lugar, String username, String pass) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugar = lugar;
        this.username = username;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return nombre
                +"\n     Edad: " + edad 
                + "\n     Lugar de Nacimiento: " + lugar 
                + "\n     Usuario: " + username 
                + "\n     Password: " + pass;
    }
    
    
}
