package Mundo.shippingcontrol;

import java.io.*;
import java.util.Scanner;

public class ShippingControl {

<<<<<<< HEAD
    static final String PATH = "..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";
    static final Scanner in = new Scanner(System.in);
=======
    /**
     * @param args the command line arguments
     */
    static final String PATH="..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";
    static  final Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        Usuario nuevo=new Usuario("Juan");
        nuevo.registroLlegadaEmbarcación();
        String username, password;
        int res;
        System.out.println("¿Desea iniciar sesion? 0/1");
        res=in.nextInt();
        if(res==1){
            System.out.print("Nombre de usuario: ");
            username=in.next();
            System.out.print("Contraseña: ");
            password=in.next();
            logIn(username, password);
        }else{
            System.out.print("Cree un nombre de usuario: ");
            username=in.next();
            System.out.print("Contraseña: ");
            password=in.next();
            registrarUsuario(username, password);
        }
        username= in.nextLine();
    }
    public static void registrarUsuario(String username, String password){
        try{
            FileWriter writeFile= new FileWriter(PATH, true);
            PrintWriter registrar=new PrintWriter(writeFile);
            registrar.println(username+","+password);
            registrar.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void logIn(String username, String password){
        String linea;
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] valores = linea.split(",");//arreglo de las columnas de cada linea
                if (valores[0].equals(username) && valores[1].equals(password)) {
                    System.out.println("Inicio de sesion exitoso");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
>>>>>>> 8a8082e (Clases usuario y embarcacion)

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
