/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import Mundo.estructuras.listas.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author snsc2
 */
public class Puerto {

    private static final String PATH = "..\\ShippingControl\\data\\embarcaciones.csv";
    private String nombrePuerto;
    private int tarifa;
    private int contenedoresMax;
    private int barcosMax;
    private int contenedoresAct;
    private int barcosAct;

    private Queue<Embarcacion> colaEmbarcaciones = new Queue<Embarcacion>();
    private Stack<Embarcacion> pilaSalida = new Stack<Embarcacion>();

    public Puerto(String nombrePuerto, int tarifa, int contenedoresMax,
            int barcosMax, int barcosAct, int contenedoresAct) {
        this.nombrePuerto = nombrePuerto;
        this.tarifa = tarifa;
        this.contenedoresMax = contenedoresMax;
        this.barcosMax = barcosMax;
        this.contenedoresAct = contenedoresAct;
        this.barcosAct = barcosAct;
    }

    /**
     * Carga los datos que se encuenyran en los archivos CSV en objetos en
     * ejecución y actualiza la cola correspondiente a los barcos*
     */
    public void cargarEmbarcacionesCSV() {
        String linea;
        try {
            FileWriter writeFile = new FileWriter(PATH, true);
            BufferedReader br = new BufferedReader(new FileReader(PATH));
            while ((linea = br.readLine()) != null) {//cada linea del archivo csv
                String[] datos = linea.split(",");//arreglo de las columnas de cada linea
                Embarcacion embarcacion;
                if (datos[6].equals("Disponible")) {
                    embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]),
                            Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), true);
                } else {
                    embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]),
                            Integer.parseInt(datos[5]), false);
                }
                colaEmbarcaciones.Enqueue(new Node<Embarcacion>(embarcacion));
            }
        } catch (Exception e) {
            System.err.println("cargarEmb");
        }
    }
   
    public Queue<Embarcacion> GetEmbarcaciones(){
        boolean empty;
        empty = colaEmbarcaciones.isEmpty();
        if (empty == true){
            return null;
        }
        else{
            return colaEmbarcaciones;
        }
    }

    //Registra la llegada de una nueva embarcación, encola
    public void registrarLlegadaEmbarcacion(String[] datos) {
        System.currentTimeMillis();
        Embarcacion embarcacion;
        if (datos[6].equals("Disponible")) {
            embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]),
                    Integer.parseInt(datos[4]), Integer.parseInt(datos[5]), true);
        } else {
            embarcacion = new Embarcacion(Integer.parseInt(datos[0]), datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]),
                    Integer.parseInt(datos[5]), false);
        }
        colaEmbarcaciones.Enqueue(new Node<Embarcacion>(embarcacion));
        realizarRegistros();
    }

    //Registra el desembarque y salida de una embarcacion, desencola
    public Node<Embarcacion> registrarSalidadDeEmbarcacion() {
        Node<Embarcacion> embarcaciónDesencolada = colaEmbarcaciones.Dequeue();
        pilaSalida.push(embarcaciónDesencolada);
        realizarRegistros();
        return embarcaciónDesencolada;
    }

    // Retorna la ultima embarcacion que dejo el puerto
    public Node<Embarcacion> retornarUltimaEmbarcacionSalida() {
        Node<Embarcacion> salida = pilaSalida.peek();
        return salida;
    }

    private void realizarRegistros() {
        Embarcacion.registrosCSVEmbarcaciones(colaEmbarcaciones);
    }

    public Queue<Embarcacion> getEmbarcacionesCola() {
        return colaEmbarcaciones;
    }
}
