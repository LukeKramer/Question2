package com.maven;

import javax.swing.*;

/**
 * Created by student on 2016/03/05.
 */
public class Calculator {

    public Calculator()
    {


    }

    public float Add(float a, float b)
    {
        return a+b;
    }

    public double Subtract(float a, float b)
    {
        return a-b;
    }

    public double Mutiply(float a, float b)
    {
        return a*b;
    }

    public double divide(float a, float b)
    {
        return a/b;
    }

    public void Test1Menu()
    {
        float input1,input2,input3;
        double put1,put2,put3;
        int num;
        String in1,in2,in3 = "";

        String op = " ";
        op = JOptionPane.showInputDialog(null, "Calculator menu \n" + "1 = addition \n" + "2 = subtraction \n" + "3 = multiplication \n" + "4 = division \n");



        in1 = JOptionPane.showInputDialog(null, "Enter number 1");
        in2 = JOptionPane.showInputDialog(null, "Enter number 2");
        input1 = Float.parseFloat(in1);
        input2 = Float.parseFloat(in2);

        if (op.equalsIgnoreCase("1")) {
            JOptionPane.showMessageDialog(null, "The answer = " + Add(input1, input2));

        }
        if (op.equalsIgnoreCase("2")) {
            JOptionPane.showMessageDialog(null, "The answer = " + Subtract(input1, input2));
        }
        if (op.equalsIgnoreCase("3")) {
            JOptionPane.showMessageDialog(null, "The answer = " + Mutiply(input1, input2));
        }
        if (op.equalsIgnoreCase("4")) {
            JOptionPane.showMessageDialog(null, "The answer = " + divide(input1, input2));
        }


        CalculateShape cs = new CalculateShape();
        cs.Test2();


    }


}
