/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mundo.estructuras.trees;

/**
 *
 * @author jhonz
 */
public class AVLNode<T> {
    
        //Atributos AVL Node
        public T data;
        public AVLNode<T> left;
        public AVLNode<T> right;
        int height;

        //Constructores
        public AVLNode(T data, AVLNode<T> left, AVLNode<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
            this.height=0;
        }
}
