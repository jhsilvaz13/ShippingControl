package Mundo.estructuras.listas;;

/**
 *
 * @author jhonz
 */
public class Node<T> {
    T data;
    Node<T> nextNode;
    Node<T> beforeNode;
    public Node(T data){
        this.data=data;
        this.nextNode=null;
        this.beforeNode=null;
    }
}
