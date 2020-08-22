/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gt.edu.url.usuarios;

/**
 *
 * @author Lester García
 */
public abstract class Employee {
    public String name; //Nivel de acceso tipo Default
    private int hireYear; //Nivel de acceso privado
    protected String country;
    
    public void setHireYear(int hireYear){ //Nivel de acceo con encapsulamiento
        this.hireYear = hireYear;
    }
    public int getHiredYear(){
        return this.hireYear;
    }
    
    protected abstract double monthlyPay();
    protected abstract double annualPay();
}
