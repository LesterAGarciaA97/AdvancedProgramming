package gt.url.edu.laboratorio8.laboratorio8;
import java.util.Scanner;
        
/**
 *
 * @author Lester Garcia
 */
public class Main {
    Scanner SC = new Scanner(System.in);
    System.out.println("¿Qué archivo desea cargar?");
    String Route = SC.nextLine();
    DemoGraphViz Demo1 = new DemoGraphViz();
    Demo1.createDemoFromDot(Route);
}
