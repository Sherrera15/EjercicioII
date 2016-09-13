/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Herrera
 */
public class NumeroMixto {
    private int numerador;
    private int denominador;
    private int entero;

    public NumeroMixto( int numerador, int denominador,int entero)throws DenominadorCeroException {
        this.numerador = numerador;
        this.denominador = denominador;
        this.entero = entero;
        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
        
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getEntero() {
        return entero;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public NumeroMixto sumar(NumeroMixto f2) throws DenominadorCeroException{
        NumeroMixto f;
        int num1, den1, num2, den2, num, den, ente, dentotal,numtotal;
        

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        numtotal = (num1 * den2) + (den1 * num2);
        dentotal = den1 * den2;

        ente = numtotal / dentotal;
        num = numtotal % ente;
        den = dentotal;

        f = new NumeroMixto(ente, num, den);
        return f;

    }

    public NumeroMixto restar(NumeroMixto f2) throws DenominadorCeroException{
        NumeroMixto f;
        int num1, den1, num2, den2, num, den, ente, dentotal,numtotal;
       

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        numtotal = (num1 * den2) - (den1 * num2);
        dentotal = den1 * den2;

        
        ente = numtotal / dentotal;
        num = numtotal % ente;
        den = dentotal;

        f = new NumeroMixto(ente, num, den);
        return f;

    }

    public NumeroMixto multiplicar(NumeroMixto f2) throws DenominadorCeroException {
        NumeroMixto f;
        int num1, den1, num2, den2, num, den, ente, dentotal,numtotal;

        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        numtotal = (num1 * num2);
        dentotal = (den1 * den2);

        ente = numtotal / dentotal;
        num = numtotal % ente;
        den= dentotal;

        f = new NumeroMixto(ente, num, dentotal);
        return f;

    }
    
    public NumeroMixto dividir(NumeroMixto f2) throws DenominadorCeroException {
        NumeroMixto f;
        
        int num1, den1, num2, den2, num, den, ente, dentotal,numtotal;
        
        num1 = this.entero * this.denominador + this.numerador;
        den1 = this.denominador;
        num2 = f2.entero * f2.denominador + f2.numerador;
        den2 = f2.denominador;

        numtotal = (num1 * den2);
        dentotal = (den1 * num2);

        ente = numtotal / dentotal;
        num = numtotal % ente;
        den = dentotal;

        f = new NumeroMixto(ente, num, den);
        return f;

    }
}
