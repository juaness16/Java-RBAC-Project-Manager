
/**
 * Write a description of class ColeccionPermisos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * Colección de permisos.
 */
public class ColeccionPermisos
{
    ArrayList<Permiso> permisos;

    /**
     * Constructor.
     */
    public ColeccionPermisos()
    {
        permisos = new ArrayList<Permiso>();
    }

    /**
     * Agrega permiso.
     */
    public void agregarPermiso(Permiso permiso)
    {
        permisos.add(permiso);
    }

    /**
     * Muestra permisos.
     */
    public void mostrarPermisos()
    {
        for(Permiso p : permisos)
        {
            p.mostrarPermiso();
            System.out.println();
        }
    }

    /**
     * Guarda permisos.
     */
    public void guardarPermisos()
    {
        try
        {
            FileWriter escritor =
                new FileWriter("permisos.txt");

            for(Permiso p : permisos)
            {
                escritor.write(
                    p.usuario.nombre + ", " +
                    p.proyecto.nombreProyecto + ", " +
                    p.rol + ", " +
                    p.nivelAcceso + ", " +
                    p.fechaAsignacion + "\n");
            }

            escritor.close();

            System.out.println(
                "Permisos guardados.");

            mostrarPermisos();
        }

        catch(Exception e)
        {
            System.out.println("Error.");
        }
    }

    /**
     * Lee permisos.
     */
    public void leerPermisos()
    {
        try
        {
            File archivo =
                new File("permisos.txt");

            Scanner lector =
                new Scanner(archivo);

            permisos.clear();

            while(lector.hasNextLine())
            {
                System.out.println(
                    lector.nextLine());
            }

            lector.close();
        }

        catch(Exception e)
        {
            System.out.println("Error.");
        }
    }

    /**
     * Muestra proyectos de un usuario.
     */
    public void proyectosPorUsuario(String nombre)
    {
        for(Permiso p : permisos)
        {
            if(p.usuario.nombre
                .equalsIgnoreCase(nombre))
            {
                System.out.println(
                    p.proyecto.nombreProyecto +
                    ", " +
                    p.rol +
                    ", " +
                    p.nivelAcceso);
            }
        }
    }

    /**
     * Muestra usuarios de un proyecto.
     */
    public void usuariosPorProyecto(String proyecto)
    {
        for(Permiso p : permisos)
        {
            if(p.proyecto.nombreProyecto
                .equalsIgnoreCase(proyecto))
            {
                System.out.println(
                    p.usuario.nombre +
                    ", " +
                    p.rol +
                    ", " +
                    p.nivelAcceso);
            }
        }
    }
}