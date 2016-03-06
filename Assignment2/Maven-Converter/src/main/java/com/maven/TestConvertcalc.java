package com.maven;

import javax.swing.*;

/**
 * Created by student on 2016/03/05.
 */
public class TestConvertcalc {

    float input1,input2,input3;
    double put1,put2,put3;
    int num;
    String in1,in2,in3 = "";

    public double kmtoMiles(double a)
    {
        return a*0.621371;

    }

    public double milesKm(double a)
    {
        return a*1.60934;

    }

    public double kgtoPound(double a)
    {
        return a*2.20462;

    }

    public double poundtoKg(double a)
    {
        return a*0.453592;

    }

    public double celciustoF(double a)
    {
        return a*1.8+32;

    }

    public double fahrenheittoC(double f)
    {
        double a = f-32;
        double b = 0.5555555555555556;
        double result = a * b;

        return result;

    }

    public void Test3(){

        String op = " ";
        op = JOptionPane.showInputDialog(null, " converter menu \n" + "1 = Km to Miles \n" + "2 = Miles to Km \n" + "3 = kg to Pounds \n" + "4 = Pounds to kg\n" + "5 = Celsius to Fahrenheit\n" + "6 = Fahrenheit to Celsius \n");

        in1 = JOptionPane.showInputDialog(null, "Enter amount");
        put1 = Double.parseDouble(in1);
        if (op.equalsIgnoreCase("1")) {
            JOptionPane.showMessageDialog(null, "Miles = " + kmtoMiles(put1));

        }
        if (op.equalsIgnoreCase("2")) {
            JOptionPane.showMessageDialog(null, "Km = " + milesKm(put1));
        }
        if (op.equalsIgnoreCase("3")) {
            JOptionPane.showMessageDialog(null, "Pounds = " + kgtoPound(put1));
        }
        if (op.equalsIgnoreCase("4")) {
            JOptionPane.showMessageDialog(null, "kg = " + poundtoKg(put1));
        }
        if (op.equalsIgnoreCase("5")) {
            JOptionPane.showMessageDialog(null, "Fahrenheit = " + celciustoF(put1));
        }
        if (op.equalsIgnoreCase("6")) {
            JOptionPane.showMessageDialog(null, "Celsius = " + fahrenheittoC(put1));
        }

        PercentandBMI p = new PercentandBMI();
        p.Test4();
        System.exit(0);



    }

}
