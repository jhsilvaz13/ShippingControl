package Mundo.shippingcontrol;

import java.io.*;
import java.util.Scanner;

public class ShippingControl {

    /**
     * @param args the command line arguments
     */
    static final String PATH = "..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";
    static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        
        String res;
        boolean repeat_loop = false;
        String username, password;
        System.out.println("Bienvenido(a) a Shipping Control");
        System.out.println("¿Desea iniciar sesion o registrarse?");
        
        while(repeat_loop != true){            
            System.out.println("1.) Iniciar sesion.");
            System.out.println("2.) Registrarse.");
            res = in.nextLine();
            try{
                if (Integer.parseInt (res) == 1) {
                    System.out.print("Nombre de usuario: ");
                    username = in.next();
                    System.out.print("Contraseña: ");
                    password = in.next();
                    Ingreso_usuario.logIn(username, password);
                    repeat_loop = true;
                }else if (Integer.parseInt (res) == 2){
                    System.out.print("Cree un nombre de usuario: ");
                    username = in.next();
                    System.out.print("Contraseña: ");
                    password = in.next();
                    Ingreso_usuario.registrarUsuario(username, password);
                    System.out.println("Usuario creado exitosamente, en momentos sera devuelto a la pantalla principal para iniciar sesion.");
                    in.nextLine();
                }else{
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            }catch (Exception e){
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
            }
        }
    }
}
