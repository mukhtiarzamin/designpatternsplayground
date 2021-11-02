/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author Mukhtiar
 */
public abstract class Game {
   private void initialize(String gameName){
      System.out.println(gameName + " Game Initialized! Start playing.");
   }
   
   abstract void startPlay();
   abstract void endPlay();

   //template method
   public final void play(String gameName){

      //initialize the game
      initialize(gameName);

      //start game
      startPlay();

      //end game
      endPlay();
   }
}
