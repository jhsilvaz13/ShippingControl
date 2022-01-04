/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import Mundo.estructuras.listas.*;
import java.io.*;

/**
 *
 * @author jhonz
 */
public class Embarcacion {

    static final String PATH = "..\\ShippingControl\\data\\embarcaciones.csv";

    //PARAMETROS
    private String IMO;
    private String nombreEmbarcacion;
    private String bandera;
    private int tipoDeEmbarcacion;
    private int capacidad;
    private int contenedoresAct;
    private boolean disponibilidad;
    private Stack<String> container;

    public Embarcacion(String IMO, String nombreEmbarcacion, String bandera,
            int tipoDeEmbarcacion, int capacidad, int contenedoresAct, boolean disponibilidad) {
        this.IMO = IMO;
        this.nombreEmbarcacion = nombreEmbarcacion;
        this.bandera = bandera;
        this.tipoDeEmbarcacion = tipoDeEmbarcacion;
        this.capacidad = capacidad;
        this.contenedoresAct = contenedoresAct;
        this.disponibilidad = disponibilidad;
    }


    
    public static void registrosCSVEmbarcaciones(Queue<Embarcacion> cola) {
        LinkedList<Embarcacion> listaEmbarcaciones = cola;
        Node<Embarcacion> iter = listaEmbarcaciones.getBeginNode();
        try {   
                new FileWriter(PATH, false).close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        while (iter!= null) {
            try {
                FileWriter writeFile = new FileWriter(PATH, true);
                PrintWriter registrar = new PrintWriter(writeFile);
                registrar.println(iter.data.getIMO() + "," + iter.data.getNombreEmbarcacion() + "," + iter.data.getBandera()
                        + "," + iter.data.getNombreEmbarcacion() + "," + String.valueOf(iter.data.getCapacidad()) + ","
                        + String.valueOf(iter.data.getContenedoresAct()) + "," + iter.data.getDisponibilidad());
                registrar.close();
                iter = iter.nextNode;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getIMO() {
        return IMO;
    }

    public String getNombreEmbarcacion() {
        return nombreEmbarcacion;
    }

    public String getBandera() {
        return bandera;
    }

    public int getTipoDeEmbarcacion() {
        return tipoDeEmbarcacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getContenedoresAct() {
        return contenedoresAct;
    }

    public String getDisponibilidad() {
        if (disponibilidad) {
            return "Disponible";
        } else {
            return "No disponible";
        }
    }

}
