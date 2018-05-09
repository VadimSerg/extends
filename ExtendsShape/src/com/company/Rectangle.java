package com.company;

public class Rectangle  extends  Figure {

   private double length ;
   private double  width ;

    Rectangle(double length , double width){
        this.length = length ;
        this.width = width ;
    }

    @Override
     public double computeSquare() {
        return length * width ;
    }
}
