/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.shippingcontrol;

import Mundo.estructuras.listas.LinkedList;
import Mundo.estructuras.listas.Node;
import Mundo.estructuras.trees.AVLtree;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author jhonz
 */
public class Bodega implements Comparable<Bodega> {

    private int ID;
    private int capacidad;
    private int actual;
    private char zona;

    static final String PATH = "..\\ShippingControl\\data\\bodegas.csv";

    public Bodega(int ID, int capacidad, int actual, char zona) {
        this.ID = ID;
        this.capacidad = capacidad;
        this.actual = actual;
        this.zona = zona;
    }

    public static void registrosCSVBodegas(LinkedList<Bodega> listaBodegas) {
        Node<Bodega> iter = listaBodegas.getBeginNode();
        try {
            new FileWriter(PATH, false).close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while (iter != null) {
            try {
                FileWriter writeFile = new FileWriter(PATH, true);
                PrintWriter registrar = new PrintWriter(writeFile);
                registrar.println(String.format("%03d", iter.data.getID()) + "," + iter.data.getCapacidad() + "," + iter.data.getActual()
                        + "," + iter.data.getZona());
                registrar.close();
                iter = iter.nextNode;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Object FiltrarID(int ID, Puerto puerto) {
        AVLtree<Bodega> arbolID = new AVLtree<Bodega>();
        Object rowData[] = new Object[4];
        try {
            LinkedList<Bodega> PrintE = puerto.GetBodegas();
            if (PrintE == null) {
                return rowData;
            } else {
                Node<Bodega> Iterador = PrintE.getBeginNode();
                while (Iterador != null) {
                    Bodega a = new Bodega(Iterador.data.getID(), Iterador.data.getCapacidad(), Iterador.data.getActual(), Iterador.data.getZona());
                    arbolID.insert(a);
                    Iterador = Iterador.nextNode;
                }
                Bodega busqueda = new Bodega(ID, 2, 2, 'A');
                try {
                    rowData[0] = arbolID.contains(busqueda).data.ID;
                    rowData[1] = arbolID.contains(busqueda).data.capacidad;
                    rowData[2] = arbolID.contains(busqueda).data.actual;
                    rowData[3] = arbolID.contains(busqueda).data.zona;
                    return rowData;
                } catch (Exception e) {
                    return rowData;
                }
            }
        } catch (Exception e) {
            return rowData;
        }
    }

    public int getID() {
        return ID;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getActual() {
        return actual;
    }

    public char getZona() {
        return zona;
    }

    public void setActuales(int actual) {
        this.actual = actual;
    }

    @Override
    public int compareTo(Bodega o) {
        if (this.ID > o.ID) {
            return 1;
        } else if (this.ID < o.ID) {
            return -1;
        }
        return 0;
    }
}
