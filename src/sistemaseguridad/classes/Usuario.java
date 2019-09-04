/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaseguridad.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Nicolas PC
 */
public class Usuario {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<String> contrasenas = new ArrayList<>(3);

    private static String usuario = "UserL";
    private static String contrasena = "12345";
    private static Usuario user = new Usuario();

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.usuario);
        hash = 53 * hash + Objects.hashCode(this.contrasena);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nUsuario:");
        sb.append(usuario);
        sb.append("\nContrasena:");
        sb.append(contrasena);
        return sb.toString();
    }

    public static void validarCredenciales() {
        String usuarioT, contrasenaT;
        int intentos = 0, accion;
        boolean good = false;
        do {
            System.out.println();
            System.out.println("INICIO DE SESION");
            System.out.print("DIGITE SU NOMBRE DE USUARIO: ");
            usuarioT = leer.next();
            System.out.print("DIGITE SU CONTRASENA: ");
            contrasenaT = leer.next();
            leer.nextLine();
            System.out.println();
            if (usuarioT.equals(usuario) && contrasenaT.equals(contrasena)) {
                good = true;
                System.out.println("SE HA INICIADO CORRECTAMENTE - LOS DATOS SON VALIDOS");
                System.out.println("BIENVENIDO DE NUEVO " + usuarioT);
                System.out.println("DESEA CAMBIAR SU CONTRASENA?");
                System.out.println("| 1. SI || 0. NO |");
                accion = leer.nextInt();
                if (accion == 1) {
                    user.cambiarContrasena();
                }
            } else {
                intentos = intentos + 1;
                good = false;
                System.out.print("ERROR DE VALIDACION ");
                System.out.println("INTENTALO DE NUEVO");
                if (intentos == 3) {
                    System.out.println("DEMASIADOS INTENTOS");
                    System.out.println("CIERRE EL PROGRAMA Y VUELVA A INTENTAR");
                }
            }
        } while (good == false && intentos < 3);

    }

    public static void cambiarContrasena() {
        String newContra, prueba;
        boolean update = false;
        do {
            System.out.println("ESCRIBA SU NUEVA CONTRASENA");
            newContra = leer.next();
            System.out.println("VERIFIQUE SU NUEVA CONTRASENA");
            prueba = leer.next();
            leer.nextLine();
            System.out.println();
            if (newContra.equals(prueba)) {
                contrasenas.add(contrasena);
                if (contrasenas.contains(newContra)) {
                    System.out.println("CONTRASENA YA UTILIZADA");
                    System.out.println("NO PUEDE REPETIR CLAVES QUE YA HA USADO");
                    update = false;
                } else {
                    user.setContrasena(newContra);
                    System.out.println("SU CONTRASENA HA SIDO ACTUALIZADA");
                    update = true;
                }
            } else {
                System.out.println("LAS CLAVES NO COINCIDEN");
                System.out.println("INTENTALO DE NUEVO");
                update = false;
            }
        } while (update == false);

    }

}
