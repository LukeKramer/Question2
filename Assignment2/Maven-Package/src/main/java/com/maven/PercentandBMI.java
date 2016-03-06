package com.maven;

import javax.swing.*;

/**
 * Created by student on 2016/03/06.
 */
public class PercentandBMI {

    float input1,input2,input3;
    double put1,put2,put3;
    int num;
    String in1,in2,in3 = "";

    public double percentage(double percent,double amount)
    {

        return (percent*amount)/100;

    }

    public double growthrate(double present, double past, int years )
    {
        double a = present - past;
        double b = a/past;
        double c = b * 100;
        double result = c/years;

        return result;

    }



    public double BMI( double kg,double height )
    {
        double a = height * height;
        double result = kg/a;
        return result;
    }

    public double heartrate( double pulse )
    {
        return pulse*6;
    }

    public void Test4()
    {
        String op = " ";
        op = JOptionPane.showInputDialog(null, "Extras menu \n" + "1 = Percentages \n" + "2 = Growth Rate \n" + "3 = BMI \n" + "4 = Heart Rate\n");

        if(op.equalsIgnoreCase("1")){

            in1 = JOptionPane.showInputDialog(null, "What is the %");
            put1 = Double.parseDouble(in1);
            in2 = JOptionPane.showInputDialog(null, " enter an amount.");
            put2 = Double.parseDouble(in2);
            JOptionPane.showMessageDialog(null, in1+"% of " +in2+" ="+percentage(put1, put2));
        }
        if(op.equalsIgnoreCase("2")){

            in1 = JOptionPane.showInputDialog(null, "Enter a present amount");
            put1 = Double.parseDouble(in1);
            in2 = JOptionPane.showInputDialog(null, "Enter a past amount.");
            put2 = Double.parseDouble(in2);
            in3 = JOptionPane.showInputDialog(null, "Enter number of years.");
            num = Integer.parseInt(in3);
            JOptionPane.showMessageDialog(null,"The growth percent is "+growthrate(put1, put2,num)+" %");

        }

        if(op.equalsIgnoreCase("3")){

            in1 = JOptionPane.showInputDialog(null, "Enter your weight in kg");
            put1 = Double.parseDouble(in1);
            in2 = JOptionPane.showInputDialog(null, "Enter your height in m");
            put2 = Double.parseDouble(in2);
            JOptionPane.showMessageDialog(null, "Your BMI is "+BMI(put1, put2));


        }

        if(op.equalsIgnoreCase("4"))
        {
            in1 = JOptionPane.showInputDialog(null, "Count your pulse for 10s and enter the value here.");
            put1 = Double.parseDouble(in1);
            JOptionPane.showMessageDialog(null, "Your Heart rate is "+heartrate(put1));

        }

        JOptionPane.showMessageDialog(null, "Wel1done you have completed the test!!!");


    }




}