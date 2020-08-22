package gt.edu.url.process;

import java.io.*;

public class GraphViz {

    GraphViz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void main( String []arg ){
		new GraphViz( arg[0], arg[1] );
	}
	
	public GraphViz( String DireccionDot, String DireccionPng ){
		Dibujar( DireccionDot, DireccionPng );
	}
	
    /**
     *
     * @param direccionDot
     * @param direccionPng
     */
    public  void Dibujar( String direccionDot, String direccionPng ){
		try
		{       
			ProcessBuilder processBuilder;
			processBuilder = new ProcessBuilder( "dot", "-Tpng", "-o", direccionPng, direccionDot );
			processBuilder.redirectErrorStream( true );
			processBuilder.start();
		} catch 
                        (IOException e) { 
                    e.printStackTrace(); 
                }
	}
}
