/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papadoc.calcengine;

/**
 *
 * @author GP054369
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //Math Operators
//        int valA = 21;
//        int valB = 6;
//        int valC = 3;
//        int valD = 1;
//        
//        int result1 = valA - valB / valC;
//        
//        int result2 = (valA - valB) / valC;
//        
//        System.out.println(result1);
//        System.out.println(result2);
//        
//        int result3 = valA / valC * valD + valB;
//        int result4 = valA / (valC * (valD + valB));
//        
//        
//        System.out.println(result3);
//        System.out.println(result4);
//        //Type Conversion
//        float floatVal = 1.0f;
//        double doubleVal = 4.0d;
//        byte byteVal = 7;
//        short shortVal = 7;
//        long longVal = 5;
//        
//        short result1 = (short)byteVal;
//        short result2 = (short)(byteVal - longVal);
//        double result3 = longVal - doubleVal;
//        long result4 = (long)(shortVal - longVal + floatVal + doubleVal);    
//        System.out.println("Success");
//            //if else / nested if
//            float students = 0.0f, rooms = 4.0f;
//
//            if(students > 0.0f) {
//                if(rooms > 0.0f)
//                        System.out.println(students/rooms);
//            }
//            else
//                        System.out.println("No students");;
//
//                        System.out.println();
//                // Logical and VS Conditional Logical and
//                int students = 150;
//                int rooms = 0;
//                
//                if(rooms>0 && students/rooms > 30) // with & will be displayed ArithmeticException Error but with && will be displayed "A message" because it does the left check(rooms>0 ) and ignore the second check(students/room > 30)
//                    System.out.println("Crowded!!");
//                else
//                    System.out.println("A message");
        //CalcEngine
//                double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//                double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//                char[] opCodes = {'d', 'a', 's', 'm'};
//                double[] results = new double[opCodes.length];

        // CalcEngine with Field Initializers and Constructors
        
//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.println("test=");
//        System.out.println(testEquation.getResult());
        
        
        MathEquation[] equations = new MathEquation[4];
        //with next lines we are using the constructor to create all the array elements
        equations[0] = new MathEquation('d', 100.0d, 50.0d );
        equations[1] = new MathEquation('a', 25.0d, 92.0d );
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);
//                for(int i=0; i < opCodes.length; i++){
//                    
//                }
        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
        
        System.out.println();
        System.out.println("Using Overloads");
        System.out.println();
        
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;
        
        
        MathEquation equationOverload = new MathEquation('d');
        
        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        equationOverload.execute(leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        equationOverload.execute((double)leftInt, rightInt);
        System.out.print("result=");
        System.out.println(equationOverload.getResult());
        
        
        
        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();
        
        CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)          
        };
        
        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }
        
    } //main-psvm

//    public static MathEquation create(double leftVal, double rightVal, char opCode) {
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }

} //class Main
