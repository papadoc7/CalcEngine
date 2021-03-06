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
public class Adder extends CalculateBase implements MathProcessing{
    public Adder(){}
    public Adder (double leftVal, double rightVal){
        super(leftVal, rightVal);
    }
    
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "add";
    }

    @Override
    public char getSymbol() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        
        return getResult();
    }
    
}
