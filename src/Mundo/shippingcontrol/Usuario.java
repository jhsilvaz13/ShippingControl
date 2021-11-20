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
    
    public void registroLlegadaEmbarcación(){
        System.out.println(String.format("%10s", "---Bienvenido al Sistema de Regitro de Embarcaciones Entrantes---"
                + "\nPor favor los siguientes datos de la embarcación"));
        System.out.print("IMO: ");
        System.out.print("IMO: ");
        System.out.print("IMO: ");
        System.out.print("IMO: ");
        System.out.print("IMO: ");
        Embarcacion entrante=new Embarcacion(in.nextInt(),in.next(),in.next(),in.next());
    }
    
}
