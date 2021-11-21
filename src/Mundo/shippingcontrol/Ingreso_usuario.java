package Mundo.shippingcontrol;

import static Mundo.shippingcontrol.MenuPrincipal.in;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ingreso_usuario extends MenuPrincipal {

    static final String PATH = "..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";

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
            Usuario usuario = new Usuario(username);
            loop = true;
            return loop;
        } else {
            System.out.println("Nombre o contraseña incorrectos, por favor intente de nuevo.");
            loop = false;
            return loop;
        }
    }
}
