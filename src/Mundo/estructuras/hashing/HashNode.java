/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.estructuras.hashing;

/**
 *
 * @author jhonz
 */
public class HashNode<K, V> {

    private K key;
    private V value;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        HashNode<K,V> node=(HashNode)o;
        if (this.key.equals(node.key)) {
            return true;
        }
        return false;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public void setValue(V newValue) {
        this.value= newValue;
    }
}

