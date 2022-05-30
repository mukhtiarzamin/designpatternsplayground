/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1.wikiexample;

/**
 *
 * @author Mukhtiar
 */
public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        
        eventSource.addObserver(new ConcreteObserver());
        eventSource.addObserver(new CObserver2());

        eventSource.scanSystemIn();
    }
}
