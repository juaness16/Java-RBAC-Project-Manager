
/**
 * Write a description of class Permiso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * Clase que relaciona Usuario y Proyecto.
 */
public class Permiso
{
    Usuario usuario;
    Proyecto proyecto;
    String rol;
    String nivelAcceso;
    String fechaAsignacion;
    /**
     * Constructor de Permiso.
     */
    public Permiso(Usuario usuario, Proyecto proyecto, String rol, String nivelAcceso, String fechaAsignacion)
    {
        this.usuario = usuario;
        this.proyecto = proyecto;
        this.rol = rol;
        this.nivelAcceso = nivelAcceso;
        this.fechaAsignacion = fechaAsignacion;
    }

    /**
     * Muestra los datos del permiso.
     */
    public void mostrarPermiso()
    {
        usuario.mostrarUsuario();

        proyecto.mostrarProyecto();

        System.out.println("Rol: " + rol);
        System.out.println("Nivel acceso: " + nivelAcceso);
        System.out.println("Fecha: " + fechaAsignacion);
    }
}
