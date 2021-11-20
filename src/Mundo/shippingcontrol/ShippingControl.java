/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mundo.shippingcontrol;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author jhonz
 */
public class ShippingControl {

    /**
     * @param args the command line arguments
     */
    static final String PATH="..\\ShippingControl\\src\\Mundo\\shippingcontrol\\usuarios.csv";
    static  final Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
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
                    System.out.println("Yessss");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
