/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import Mundo.estructuras.listas.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author snsc2
 */
public class Puerto {

    private static final String PATH = "..\\ShippingControl\\data\\embarcaciones.csv";
    private static final String PATH0 = "..\\ShippingControl\\data\\bodegas.csv";
    private String nombrePuerto;
    private int bodegasMax;
    private int capacidaBods;
    private Queue<Embarcacion> colaEmbarcaciones = new Queue<Embarcacion>();
    private Stack<Embarcacion> pilaSalida = new Stack<Embarcacion>();
    private LinkedList<Bodega> listaBodegas=new LinkedList<Bodega>();
    public Puerto(String nombrePuerto,int bodegasMax, int capacidadBods) {
        this.nombrePuerto = nombrePuerto;
        this.bodegasMax = bodegasMax;
        this.capacidaBods=capacidadBods;
    }

    public void cargarEmbarcacionesCSV(){
        String linea;
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] datos = linea.split(",");//arreglo de las columnas de cada linea
                Embarcacion embarcacion;
                if (datos[6].equals("1")) {
                    embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]),
                            Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), true);
                } else {
                    embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]),
                            Integer.parseInt(datos[5]), false);
                }
                colaEmbarcaciones.Enqueue(new Node<Embarcacion>(embarcacion));
            }
        } catch (Exception e) {
            System.err.println("cargarEmb"+e.getMessage());
        }
    }
    
    public void cargarBodegasCSV(){
        String linea;
        try {
            FileWriter writeFile = new FileWriter(PATH0, true);
            BufferedReader br = new BufferedReader(new FileReader(PATH0));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] datos = linea.split(",");//arreglo de las columnas de cada linea
                Bodega bodega;
                    bodega = new Bodega(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]),Integer.parseInt(datos[2]),datos[3].charAt(0));
                listaBodegas.pushBack(new Node<Bodega>(bodega));
            }
        }catch (Exception e) {
            System.err.println("cargar bodegas"+e.getMessage());
        }
    }
   
    public Queue<Embarcacion> GetEmbarcaciones(){
        if (colaEmbarcaciones.isEmpty()){
            return null;
        }
        else{
            return colaEmbarcaciones;
        }
    }
    
    public LinkedList<Bodega> GetBodegas(){
        if (listaBodegas.isEmpty()){
            return null;
        }
        else{
            return listaBodegas;
        }
    }

    //Registra la llegada de una nueva embarcación, encola
    /*public void registrarLlegadaEmbarcacion(String[] datos) {
        System.currentTimeMillis();
        Embarcacion embarcacion;
        if (datos[6].equals("1")) {
            embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]),
                    Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), true);
        } else {
            embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]),
                    Integer.parseInt(datos[5]), false);
        }
        colaEmbarcaciones.Enqueue(new Node<Embarcacion>(embarcacion));
        realizarRegistros();
    }*/

    //Registra el desembarque y salida de una embarcacion, desencola
    public void registrarSalidadDeEmbarcacion(int IDbodega) {
        Node<Bodega> iter = listaBodegas.getBeginNode();
        while (iter!=null) {
            if(iter.data.getID()==IDbodega){
                if(iter.data.getActual()+colaEmbarcaciones.getLastNode().data.getContenedoresAct()>iter.data.getCapacidad()){
                    JOptionPane.showMessageDialog(null, "La bodega se encuentra llena, intente descargar en otra bodega", "Atención", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    Node<Embarcacion> embarcaciónDesencolada = colaEmbarcaciones.Dequeue();
                    pilaSalida.push(embarcaciónDesencolada);
                    iter.data.setActuales(iter.data.getActual()+embarcaciónDesencolada.data.getContenedoresAct());
                    break;
                }
            }
            iter=iter.nextNode;
        }
    }

    // Retorna la ultima embarcacion que dejo el puerto
    public Node<Embarcacion> retornarUltimaEmbarcacionSalida() {
        Node<Embarcacion> salida = pilaSalida.peek();
        return salida;
    }


    /*public Queue<Embarcacion> getEmbarcacionesCola() {
        return colaEmbarcaciones;
    }*/
   
}
