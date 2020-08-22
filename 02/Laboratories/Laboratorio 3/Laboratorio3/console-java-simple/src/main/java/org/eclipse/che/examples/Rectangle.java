package org.eclipse.che.examples;

public class Rectangle implements Shape {
    
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public String toString(){
        return "Rectangle[ width " + this.width 
        + " length " + this.length 
        + " area " + this.getArea() + "]";
    }
}
