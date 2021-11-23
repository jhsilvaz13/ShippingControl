package Interfaz;

import Mundo.estructuras.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import Mundo.shippingcontrol.*;

public class Ingreso_usuario extends MenuPrincipal {

    public static void interfazRegistroInicio() {
        System.out.println("¿Desea iniciar sesion o registrarse?");
        boolean loop = false;
        while (loop != true) {
            System.out.println("1.) Iniciar sesion.");
            System.out.println("2.) Registrarse.");
            String res;
            res = in.nextLine();
            try {
                if (Integer.parseInt(res) == 1) {
                    loop = Ingreso();
                    if (loop == false) {
                        loop = Ingreso_usuario.Ingreso();
                    }
                } else if (Integer.parseInt(res) == 2) {
                    Registro();
                    System.out.println("Usuario creado exitosamente, en momentos sera devuelto a la pantalla principal para iniciar sesion.");
                } else {
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea." + e.getMessage());
            }
        }
        menuPrincipal();

    }

    public static void menuPrincipal() {
        boolean loop = false;
        while (loop != true) {
            System.out.println("1.) Menú Embarcaciones.");
            System.out.println("2.) Menú Usuarios.");
            String res;
            res = in.next();
            try {
                if (Integer.parseInt(res) == 1) {
                    loop = true;
                    RegistroEmbarcaciones.interfazRegistroEmbaraciones();
                } else if (Integer.parseInt(res) == 2) {
                    loop = true;
                    System.out.println("Mostrar Interfaz Usuarios");
                } else {
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
            }
        }
    }

    public static void Registro() {
        boolean loop;
        String username, password;
        System.out.print("Cree un nombre de usuario: ");
        username = in.next();
        System.out.print("Contraseña: ");
        password = in.next();
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            PrintWriter registrar = new PrintWriter(writeFile);
            registrar.println(username + "," + password);
            registrar.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        in.nextLine();
    }

    public static boolean Ingreso() {
        boolean loop;
        String username, password;
        System.out.print("Nombre de usuario: ");
        username = in.next();
        System.out.print("Contraseña: ");
        password = in.next();
        String linea;
        boolean find_user = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals(username) && valores[1].equals(password)) {
                    find_user = true;

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (find_user == true) {
            System.out.println("Inicio de sesion exitoso");
            puerto = new Puerto("PUERTO", 0, 0, 0, 0, 0);
            //Test.RegitrarNEmbarcaciones(100000l);
            puerto.cargarEmbarcacionesCSV();
            loop = true;
            return loop;
        } else {
            System.out.println("Nombre o contraseña incorrectos, por favor intente de nuevo.");
            loop = false;
            return loop;
        }
    }
}
