package laboratorio.pkg2;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static laboratorio.pkg2.Laboratorio2.usuarios;

public class Aplication {

    public ArrayList<Usuario> usuarios;
    public Usuario user;

    public Aplication(ArrayList usuarios, Usuario user) {
        this.usuarios = usuarios;
        this.user = user;
        usuarios.remove(user);
    }

    public void menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenidos " + user.getNombre() + "!\n"
                + "1. Agregar amigos\n"
                + "2. Solicitudes\n"
                + "3. Enviar Mensajes\n"
                + "4. Buzón\n"
                + "5. Eliminar Mensajes\n"
                + "6. Eliminar Amigos\n"
                + "7. Log out\n"
                + "Ingrese una opcion."));
        switch (opcion) {
            case 1:
                addamigos();
                break;
            case 2:
                solicitudes();
                break;
            default:
                throw new AssertionError();
        }
    }

    public void addamigos() {
        String lista = "";
        for (Object t : usuarios) {
            if (t instanceof Usuario) {
                lista += (usuarios.indexOf(t) + 1) + "- " + ((Usuario) t).getNombre() + "\n";
            }
        }
        int amigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingrese el index del usuario cual desea mandar una solicitud.")) - 1;
        usuarios.get(amigo).addsolicitud(usuarios.get(amigo).getNombre(),user.getNombre(),"Pendiente");
        user.addsolicitud(usuarios.get(amigo).getNombre(),user.getNombre(),"Esperando");
        JOptionPane.showMessageDialog(null, "La solicitud para "+usuarios.get(amigo).getNombre()+"a sido enviada.");
        menu();
    }

    private void solicitudes() {
        String lista = "";
        for (Object t : user.solicitudes) {
            if (t instanceof Usuario) {
                lista += (user.solicitudes.indexOf(t) + 1) + "- " + t.toString() + "\n";
            }
        }
        int user = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingrese el index del usuario que desea eliminar.")) - 1;
    }
}
