package Interfaz;

import Mundo.shippingcontrol.*;
import java.io.*;
import java.util.Scanner;

public class MenuPrincipal {
    static final String PATH = "..\\ShippingControl\\data\\usuarios.csv";
    static final Scanner in = new Scanner(System.in);
    protected static Puerto puerto;

    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Shipping Control");
        int x = 2;
        Ingreso_usuario.interfazRegistroInicio();
    }
}
