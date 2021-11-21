/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;


import java.util.Scanner;
import static Interfaz.MenuPrincipal.in;

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
}
