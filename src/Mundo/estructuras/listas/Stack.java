package Mundo.estructuras.listas;

/**
 *
 * @author jhonz
 */
public class Stack<T> extends LinkedList<T>{
    public Stack(){
        super();
    }
    //Agrega al inicio de la lita(final de la cola)
    public void push(Node<T> newNode){
        pushFront(newNode);
    }
    
    //Eliminar al inicio de la lista(final de la pila)
    public void  pop(){
       popFront();
    }
    
    public Node<T> peek(){
        Node<T> node=getBeginNode();
        pop();
        return node;
    }
    
    //No se puede eliminar al inicio de una pila
    @Override
    public void popBack() {
    }

    //No se puede agregar al inicio de una pila
    @Override
    public void pushBack(Node<T> newNode) {
    }
}
