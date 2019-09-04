
package sistemaseguridad;

import java.util.Scanner;
import sistemaseguridad.classes.Usuario;


public class SistemaSeguridad {
    
    static Scanner leer = new Scanner(System.in);    
    private static int accion = 0;
    
    static Usuario usuario = new Usuario();

   
    public static void main(String[] args) {
        SistemaSeguridad ss = new SistemaSeguridad();
        ss.openSystem();
    }
    
    public static void openSystem() {
        do {
            System.out.println("BIENVENIDO A SU SISTEMA DE VERIFIFACION");
            usuario.validarCredenciales();            
            System.out.println("DESEA REPETIR EL PROGRAMA?");
            System.out.println(" 1. SI");
            System.out.println(" 0. NO");
            accion = leer.nextInt();
        } while (accion > 0);
        
        System.out.println("SESION CERRADA");
        System.out.println("VUELVA PRONTO");
        
    }
     
}
