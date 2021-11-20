/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import java.util.Scanner;

/**
 *
 * @author jhonz
 */
public class Usuario {
    
    private String nombreUsuario;
    private final Scanner in= new Scanner(System.in);
    public Usuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
    }
    public void interfazInicial(){
        boolean repeatLoop=false;
        String res;
          while(repeatLoop != true){            
            System.out.println("1.) Registrar entrada de embarcación.");
            System.out.println("2.) Registrar salida de embarcación.");
            res = in.nextLine();
            try{
                if (Integer.parseInt (res) == 1) {
                    registroLlegadaEmbarcación();
                }else if (Integer.parseInt (res) == 2){
                    
                }else{
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            }catch (Exception e){
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
            }
        }
        
    }
    public void registroLlegadaEmbarcación(){
        String [] datos=datosEmbarcación();
        Embarcacion entrante=new Embarcacion(datos[0],datos[1],datos[2],datos[3]);
    }
     public void registrarSalidaDeEmbarcación(){
         
     }
     
     public String[] datosEmbarcación(){
        String [] datos=new String [4];
        String IMO;
        String nombreEmbarcacion, bandera,tipoDeEmbarcacion;
        System.out.println(String.format("%10s", "---Bienvenido al Sistema de Regitro de Embarcaciones Entrantes---"
                + "\nPor favor los siguientes datos de la embarcación"));
        System.out.print("IMO: ");
        datos[0]=in.next();
        System.out.print("Nombre de la embarcación: ");
        datos[1]=in.next();
        System.out.print("Bandera: ");
        datos[2]=in.next();
        System.out.print("Tipo de Embarcación");
        datos[0]=in.next();
        return  datos;
     }
}
