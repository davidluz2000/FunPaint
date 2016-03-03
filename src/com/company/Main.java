package com.company;
import birthDay.Bday;
import graphicshape.Circle;
import graphicshape.Triangle;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //creating a reference, something that can point to object
        Circle myCircle;
        // creating Object Circle and making referance to the newly created object
        myCircle = new Circle();
         //creating object is called instantiation
       //  it is also called initialization;

       // the below acctually calls the default myCircle.toString();
        System.out.println(myCircle.x);
        byte red = 8;
        byte green = 20;
        byte blue = -40;
        myCircle.fillColor(red, green, blue);
        myCircle.fillColor(0.8f, 12.3f, -50.14f);


       // Bday.wish("david");
       // Bday.wish();
        Triangle tr;
        tr = new Triangle(2,3,4);

    }
}
