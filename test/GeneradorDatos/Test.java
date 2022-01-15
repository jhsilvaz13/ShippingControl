/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDatos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author jhonz
 */
public class Test {

    private static final String PATH = "..\\ShippingControl\\data\\embarcaciones.csv";

    public static void RegitrarEmbarcaciones(Long n) {
        Random random = new Random();
        try {
            for (long i = 0; i < n; i++) {
                FileWriter writeFile = new FileWriter(PATH, true);
                PrintWriter registrar = new PrintWriter(writeFile);
                registrar.println(String.valueOf(String.format("%07d", i)) + "," + "Test" + "," + "Test" + "," + String.valueOf(random.nextInt(7)) + "," + String.valueOf(random.nextInt(99999)) + ","
                        + String.valueOf(random.nextInt(999999)) + "," + String.valueOf(random.nextInt(2)));
                registrar.close();
            }
        } catch (Exception e) {
            
        }
    }

    public static void main(String[] args) {
        RegitrarEmbarcaciones(10000L);
    }
}
