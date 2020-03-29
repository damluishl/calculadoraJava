/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitcalculadora;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Calculadora {

    // Variables de objeto
    private int num1;
    private int num2;

    // Constructores
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculadora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        num1 = sc.nextInt();
        System.out.println("Introduca el segundo número");
        num2 = sc.nextInt();
    }
    
    // Métodos
    public void suma(){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    
    public void resta(){
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }

    // Metodos getters y setters

    public int getNum1() {
        return num1;
    }
    
    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}
