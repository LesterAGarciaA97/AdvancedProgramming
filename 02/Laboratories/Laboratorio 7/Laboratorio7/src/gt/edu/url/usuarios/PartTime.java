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
public class PartTime extends HourlyEmployee {
    @Override
    public double annualPay(){
        return this.monthlyPay()*12;
    }
}
