package pointinheritance;

import java.text.DecimalFormat;
import javax.swing.*;

public class InheritanceTest{
    public static void main(String[] args){
        
        Point point1, point2;
        Circle circle1, circle2;
        
        point1 = new Point(30,50);
        circle1 = new Circle(2.7,120,89);
        
        String output = "Point point1: " + point1.toString() +
                        "\nCircle circle1: " + circle1.toString();
        //gebruik v/d "is-een"-relatie om te refereren naar een Circle 
        //via een Point referentie
        point2 = circle1;
        output += "\n\nCircle circle1 (via point2): " + point2.toString();
        //point2 toekennen aan circle2
        circle2 = (Circle)point2;
        output += "\n\nCircle circle1 (via circle2): " + circle2.toString();
        
        DecimalFormat precision2 = new DecimalFormat("0.00");
        output += "\nArea (via circle2): " + precision2.format(circle2.area());
        
        if( point1 instanceof Circle){
            circle2 = (Circle) point1;
            output += "\n\nCast gelukt";
        }
        else
            output += "\n\npoint1 is geen referentie naar een Circle";
        
        JOptionPane.showMessageDialog(null,output);
    }
}