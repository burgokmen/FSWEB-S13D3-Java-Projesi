package com.brutech.opp;

public class Wall {
    double height;
    double width;

    public Wall( double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        //(height>0) ? this.height = height : this.height = 0;
        if(height>0){
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getArea(){
        return height * width;
    }
}
