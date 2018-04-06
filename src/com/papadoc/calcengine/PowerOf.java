/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papadoc.calcengine;

/**
 *
 * @author papadoc7
 */
public class PowerOf implements MathProcessing{

    @Override
    public String getKeyword() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "power";
    }

    @Override
    public char getSymbol() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return '^';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.pow(leftVal, rightVal);
    }
    
    
}
