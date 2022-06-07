/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod.v1basicgameexample;

/**
 *
 * @author Mukhtiar
 */
public class TemplatePatternDemo {
   public static void main(String[] args) {
      Game game = new Cricket();
      game.play("Cricket");
      System.out.println();
      
      game = new Football();
      game.play("Football");		
   }
}
