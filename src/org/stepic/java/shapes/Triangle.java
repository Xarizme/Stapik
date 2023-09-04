package org.stepic.java.shapes;

public class Triangle extends Shape{
    public final Point a;
    public final Point b;
    public final Point c;

    public Triangle(Point a,Point b,Point c,Color color){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double getArea() {
        return Math.abs((a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getY())*(a.getY()-c.getY()))/2;
    }
    @Override
    public String toString(){
        return "Triangle{"+
                "a="+a+
                ", b="+b+
                ", c="+c+
                ", color="+getColor()+
                '}';
    }
}
