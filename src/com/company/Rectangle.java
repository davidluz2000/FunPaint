package com.company;

import graphicshape.Shape;

/**
 * Created by limor on 02/03/2016.
 */
public class Rectangle extends Shape {
    public void draw(){

        // we can access here only because we defined color in shape class "protected int color;"
        System.out.println("color:" + color);

    }
}
