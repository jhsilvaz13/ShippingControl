/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import Mundo.shippingcontrol.Embarcacion;
import Mundo.estructuras.listas.*;

public class RegistroEmbarcaciones extends MenuPrincipal {

    public static void interfazRegistroEmbaraciones() {
        boolean loop = false;
        while (loop != true) {
            System.out.println("1.) Registrar entrada de embarcación.");
            System.out.println("2.) Registrar salida de embarcación.");
            System.out.println("3.) Mostrar embarcaciones actuales");
            System.out.println("4.) Ultima embarcacion en salir.");
            System.out.println("5.) Regresar al menu pricipal");
            String res;
            res = in.next();
            try {
                if (Integer.parseInt(res) == 1) {
                    puerto.registrarLlegadaEmbarcacion(datosEmbarcación());
                    in.nextLine();
                } else if (Integer.parseInt(res) == 2) {
                    System.out.print("Se ha desembarcado la embarcación con IMO: ");
                    System.out.println(puerto.registrarSalidadDeEmbarcacion().data.getIMO());
                } else if (Integer.parseInt(res) == 3) {
                    System.out.println("Mostrar datos embarcaciones");
                    PrintEmbarcaciones();
                } else if (Integer.parseInt(res) == 4) {
                    try {
                        System.out.println("La ultima embarcacion que abandono el puerto fue: "
                                + puerto.retornarUltimaEmbarcacionSalida().data.getIMO());
                    } catch (Exception e) {
                        System.out.println("No se encontro la ultima embarcacion que abandono el puerto");
                    }

                } else if (Integer.parseInt(res) == 5) {
                    loop = true;
                    Ingreso_usuario.menuPrincipal();
                } else {
                    System.out.println("Por favor, ingrese solo el numero de la opcion que desea.");
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese solo el numero de la opcion que desea." + e.getMessage());
            }
        }
    }

    public static String[] datosEmbarcación() {
        String[] datos = new String[7];
        try {
            System.out.println(String.format("%10s", "---Bienvenido al Sistema de Regitro de Embarcaciones Entrantes---"
                    + "\nPor favor ingrese los siguientes datos de la embarcación"));
            System.out.print("IMO: ");
            datos[0] = in.next();
            System.out.print("Nombre de la embarcación: ");
            datos[1] = in.next();
            System.out.print("Bandera: ");
            datos[2] = in.next();
            System.out.print("Tipo de Embarcación: ");
            datos[3] = in.next();
            System.out.print("Capacidad: ");
            datos[4] = in.next();
            System.out.print("Número de Contenedores Actual: ");
            datos[5] = in.next();
            System.out.print("Disponibilidad: ");
            datos[6] = in.next();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return datos;
    }

    public static void PrintEmbarcaciones() {
        LinkedList<Embarcacion> PrintE = puerto.GetEmbarcaciones();
        Node<Embarcacion> Iterador = PrintE.getBeginNode();
        if (PrintE == null) {
            System.out.println("No hay embarcaciones registradas.");
        } else {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-25s%-20s\n","IMO","Nombre","Bandera","Tipo",
                    "Capacidad", "Contenedores Actuales","Disponibilidad");
            while (Iterador != null) {
                
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-25s%-20s\n",Iterador.data.getIMO(),Iterador.data.getNombreEmbarcacion(),
                        Iterador.data.getBandera(),Iterador.data.getTipoDeEmbarcacion(),Iterador.data.getCapacidad(),
                        Iterador.data.getContenedoresAct(),Iterador.data.getDisponibilidad());
                Iterador = Iterador.nextNode;
            }
        }
    }
}
