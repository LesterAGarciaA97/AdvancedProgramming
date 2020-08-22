/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio06;

/**
 *
 * @author Lester García
 */
public class Laboratorio06 {
    
    public static void main (String[] args){
        PositionalList MyList = new LinkedPositionalList();
        Position<String> p0, p1, p2, p3, p4;
        p0 = MyList.addFirst("g");
        p1 = MyList.addLast("f");
        p2 = MyList.addBefore(p1, "b");
        p3 = MyList.addAfter(p2, "c");
        p3 = MyList.addAfter(p2, "d");
        p3 = MyList.addAfter(p1, "d");
        p4 = MyList.addAfter(p3, "e");
    }
    
}
