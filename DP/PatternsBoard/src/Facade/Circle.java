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
public class Circle implements Shape {

   @Override
   public void draw(String... options) {
      System.out.println("Circle::draw()" + printWithOptions(options));
   }

    private String printWithOptions(String[] options) {
        String optionsForPrint = "";
        for(String opt: options)
            optionsForPrint += opt + " ";
        return optionsForPrint;
    }
}
