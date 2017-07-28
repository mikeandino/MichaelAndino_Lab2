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
                amigos();
                break;
            case 2:

                break;
            default:
                throw new AssertionError();
        }
    }

    public void amigos() {
        String lista = "";
        for (Object t : usuarios) {
            if (t instanceof Usuario) {
                lista += (usuarios.indexOf(t) + 1) + "- " + ((Usuario) t).getNombre() + "\n";
            }
        }
        int amigo = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingrese el index del usuario cual desea mandar una solicitud.")) - 1;
        usuarios.get(amigo).solicitudes.add(new Solicitudes(usuarios.get(amigo).getNombre(),user.getNombre(),"Pendiente"));
        user.solicitudes.add(new Solicitudes(usuarios.get(amigo).getNombre(),user.getNombre(),"Esperando"));
        
    }
}
