
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

/**
 * Clase principal.
 */
public class Main
{
    /**
     * Método principal.
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ColeccionUsuarios usuarios =
            new ColeccionUsuarios();

        ColeccionProyectos proyectos =
            new ColeccionProyectos();

        ColeccionPermisos permisos =
            new ColeccionPermisos();

        int opcion = -1;

        while(opcion != 0)
        {
            System.out.println();
            System.out.println("===== MENU =====");

            System.out.println("1. Leer usuarios");
            System.out.println("2. Agregar usuarios");
            System.out.println("3. Guardar usuarios");

            System.out.println("4. Leer proyectos");
            System.out.println("5. Agregar proyectos");
            System.out.println("6. Guardar proyectos");

            System.out.println("7. Leer permisos");
            System.out.println("8. Agregar permisos");
            System.out.println("9. Guardar permisos");
            System.out.println("10. Proyectos por usuario");
            System.out.println("11. Usuarios por proyecto");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            if(opcion == 1)
            {
                usuarios.leerUsuarios();
            }

            else if(opcion == 2)
            {
                System.out.println("Nombre:");

                String nombre =
                    sc.nextLine();

                System.out.println("Edad:");

                int edad =
                    sc.nextInt();

                sc.nextLine();

                System.out.println("Correo:");

                String correo =
                    sc.nextLine();

                Usuario u =
                    new Usuario(
                        nombre,
                        edad,
                        correo);

                usuarios.agregarUsuario(u);
            }

            else if(opcion == 3)
            {
                usuarios.guardarUsuarios();
            }

            else if(opcion == 4)
            {
                proyectos.leerProyectos();
            }

            else if(opcion == 5)
            {
                System.out.println("Nombre proyecto:");

                String nombre =
                    sc.nextLine();

                System.out.println("Descripcion:");

                String descripcion =
                    sc.nextLine();

                System.out.println("Duracion:");

                int duracion =
                    sc.nextInt();

                sc.nextLine();

                Proyecto p =
                    new Proyecto(
                        nombre,
                        descripcion,
                        duracion);

                proyectos.agregarProyecto(p);
            }

            else if(opcion == 6)
            {
                proyectos.guardarProyectos();
            }

            else if(opcion == 7)
            {
                permisos.leerPermisos();
            }

            else if(opcion == 8)
            {
                if(usuarios.usuarios.size() == 0 ||
                   proyectos.proyectos.size() == 0)
                {
                    System.out.println(
                        "Debe crear usuarios y proyectos primero."
                    );
                }

                else
                {
                    Usuario usuario =
                        usuarios.usuarios.get(0);

                    Proyecto proyecto =
                        proyectos.proyectos.get(0);

                    System.out.println("Rol:");

                    String rol =
                        sc.nextLine();

                    System.out.println("Nivel de acceso:");

                    String acceso =
                        sc.nextLine();

                    System.out.println("Fecha:");

                    String fecha =
                        sc.nextLine();

                    Permiso permiso =
                        new Permiso(
                            usuario,
                            proyecto,
                            rol,
                            acceso,
                            fecha);

                    permisos.agregarPermiso(permiso);

                    System.out.println(
                        "Permiso agregado.");
                }
            }

            else if(opcion == 9)
            {
                permisos.guardarPermisos();
            }
            
            else if(opcion == 10)
            { 
                System.out.println("Nombre usuario:");
                String nombre = sc.nextLine();
                permisos.proyectosPorUsuario(nombre);
            }
            
            else if(opcion == 11)
            {
                System.out.println("Nombre proyecto:");
                String proyecto = sc.nextLine();
                permisos.usuariosPorProyecto(proyecto);
            }

            else if(opcion == 0)
            {
                System.out.println(
                    "Programa finalizado.");
            }
        }
    }
}