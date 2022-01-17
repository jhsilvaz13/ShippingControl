/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import Mundo.estructuras.listas.*;
import Mundo.estructuras.trees.*;
import java.io.*;

/**
 *
 * @author jhonz
 */
public class Embarcacion implements Comparable<Embarcacion>{

    static final String PATH = "..\\ShippingControl\\data\\embarcaciones.csv";

    //PARAMETROS
    private int IMO;
    private String nombreEmbarcacion;
    private String bandera;
    private int tipoDeEmbarcacion;
    private int capacidad;//numero de contenedores
    private int contenedoresAct;
    private boolean disponibilidad;
    private Stack<String> container;//pila de contenedores

    public Embarcacion(int IMO, String nombreEmbarcacion, String bandera,
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
                        + "," + iter.data.getTipoDeEmbarcacion() + "," + String.valueOf(iter.data.getCapacidad()) + ","
                        + String.valueOf(iter.data.getContenedoresAct()) + "," + iter.data.getDisponibilidad());
                registrar.close();
                iter = iter.nextNode;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getIMO() {
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

    public int getDisponibilidad() {
        if (disponibilidad) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int compareTo(Embarcacion o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.IMO>o.IMO){
            return 1;
        }else if(this.IMO<o.IMO){
            return -1;
        }
        return 0;
    }

    public void  setActuales(int actual){
       this.contenedoresAct=actual;
    }
    public void setDisponibilidad(boolean disp){
        this.disponibilidad=disp;
    }
    
    public static Object FiltrarIMO(int IMO, Puerto puerto) {
        AVLtree<Embarcacion> arbolIMO = new AVLtree<Embarcacion>();
        Object rowData[] = new Object[7];
        try {
            LinkedList<Embarcacion> PrintE = puerto.GetEmbarcaciones();
            if (PrintE == null) {
                return rowData;
            } else {
                Node<Embarcacion> Iterador = PrintE.getBeginNode();
                while (Iterador != null) {
                    if (Iterador.data.getDisponibilidad() == 1) {
                        Embarcacion a = new Embarcacion(Iterador.data.getIMO(), Iterador.data.getNombreEmbarcacion(), Iterador.data.getBandera(),
                                Iterador.data.getTipoDeEmbarcacion(), Iterador.data.getCapacidad(), Iterador.data.contenedoresAct,true);
                        arbolIMO.insert(a);
                        Iterador = Iterador.nextNode;
                    } else {
                        Embarcacion a = new Embarcacion(Iterador.data.getIMO(), Iterador.data.getNombreEmbarcacion(), Iterador.data.getBandera(),
                                Iterador.data.getTipoDeEmbarcacion(), Iterador.data.getCapacidad(), Iterador.data.contenedoresAct,false);
                        arbolIMO.insert(a);
                        Iterador = Iterador.nextNode;
                    }
                }
                Embarcacion busqueda = new Embarcacion(IMO, "a", "a", 0, 0, 0, true);
                
                try {
                    rowData[0] = arbolIMO.contains(busqueda).data.IMO;
                    rowData[1] = arbolIMO.contains(busqueda).data.nombreEmbarcacion;
                    rowData[2] = arbolIMO.contains(busqueda).data.bandera;
                    rowData[3] = arbolIMO.contains(busqueda).data.tipoDeEmbarcacion;
                    rowData[4] = arbolIMO.contains(busqueda).data.capacidad;
                    rowData[5] = arbolIMO.contains(busqueda).data.contenedoresAct;
                    if (arbolIMO.contains(busqueda).data.disponibilidad == true) {
                        rowData[6] = "Disponible";
                    } else {
                        rowData[6] = "No Disponible";
                    }
                    return rowData;
                } catch (Exception e) {
                    return rowData;
                }
            }
        } catch (Exception e) {
            return rowData;
        }
    }
}