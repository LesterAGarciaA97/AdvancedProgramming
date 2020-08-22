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
public abstract class SalariedEmployee extends Employee {
    int annualSalary;
    
    public SalariedEmployee(){
        name = "Víctor";
        setHireYear(1999);
        country ="Guatemala";
    }
    
    @Override
    protected double monthlyPay(){
        return 1000.00;
    }
    
    @Override
    public  double annualPay(){
        return this.monthlyPay()*12;
    }
}
