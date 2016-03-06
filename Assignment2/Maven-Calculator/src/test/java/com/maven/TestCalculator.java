package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/05.
 */
public class TestCalculator {

    Calculator calc = new Calculator();
    @Test
    public void testAdd() throws Exception {

        Assert.assertEquals(2.0f,calc.Add(1.0f,1.0f),0.0f);


    }
    @Test
    public void testSub()throws Exception{

        Assert.assertEquals(2.0f,calc.Subtract(3.0f,1.0f),0.0f);

    }

    @Test
    public void testMulti() throws Exception {

        Assert.assertEquals(8.0f,calc.Mutiply(2.0f,4.0f),0.0f);

    }

    @Test
    public void testDivide() throws Exception {

        Assert.assertEquals(9.0f,calc.divide(18.0f,2.0f),0.0f);

    }

}
