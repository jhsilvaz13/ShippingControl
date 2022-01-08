package Interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import Mundo.shippingcontrol.*;

public abstract class Ingreso_usuario extends main {

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

    public static void Registro(String nombreUsuario, String contraseña) {
        String username, password;
        username =nombreUsuario;
        password =contraseña;
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            PrintWriter registrar = new PrintWriter(writeFile);
            registrar.println(username + "," + password);
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
            puerto = new Puerto("PUERTO", 0, 0, 0, 0, 0);
            //Test.RegitrarNEmbarcaciones(100000l);
            puerto.cargarEmbarcacionesCSV();
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
    
}

