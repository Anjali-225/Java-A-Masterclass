package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt( (0 - x) * (0 - x) + (0 - y) * (0 - y) );
    }

//    public double distance () {
//        return distance(0,0);
//    }

    public double distance(int x, int y) {
        return Math.sqrt( (this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) );
    }

    public double distance(Point B) {
        return Math.sqrt( (B.x - x) * (B.x - x) + (B.y - y) * (B.y - y) );
    }

//    public double distance(Point b){
//        return distance(b.getX(), b.getY());
//    }
}
