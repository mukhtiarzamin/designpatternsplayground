/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Mukhtiar
 */
public class Square implements Shape {

   @Override
   public void draw(String... options) {
      System.out.println("Square::draw()" + options);
   }
}
