/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcalculadora;

import java.util.Random;

/**
 *
 * @author Luis
 */
public class CalculadoraAntiguaFalla {
    
    private int num1;
    private int num2;
    
    public CalculadoraAntiguaFalla(int num1, int num2){
        Random rn = new Random();
        this.num1 = num1 + rn.nextInt(2) - 2;
        this.num2 = num1 + rn.nextInt(2) - 3;
    }
    
}
