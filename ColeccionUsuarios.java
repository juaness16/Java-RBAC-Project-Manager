
/**
 * Write a description of class ColeccionUsuarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * Colección de usuarios.
 */
public class ColeccionUsuarios
{
    ArrayList<Usuario> usuarios;

    /**
     * Constructor.
     */
    public ColeccionUsuarios()
    {
        usuarios = new ArrayList<Usuario>();
    }

    /**
     * Agrega usuario.
     */
    public void agregarUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }

    /**
     * Muestra usuarios.
     */
    public void mostrarUsuarios()
    {
        for(Usuario u : usuarios)
        {
            u.mostrarUsuario();
            System.out.println();
        }
    }

    /**
     * Guarda usuarios en archivo.
     */
    public void guardarUsuarios()
    {
        try
        {
            FileWriter escritor =
                new FileWriter("usuarios.txt");

            for(Usuario u : usuarios)
            {
                escritor.write(
                    u.nombre + "," +
                    u.edad + "," +
                    u.correo + "\n"
                );
            }

            escritor.close();

            System.out.println(
                "Usuarios guardados.");
        }

        catch(Exception e)
        {
            System.out.println(
                "Error.");
        }
    }

    /**
     * Lee usuarios desde archivo.
     */
    public void leerUsuarios()
    {
        try
        {
            File archivo =
                new File("usuarios.txt");

            Scanner lector =
                new Scanner(archivo);
                usuarios.clear();

            while(lector.hasNextLine())
            {
                String linea =
                    lector.nextLine();

                String datos[] =
                    linea.split(",");

                String nombre =
                    datos[0].trim();

                int edad =
                    Integer.parseInt(
                        datos[1].trim());

                String correo =
                    datos[2].trim();

                Usuario u =
                    new Usuario(
                        nombre,
                        edad,
                        correo);

                usuarios.add(u);
            }

            lector.close();

            System.out.println("Usuarios leídos.");
            mostrarUsuarios();
        }

        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}