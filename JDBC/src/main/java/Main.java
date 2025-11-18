import java.util.Scanner;

import model.Usuarios;
import repository.UsuariosRepository;

public class Main {
    public static void main(String[] args) {
        /* Creamos el scanner */
        Scanner scanner = new Scanner(System.in);

        /* Instanciamos nuestra clase */
        UsuariosRepository usuariosRepository = new UsuariosRepository();

        /***

        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del usuario: ");
        Long edad = scanner.nextLong();

        /* Creamos un usuario nuevo con los datos solicitados previamente *
        Usuarios usuario = new Usuarios(nombre, edad);

        /* LLamamos nuestro metodo insertar usuario pasandole el usuario nuevo creado *
        usuariosRepository.insertarUsuario(usuario);


        /* -------------------------------------------------------------- *

        System.out.println("Lista de usuarios");

        /* Recorremos la lista de usuarios retornada de nuestro repository *
        for (Usuarios usuarios : usuariosRepository.listarUsuarios()) {
            /* Imprimimos nuestra lista de usuario concatenando en llave valor *
            System.out.println("id " + usuarios.getId() + "\n" +
                    "nombre " + usuarios.getNombre() + "\n" +
                    "edad " + usuarios.getEdad());
        }

        ***/

        System.out.println("........................");



        Usuarios us1 = usuariosRepository.buscarUsuario("alejo");
        System.out.print(us1);

        System.out.println("........................");


        System.out.print("Ingrese el nuevo nombre del usuario: ");
        String nombreAct = scanner.nextLine();
        System.out.print("Ingrese la nueva edad del usuario: ");
        Long edadAct = scanner.nextLong();

        us1.setNombre(nombreAct);
        us1.setEdad(edadAct);

        usuariosRepository.actualizarUsuario(us1);
        System.out.println(us1);


        System.out.println("........................");



        scanner.close();
    }
}