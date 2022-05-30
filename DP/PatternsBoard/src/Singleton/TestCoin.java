/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Mukhtiar
 */
public class TestCoin {
    public static void main(String[] args){    
        Coin obj = new Coin();
       // obj.coin = 4;
        System.out.print(obj.getCoin());
    }
}
