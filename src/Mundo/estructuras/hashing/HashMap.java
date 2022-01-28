/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.estructuras.hashing;

import Mundo.estructuras.listas.LinkedList;
import Mundo.estructuras.listas.ArrayList;
import Mundo.estructuras.listas.Node;

/**
 *
 * @author jhonz
 */
public class HashMap<K, V> {

    private LinkedList<HashNode<K,V>>[] array;
    private int currentSize;
    private static final int DEFAULT_CAPACITY = 101;
    private ArrayList<K> keys = new ArrayList<K>();
    private ArrayList<V> values = new ArrayList<V>();

    //CONSTRUCTORES
    public HashMap() {
        this(DEFAULT_CAPACITY);
    }

    public HashMap(int size) {
        array = new LinkedList[nextPrime(size)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<HashNode<K,V>>();
        }
    }

    //Metodos publicos
    //Inserta en el la tabla hash permitiendo llaves repetidas
    public void insert(K key, V value) {
        LinkedList<HashNode<K,V>> aux = array[hashFun(key)];
        aux.pushBack(new Node<HashNode<K,V>>(new HashNode<K, V>(key, value)));
        keys.push(key);
        values.push(value);
        if (++currentSize > (array.length * 5)) {
            rehash();
        }
    }

    //Inserta en el la tabla hash solo si la llave no esta repetida, sino remplaza el valor de la llave key
    public void put(K key, V value) {
        if (!find(key)) {
            LinkedList<HashNode<K,V>> aux = array[hashFun(key)];
            aux.pushBack(new Node<HashNode<K,V>>(new HashNode<K, V>(key, value)));
            keys.push(key);
            values.push(value);
            if (++currentSize > (array.length * 5)) {
                rehash();
            }
        } else {
            replace(key, value);
        }
    }

    //Retorna si la llave key esta en la tabla hash
    public boolean find(K key) {
        V value = null;
        return array[hashFun(key)].find(new HashNode<K,V>(key, value));
    }

    //Retorna el valor de la llave key
    public V get(K key) {
        try {
            V aux = null;
            return (V) array[hashFun(key)].search(new HashNode<K,V>(key, aux)).getValue();
        } catch (Exception e) {
            return null;
        }
    }

    //Retorna la LinkedList con llaves x repetidas
    public LinkedList<HashNode<K,V>> linkedListRepeatsKeys(K x) {
        return array[hashFun(x)];
    }

    public ArrayList<K> keys() {
        return keys;
    }

    public ArrayList<V> values() {
        return values;
    }

    //Metodos internos
    private void replace(K key, V value) {
        V aux = null;
        array[hashFun(key)].search(new HashNode<K,V>(key, aux)).setValue(value);
    }

    private void rehash() {
        keys = new ArrayList<K>();
        values = new ArrayList<V>();
        LinkedList<HashNode<K,V>>[] aux = array;
        array = new LinkedList[nextPrime(2 * array.length)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<HashNode<K,V>>();
        }
        for (LinkedList<HashNode<K,V>> e : aux) {
            if (e.getBeginNode() != null) {
                Node<HashNode<K,V>> iterator = e.getBeginNode();
                insert((K) iterator.getData().getKey(), (V) iterator.getData().getValue());
                while (iterator.nextNode() != null) {
                    iterator = iterator.nextNode();
                    insert((K) iterator.getData().getKey(), (V) iterator.getData().getValue());
                }
            }
        }
    }

    public int hashFun(K x) {
        int hashVal = x.hashCode();
        hashVal %= array.length;
        if (hashVal < 0) {
            hashVal += array.length;
        }
        return hashVal;
    }
    /*private int hashFunStr(K x) {
        int hashVal = x.hashCode();
        hashVal %= array.length;
        if (hashVal < 0) {
            hashVal += array.length;
        }
        if(!array[hashFun(x)].getBeginNode().data.getKey().equals(x)){
        }
        return hashVal;
    }*/
    
    

    private int nextPrime(int n) {
        if (n % 2 == 0) {
            n += 1;
        }
        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
