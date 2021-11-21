/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author jhonz
 */
public class Embarcacion {
    static final String PATH = "..\\ShippingControl\\src\\Mundo\\shippingcontrol\\embarcaciones.csv";
    
    static final Scanner in = new Scanner(System.in);
    //PARAMETROS
    private String IMO;
    private String nombreEmbarcacion;
    private String bandera;
    private String tipoDeEmbarcacion;
    private int capacidad;
    private int contenedoresAct;
    private boolean disponibilidad;
    
    public Embarcacion(String IMO, String nombreEmbarcacion, String bandera,
            String tipoDeEmbarcacion, int capacidad, int contenedoresAct, boolean disponibilidad){
        this.IMO=IMO;
        this.nombreEmbarcacion=nombreEmbarcacion;
        this.bandera=bandera;
        this.tipoDeEmbarcacion=tipoDeEmbarcacion;
        this.capacidad=capacidad;
        this.contenedoresAct=contenedoresAct;
        this.disponibilidad=disponibilidad;
    }
    public boolean LlegadaEmbarcación(){
        boolean loop = false;
        loop = true;
        return loop;
        
    }
    public static void LlegadaEmbarcacion(String [] datos){
        String [] datosem = new String [6];
        datosem = datos;
        if (datosem[6]=="Disponible"){
            Embarcacion entrante = new Embarcacion(datosem[0],datosem[1],datosem[2],datosem[3],Integer.parseInt(datosem[4]),
            Integer.parseInt(datosem[5]),true);
        }else
        {
            Embarcacion entrante = new Embarcacion(datosem[0],datosem[1],datosem[2],datosem[3],Integer.parseInt(datosem[4]),
            Integer.parseInt(datosem[5]),false);
        }
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            PrintWriter registrar = new PrintWriter(writeFile);
            registrar.println(datosem[0] + "," + datosem[1] + "," + datosem[2] + "," + datosem[3] + "," + datosem[4] + "," + datosem[5] + "," + datosem[6]);
            registrar.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
     public void registrarSalidaDeEmbarcación(){
         
     }
     
     public String[] datosEmbarcación(){
        String [] datos=new String [6];
        System.out.println(String.format("%10s", "---Bienvenido al Sistema de Regitro de Embarcaciones Entrantes---"
                + "\nPor favor los siguientes datos de la embarcación"));
        System.out.print("IMO: ");
        datos[0]=in.next();
        System.out.print("Nombre de la embarcación: ");
        datos[1]=in.next();
        System.out.print("Bandera: ");
        datos[2]=in.next();
        System.out.print("Tipo de Embarcación: ");
        datos[3]=in.next();
        System.out.print("Capacidad: ");
        datos[4]=in.next();
        System.out.print("Número de Contenedores Actual: ");
        datos[5]=in.next();
        System.out.print("Disponibilidad: ");
        datos[6]=in.next();
        
        
        return  datos;
     }
    
}
