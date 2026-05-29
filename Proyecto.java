
/**
 * Write a description of class Proyecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Clase que representa un proyecto.
 */
public class Proyecto
{
    String nombreProyecto;
    String descripcion;
    int duracion;
    /**
     * Constructor de Proyecto.
     */
    public Proyecto(String nombreProyecto, String descripcion,int duracion)
    {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    /**
     * Muestra los datos del proyecto.
     */
    public void mostrarProyecto()
    {
        System.out.println("Proyecto: " + nombreProyecto);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Duracion: " + duracion + "meses");
    }
}