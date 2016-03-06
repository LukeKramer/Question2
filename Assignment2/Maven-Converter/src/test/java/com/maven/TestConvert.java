package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/05.
 */
public class TestConvert {

    TestConvertcalc con = new TestConvertcalc();

    @Test
    public void testKmMiles() throws Exception {

        Assert.assertEquals(0.621371,con.kmtoMiles(1),0);

    }

    @Test
    public void testMilesKm() throws Exception {

        Assert.assertEquals(1.60934,con.milesKm(1),0);

    }

    @Test
    public void testKgtoPounds() throws Exception {

        Assert.assertEquals(2.20462,con.kgtoPound(1),0);


    }

    @Test
    public void testPoundstoKg() throws Exception {

        Assert.assertEquals(0.453592,con.poundtoKg(1),0);


    }

    @Test
    public void testCtoF() throws Exception {

        Assert.assertEquals(86.0,con.celciustoF(30),0);


    }

    @Test
    public void testFtoC() throws Exception {

        Assert.assertEquals(60.0,con.fahrenheittoC(140),0);


    }




}
