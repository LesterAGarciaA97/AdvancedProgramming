package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Nodo A = new Nodo();
        A.setPropiedad("GUA");
    }
    private class Nodo{
        private String Propiedad;
        private Nodo next;
        
        private String getPropiedad(){
            return this.Propiedad;
        }
        
        private void setPropiedad(){
            
        }
        
        private Nodo getNext(){
            return this.next;
        }
        
        private void setNext(Nodo next){
            this.next = next;
        }
    }
}
