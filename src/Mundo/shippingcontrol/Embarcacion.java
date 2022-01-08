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
                        + "," + iter.data.getNombreEmbarcacion() + "," + String.valueOf(iter.data.getCapacidad()) + ","
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

    public String getDisponibilidad() {
        if (disponibilidad) {
            return "Disponible";
        } else {
            return "No disponible";
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
    public static void main(String[] args) {
        AVLtree<Embarcacion> arbol=new AVLtree<Embarcacion>();
        Embarcacion x=new Embarcacion(5,"Test","Test",3,3,3,false);
        Embarcacion y=new Embarcacion(7,"Encontrado","Encontrado",3,3,3,false);
        Embarcacion z=new Embarcacion(1,"Test","Test",3,3,3,false);
        Embarcacion w=new Embarcacion(2,"Test","Test",3,3,3,false);
        
        Embarcacion aux=new Embarcacion(8,"as","as",3,3,3,true);

        arbol.insert(x);
        arbol.insert(y);
        arbol.insert(z);
        arbol.insert(w);
        System.out.println(arbol.contains(aux).data.bandera);
        
        printInorden(arbol.root);
    }
    
     //Impresion inorden

    
     public static void printInorden(AVLNode<Embarcacion> node){
        if(node!=null){
            printInorden(node.left);
            System.out.print(node.data.IMO+" ");
            printInorden(node.right);
        }
    }
}
