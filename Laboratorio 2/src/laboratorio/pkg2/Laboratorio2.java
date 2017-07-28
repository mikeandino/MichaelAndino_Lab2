package laboratorio.pkg2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Laboratorio2 {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Usuario> usuarios = new ArrayList();

    public static void main(String[] args) {
        crear();
    }

    static void menu() {
        int menu = Integer.parseInt(JOptionPane.showInputDialog(("=====Red Social Light=====\n"
                + " 1.Crear un Usuario\n"
                + " 2.Modificar un Usuario\n"
                + " 3.Eliminar un Usuario\n"
                + " 4.Login\n"
                + " 5.Listado\n"
                + " 6.Salida\n"
                + " Ingrese una opcion. ")));
        switch (menu) {
            case 1:
                crear();
                break;
            case 2:
                modificar();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                login();
                break;
            case 5:
                listar();
                break;
            default:
                System.out.println("Opcion invalida!");
        }
    }

    static void crear() {
        String nombre = JOptionPane.showInputDialog("Ingrese un nombre.");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad. "));
        String lugar = JOptionPane.showInputDialog("Ingrese su lugar de nacimiento.");
        String user = JOptionPane.showInputDialog("Ingrese su nombre de usuario.");
        for (Usuario object : usuarios) {
            while (user.equals(object.getUsername())) {
                user = JOptionPane.showInputDialog("El nombre de usuario ya existe, ingrese otro nombre.");
            }
        }
        String pass = JOptionPane.showInputDialog("Ingrese su password.");
        usuarios.add(new Usuario(nombre, edad, lugar, user, pass));
        menu();
    }

    static void modificar() {
        String lista = "";
        for (Object t : usuarios) {
            if (t instanceof Usuario) {
                lista += (usuarios.indexOf(t) + 1) + "- " + ((Usuario) t).getNombre() + "\n";
            }
        }
        int user = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingrese el index del usuario a modificar.")) + 1;
        int cambio = Integer.parseInt(JOptionPane.showInputDialog("1: Nombre\n"
                + "2: Edad\n"
                + "3: Lugar\n"
                + "4: Usuario\n"
                + "5: Password\n"
                + "Ingrese lo que desea modificar."));
        switch (cambio) {
            case 1:
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre.");
                usuarios.get(user).setNombre(nombre);
                break;
            case 2:
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad."));
                usuarios.get(user).setEdad(edad);
                break;
            case 3:
                String lugar = JOptionPane.showInputDialog("Ingrese el nuevo lugar de nacimiento.");
                usuarios.get(user).setLugar(lugar);
                break;
            case 4:
                String user2 = JOptionPane.showInputDialog("Ingrese el nuevo nombre.");
                for (Usuario object : usuarios) {
                    while (user2.equals(object.getUsername())) {
                        user2 = JOptionPane.showInputDialog("El nombre de usuario ya existe, ingrese otro nombre.");
                    }
                }
                usuarios.get(user).setUsername(user2);
                break;
            case 5:
                String pass = JOptionPane.showInputDialog("Ingrese la nueva password.");
                usuarios.get(user).setPass(pass);
                break;
            default:
                System.out.println("Opcion invalida!");
        }
        menu();
    }

    static void eliminar() {
        String lista = "";
        for (Object t : usuarios) {
            if (t instanceof Usuario) {
                lista += (usuarios.indexOf(t) + 1) + "- " + ((Usuario) t).getNombre() + "\n";
            }
        }
        int user = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingrese el index del usuario que desea eliminar.")) + 1;
        usuarios.remove(user);
        menu();
    }

    static void login() {
        String user = JOptionPane.showInputDialog("Ingrese su usuario.");
        String pass = JOptionPane.showInputDialog("Ingrese su password.");
        boolean verificar=false;
        for (Usuario usuario : usuarios) {
            if (user.equals(usuario.getUsername()) && pass.equals(usuario.getPass())) {
                verificar = true;
            }
        }
        if (verificar) {
            //Remplazar!
            JOptionPane.showMessageDialog(null, "Si");
        }else{
            //Remplazar!
            JOptionPane.showMessageDialog(null, "Usuario/Password incorrecta.");
            menu();
        }
    }

    static void listar() {
        String lista = "";
        for (Object t : usuarios) {
            if (t instanceof Usuario) {
                lista += (usuarios.indexOf(t) + 1) + "- " + t.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, lista);
        menu();
    }
}
