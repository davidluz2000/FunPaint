package graphicshape;

/**
 * Created by limor on 02/03/2016.
 */
public class Circle extends Shape{
    public int x;
    private int y;
    int z;
    protected int w;
    protected int radius;
    // below is default accessible

    private final static int DEFAULT_X = 20;
    private final static int DEFAULT_Y = 20;

    public double area(){
        // Math.PI  it is a constant, it is a final static field
        // final means it cannot be changed e.g. Math.PI = 4
        // static means that it is belongs to the class as oppuse to a non-static witch belogs
        return Math.PI * radius * radius;
    }

    //acccess modifiers Public Private Protected Default
    // this is a constructor
    public Circle(){
        // nothing can be writen before "this" it is an error
        // System.out.println("in Constructor");
        this(20,20,10);
       // this is not valid syntax Circle(20,20,10);

    }

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        if(radius >=0)
            this.radius = radius;
    }

    public void fillColor(byte red, byte green, byte blue){
        System.out.println("color1:" + color);
    }

    public void fillColor(float hue, float saturation, float brightness){
        System.out.println("color2:" + color);
    }

    // we are going to override the toString method
    //  @Override verifys that it will override exeisting method
    @Override
    public String toString(){

        return "center = ("+x+", "+y+") and radius=" + " "+ radius;
    }
}
