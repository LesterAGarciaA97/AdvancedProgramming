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
public abstract class HourlyEmployee extends Employee{
    int hoursPerWeek;
    double hourlyWage;
    
    @Override
    protected double monthlyPay(){
        return 1500.00;
    }
}
