/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.laboratorio8.laboratorio8;

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

/**
 *
 * @author Lester García
 */
public class DemoGraphViz {
    File File = new File(Route);            
            FileInputStream fis = null;		
            F = new FileInputStream(file);		
            MutableGraph Q = Parser.read(F);
            Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/Lester_Andrés_García_Aquino_1003115-"));
}
