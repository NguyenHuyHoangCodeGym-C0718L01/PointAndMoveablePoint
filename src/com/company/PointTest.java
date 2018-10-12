package com.company;

public class PointTest {
    public static void main(String[] args){
        Point point2D = new Point();
        System.out.println(point2D.toString());
        point2D.setXY(2.4f, 3.6f);
        System.out.println("x = "+point2D.getXY()[0]+", y = "+point2D.getXY()[1]);


        Point point2D1 = new Point(1.2f, 5.5f);
        System.out.println(point2D1.toString());
        point2D1.setXY(0.5f, 0.1f);
        System.out.println("x = "+point2D1.getXY()[0]+", y = "+point2D1.getXY()[1]);
    }
}
