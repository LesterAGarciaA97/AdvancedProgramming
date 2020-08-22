/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.datastructures;

/**
 *
 * @author Lester García & Ana Godínez
 * @param <E>
 */
public class DynQueue<E> implements Queue <E>{
    public class Node<E>{
        private E element;
        private Node <E> next;
        public Node(E element, Node<E> next){
            this.element=element;
            this.next=next;            
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "element=" + element;
        }  
    }
    private Node<E> first;
    private Node<E> last;
    private int Size;
    public  DynQueue(){
        first = null;
        last = null;
        Size=0;
    }
    
    @Override
    public int size() {
        return Size;
    }

    @Override
    public boolean isEmpty() {
        return Size==0;
    }

    @Override
    public void enqueue(E e) {
        Node<E> aux = new Node(e, null);
        if(isEmpty()){
            first = aux;
            last = aux;
        }else{
            if(size() == 1){               
               first.setNext(aux);
            }else{
                last.setNext(aux);                
            }
            last=aux;
        }
        Size++;
    }
    
    @Override
    public E first() {
       if (isEmpty())
       { 
           return null;
       }                
       return first.getElement();
    }

    @Override
    public E dequeue() {
        if (isEmpty()){
            return null;
        } 
        E element = first.getElement();
        Node<E> aux = first.getNext();
        first=null;
        first =aux;
        Size--;
        if(isEmpty()){
            last=null;
        }
        return element ;
    }
    @Override
    public String toString(){
       String cadena="";
        if(isEmpty()){
           return "La lista esta vacia";
       }else{        
           Node<E> aux =first;
           while(aux!=null){
               cadena+=aux;
               aux=aux.getNext();
           }
       }        
       return cadena;
    }
}
