/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryshapes;

import Shapes.*;
/**
 *
 * @author abkar
 */
public class FactoryShapes {

    public static void main(String[] args) {

      //get an object of Circle and call its draw method.
      Shape shape1 = ShapeFactory.makeShape("CIRCLE");

      //call draw method of Circle
      shape1.draw();

      //get an object of Rectangle and call its draw method.
      Shape shape2 = ShapeFactory.makeShape("RECTANGLE");

      //call draw method of Rectangle
      shape2.draw();

      //get an object of Square and call its draw method.
      Shape shape3 = ShapeFactory.makeShape("SQUARE");

      //call draw method of square
      shape3.draw();
   }
    
}
