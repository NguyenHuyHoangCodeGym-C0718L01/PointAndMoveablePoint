package com.company;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint(){}

    MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString()+", speed =("+getxSpeed()+", "+getySpeed()+")";
    }

    public void setSpeed(float xSpeed, float ySpeed){
        setX(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed(){
        return new float[]{getxSpeed(), getySpeed()};
    }

    public MovablePoint move(){
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
        return this;
    }
}