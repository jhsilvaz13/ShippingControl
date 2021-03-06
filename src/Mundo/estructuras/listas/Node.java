package Mundo.estructuras.listas;;

/**
 *
 * @author jhonz
 */
public class Node<T> {
    public T data;
    public Node<T> nextNode;
    public  Node<T> beforeNode;
    public Node(T data){
        this.data=data;
        this.nextNode=null;
        this.beforeNode=null;
    }
    public void setData(T data){
        this.data=data;
    }
    
    public T getData(){
        return data;
    }
     public Node nextNode(){
        return nextNode;
    }
    public Node beforeNode(){
        return beforeNode;
    }
}
