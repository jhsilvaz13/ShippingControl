package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import Mundo.shippingcontrol.*;

public abstract class Ingreso_usuario {
    
    private static String username;
    private static String password;
    static final String PATH = "..\\ShippingControl\\data\\usuarios.csv";


    public static void Registro( String puerto, String bodegas) {
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            PrintWriter registrar = new PrintWriter(writeFile);
            registrar.println(Ingreso_usuario.username + "," + Ingreso_usuario.password+","+puerto+","+bodegas);
            registrar.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean Ingreso(String nombreUsuario, String contraseña) {
        boolean loop;
        String username, password;
        username =nombreUsuario;
        password =contraseña;
        String linea;
        boolean find_user = false;
        System.out.println(nombreUsuario+"/"+contraseña);
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
            loop = true;
            return loop;
        } else {
            loop = false;
            return loop;
        }
    }
    
    public static void clear(javax.swing.JPanel panel){
         for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof javax.swing.JTextField){
                ((javax.swing.JTextField)panel.getComponents()[i]).setText("");
            }
            else if(panel.getComponents()[i] instanceof javax.swing.JPasswordField){
                ((javax.swing.JPasswordField)panel.getComponents()[i]).setText("");
            }
        }
    }
    
    public static void setCredenciales(String username, String password){
        Ingreso_usuario.username=username;
        Ingreso_usuario.password=password;
    }
    
    public static String[] getCredencialesPuerto(){
        String linea;
            try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                    return valores;
            }
        } catch (Exception e) {
            return null;
        }
            return null;
    }
}

