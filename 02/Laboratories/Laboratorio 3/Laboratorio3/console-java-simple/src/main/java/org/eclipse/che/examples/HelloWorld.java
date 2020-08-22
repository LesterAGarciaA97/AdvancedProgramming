package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Shape a1, b1, c1;
        
        a1 = new Rectangle(10,10);//Toma forma de rectangulo - Polimorfico
        System.out.println(a1.toString());
        b1 = new Triangle(10,4);//Toma forma de triangulo - Polimorfico
        System.out.println(b1.toString());
        //c1 = new Rectangle(5,5);
        //System.out.println(c1.toString());
        
        //Prueba cambio de forma
        c1 = new Rectangle(5,5);
        System.out.println(c1.toString());    
        Rectangle re1;
        re1 = (Rectangle)c1;//Downcasting
        System.out.println(re1.toString());
    }
}
