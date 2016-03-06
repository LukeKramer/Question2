package com.maven;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/06.
 */
public class TestPB {

    PercentandBMI p = new PercentandBMI();
    @Test
    public void testPercentage() throws Exception {

        Assert.assertEquals(6.45,p.percentage(15,43),0);

    }

    @Test
    public void testBMI() throws Exception {

        Assert.assertEquals(22.857142857142858,p.BMI(70,1.75),0);

    }

    @Test
    public void testPulse() throws Exception {

        Assert.assertEquals(60,p.heartrate(10),0);

    }

    @Test
    public void testGrowth() throws Exception {

        Assert.assertEquals(1.2,p.growthrate(280000,250000,10),0);

    }
}
