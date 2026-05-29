
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Clase que representa un usuario.
 */
public class Usuario
{
    String nombre;
    int edad;
    String correo;
    /**
     * Constructor de Usuario.
     */
    public Usuario(String nombre, int edad, String correo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    /**
     * Muestra los datos del usuario.
     */
    public void mostrarUsuario()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }
}