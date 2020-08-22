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
public class Dynstack<E> implements Stack<E> {
    private static class Node<E> {

        private E element;
        private Node<E> previous;// Anterior

        public Node(E e, Node<E> p) {
            element = e;
            previous = p;
        }

        public E getElement() throws IllegalStateException {
            return element;
        }

        public void setElement(E e) {
            element = e;
        }

        public Node<E> getPrev() {
            return previous;
        }

        public void setPrev(Node<E> prev) {
            this.previous = prev;
        }
    }

    Node<E> top;
    int Size = 0;

    public Dynstack() {
        top = new Node(null, null);
    }

    @Override
    public int size() {
        return Size;
    }

    @Override
    public boolean isEmpty() {
        return Size == 0;
    }

    @Override
    public E top() {
        return top.getElement();
    }

    @Override
    public void push(E e) {
        Node<E> nn = new Node(e, null);
        if (top.getPrev() == null) {
            top.setPrev(nn);
        } else {
            nn.setPrev(top.getPrev());
            top.setPrev(nn);
        }
        Size++;
    }

    @Override
    public E pop() {
        E element = null;
        if (Size > 0){ 
        Node<E> oldnode;
        oldnode = top.getPrev();
        top.setPrev(top.getPrev().getPrev());
        Size--;
        element = oldnode.getElement();
        oldnode = null;
        }
        return element;
    }
}
