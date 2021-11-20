package Mundo.shippingcontrol;

import static Mundo.shippingcontrol.ShippingControl.PATH;
import static Mundo.shippingcontrol.ShippingControl.in;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Ingreso_usuario extends ShippingControl {
    
    public static void registrarUsuario(String username, String password) {
        
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            PrintWriter registrar = new PrintWriter(writeFile);
            registrar.println(username + "," + password);
            registrar.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void logIn(String username, String password) {
        
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
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (find_user == true){
            System.out.println("Inicio de sesion exitoso");
            Usuario usuario=new Usuario(username);
        }else{
            System.out.println("Nombre o contraseña incorrectos, por favor intente de nuevo.");
            System.out.print("Nombre de usuario: ");
            username = in.next();
            System.out.print("Contraseña: ");
            password = in.next();
            logIn(username, password);
        }
    }
}
