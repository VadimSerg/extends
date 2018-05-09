package com.company;


public class Triangle extends Figure{
    double a,b,c,h;
    Triangle(double a,double h){
        this.a = a;
        this.h = h;

    }

    @Override
    double computeSquare() {
        return (a*h/2);
    }
}
