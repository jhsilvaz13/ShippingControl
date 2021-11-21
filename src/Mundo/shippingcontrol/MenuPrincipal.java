package Mundo.shippingcontrol;

import java.io.*;
import java.util.Scanner;

public class MenuPrincipal {

    static final String PATH = "..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";
    static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Shipping Control");
        System.out.println("¿Desea iniciar sesion o registrarse?");
        boolean loop = false;
        while (loop != true) {
            System.out.println("1.) Iniciar sesion.");
            System.out.println("2.) Registrarse.");
            String res;
            res = in.nextLine();
            try {
                if (Integer.parseInt(res) == 1) {
                    loop = Ingreso_usuario.Ingreso();
                    if (loop == false){
                        loop = Ingreso_usuario.Ingreso();
                    }
                } else if (Integer.parseInt(res) == 2) {
                    Ingreso_usuario.Registro();
                    System.out.println("Usuario creado exitosamente, en momentos sera devuelto a la pantalla principal para iniciar sesion.");
                } else {
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
            }
        }
        System.out.println("1.) Menú Embarcaciones.");
        System.out.println("2.) Menú Usuarios.");
        String res;
        res = in.nextLine();
        try {
            if (Integer.parseInt(res) == 1){
                
            }
        }
        catch (Exception e){
            System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
        }
    }
}
