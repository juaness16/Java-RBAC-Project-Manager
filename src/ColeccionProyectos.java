
/**
 * Write a description of class ColeccionProyectos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

/**
 * Colección de proyectos.
 */
public class ColeccionProyectos
{
    ArrayList<Proyecto> proyectos;

    /**
     * Constructor.
     */
    public ColeccionProyectos()
    {
        proyectos = new ArrayList<Proyecto>();
    }

    /**
     * Agrega proyecto.
     */
    public void agregarProyecto(Proyecto proyecto)
    {
        proyectos.add(proyecto);
    }

    /**
     * Muestra proyectos.
     */
    public void mostrarProyectos()
    {
        for(Proyecto p : proyectos)
        {
            p.mostrarProyecto();
            System.out.println();
        }
    }

    /**
     * Guarda proyectos.
     */
    public void guardarProyectos()
    {
        try
        {
            FileWriter escritor =
                new FileWriter("proyectos.txt");

            for(Proyecto p : proyectos)
            {
                escritor.write(
                    p.nombreProyecto + "," +
                    p.descripcion + "," +
                    p.duracion + "\n"
                );
            }

            escritor.close();

            System.out.println("Proyectos guardados.");
        }

        catch(Exception e)
        {
            System.out.println("Error.");
        }
    }

    /**
     * Lee proyectos.
     */
    public void leerProyectos()
    {
        try
        {
            File archivo =
                new File("proyectos.txt");

            Scanner lector =
                new Scanner(archivo);
                proyectos.clear();

            while(lector.hasNextLine())
            {
                String linea =
                    lector.nextLine();

                String datos[] =
                    linea.split(",");

                String nombre =
                    datos[0];

                String descripcion =
                    datos[1];

                int duracion =
                    Integer.parseInt(datos[2]);

                Proyecto p =
                    new Proyecto(nombre,
                                 descripcion,
                                 duracion);

                proyectos.add(p);
            }

            lector.close();

            System.out.println("Proyectos leídos.");
            mostrarProyectos();
        }

        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
