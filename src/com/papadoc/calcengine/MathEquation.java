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
public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode= 'a';
    private double result;

    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    
    public double getRightVal() { return rightVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }

    public char getOpCode() { return opCode; }
    public void setOpCode(char opCode) { this.opCode = opCode; }

    public double getResult() { return result; }
//    public void setResult(double result) { this.result = result; } 
    
    
    //constructor without arguments/parameters
    public MathEquation() {} 
    
    //constructor with 1 argument/parameter
    public MathEquation(char opCode){ this.opCode = opCode; }
    
    //constructor with multiple arguments/parameters
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    
    public void execute (double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        
        execute();
    }
    
    public void execute (int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
        
        execute();
        
        result = (int)result;
    }
    
    public void execute() {
        switch(opCode){
            case 'a':
                result= leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;    
            default:
                System.out.println("Error - incalid opCode");
                result = 0.0d;
                break;
                    }
    }
    
    
    
    
}
