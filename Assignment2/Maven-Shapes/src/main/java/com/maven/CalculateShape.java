package com.maven;

import javax.swing.*;

/**
 * Created by student on 2016/03/05.
 */
public class CalculateShape {

    public double squareArea(double a)
    {
        return a*a;
    }

    public double squarePerimeter(double a)
    {
        return 4*a;
    }

    public double rectanglePerimeter(double l,double w)
    {
        return 2*(l+w);
    }

    public double rectangleArea(double l, double w)
    {
        return l*w;
    }

    public double triangleArea(double h, double b)
    {
        return (h*b)/2;
    }

    public double trianglePerimeter(double a, double b,double c)
    {
        return a+b+c;
    }

    public double circleArea(double r)
    {
        return 3.14*(r*r);
    }

    public double circleDiameter(double r)
    {
        return r*2;
    }

    public double circlePerimeter(double r)
    {
        return 2*3.14*r;
    }

    public void Test2 ()
    {
        float input1,input2,input3;
        double put1,put2,put3;
        int num;
        String in1,in2,in3 = "";

        String op = " ";
        op = JOptionPane.showInputDialog(null, "Shape menu \n" + "1 = Area Rectangle \n" + "2 = Perimeter Rectangle \n" + "3 = Area Circle \n" + "4 = diameter Circle\n" + "5 = perimeter Circle");

        if(op.equalsIgnoreCase("1")) {
            in1 = JOptionPane.showInputDialog(null, "Enter the length of the Rectangle");
            put1 = Double.parseDouble(in1);
            in2 = JOptionPane.showInputDialog(null, "Enter the width of the Rectangle");
            put2 = Double.parseDouble(in2);
            JOptionPane.showMessageDialog(null, "The area of the Rectangle = " + rectangleArea(put1, put2));
        }
        if(op.equalsIgnoreCase("2")) {
            in1 = JOptionPane.showInputDialog(null, "Enter the length of the Rectangle");
            put1 = Double.parseDouble(in1);
            in2 = JOptionPane.showInputDialog(null, "Enter the width of the Rectangle");
            put2 = Double.parseDouble(in2);
            JOptionPane.showMessageDialog(null, "The perimeter of the Rectangle = " + rectanglePerimeter(put1, put2));
        }
        if(op.equalsIgnoreCase("3")) {
            in1 = JOptionPane.showInputDialog(null, "Enter the radius of the circle");
            put1 = Double.parseDouble(in1);
            JOptionPane.showMessageDialog(null, "The area of the circle = " + circleArea(put1));
        }
        if(op.equalsIgnoreCase("4")) {
            in1 = JOptionPane.showInputDialog(null, "Enter the radius of the circle");
            put1 = Double.parseDouble(in1);
            JOptionPane.showMessageDialog(null, "The diameter of the circle = " + circleDiameter(put1));
        }
        if(op.equalsIgnoreCase("5")) {
            in1 = JOptionPane.showInputDialog(null, "Enter the radius of the circle");
            put1 = Double.parseDouble(in1);
            JOptionPane.showMessageDialog(null, "The perimeter of the circle = " + circlePerimeter(put1));
        }

        TestConvertcalc t = new TestConvertcalc();
        t.Test3();

    }


}
