/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.io.*;
import java.util.Scanner;

public class RegistroEmbarcaciones {
    static final Scanner in = new Scanner(System.in);
    
    public static String[] datosEmbarcación(){
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
        
        return datos;
    }
}
