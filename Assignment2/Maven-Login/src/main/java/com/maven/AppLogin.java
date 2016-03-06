package com.maven;

import javax.swing.*;

/**
 * Created by student on 2016/03/06.
 */
public class AppLogin {

    public void Login()
    {
        String name ="Luke";

        String option = " ";
        option = JOptionPane.showInputDialog(null,"Enter user name");

        if(option.equalsIgnoreCase(name))
        {
            JOptionPane.showMessageDialog(null,"You are login in");
            Calculator c = new Calculator();
            c.Test1Menu();
        }
        else
        {
            System.exit(0);
        }





    }



}
