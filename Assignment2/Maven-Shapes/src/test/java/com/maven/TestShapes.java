package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/05.
 */
public class TestShapes {

   CalculateShape s = new CalculateShape();

    @Test
    public void testSquareArea() throws Exception {

        Assert.assertEquals(9,s.squareArea(3),0);

    }

    @Test
    public void testSquarePerimeter() throws Exception {

        Assert.assertEquals(12,s.squarePerimeter(3),0);

    }

    @Test
    public void testRectangleArea() throws Exception {

        Assert.assertEquals(24,s.rectangleArea(6,4),0);

    }

    @Test
    public void testRectanglePerimeter() throws Exception {

        Assert.assertEquals(10,s.rectanglePerimeter(3,2),0);

    }

    @Test
    public void testTriangleArea() throws Exception {

        Assert.assertEquals(21,s.triangleArea(7,6),0);

    }

    @Test
    public void testTrianglePerimeter() throws Exception {

        Assert.assertEquals(9,s.trianglePerimeter(3,3,3),0);

    }

    @Test
    public void testCircleArea() throws Exception {

        Assert.assertEquals(78.5,s.circleArea(5),0);

    }

    @Test
    public void testCircleDiameter() throws Exception {

        Assert.assertEquals(20,s.circleDiameter(10),0);

    }

    @Test
    public void testCirclePerimeter() throws Exception {

        Assert.assertEquals(43.96,s.circlePerimeter(7),0);

    }


}
