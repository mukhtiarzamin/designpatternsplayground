/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1.wikiexample;

import Observer.example1.wikiexample.EventSource.Observer;

/**
 *
 * @author Mukhtiar
 */
public class CObserver2 implements Observer {

    @Override
    public void update(String event) {
        System.out.println("CObserver2 Received response: " + event);
    }
    
}
