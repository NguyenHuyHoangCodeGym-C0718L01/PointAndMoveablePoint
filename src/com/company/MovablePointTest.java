package com.company;

public class MovablePointTest {
    public static void main(String[] args){
        MovablePoint point3D = new MovablePoint();
        System.out.println(point3D.toString());
        point3D.setSpeed(0.1f, 0.2f);
        System.out.println("x = "+point3D.getSpeed()[0]+", y = "+point3D.getSpeed()[1]);
        point3D.move();
        System.out.println(point3D.toString());
        System.out.println();

        MovablePoint point3D1 = new MovablePoint(1.1f, 1.2f, 1.3f, 1.4f);
        System.out.println(point3D1.toString());
        point3D1.setSpeed(2.1f, 2.2f);
        System.out.println("x = "+point3D1.getSpeed()[0]+", y = "+point3D1.getSpeed()[1]);
        point3D1.move();
        System.out.println(point3D1.toString());
        System.out.println();

        MovablePoint movablePoint = new MovablePoint(3.1f, 3.2f);
        System.out.println(movablePoint.toString());
        movablePoint.setSpeed(4.1f, 4.2f);
        System.out.println("x = "+movablePoint.getSpeed()[0]+", y = "+movablePoint.getSpeed()[1]);
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
