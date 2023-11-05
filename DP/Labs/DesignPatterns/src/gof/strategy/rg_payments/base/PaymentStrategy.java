/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy.rg_payments.base;

/**
 *
 * @author Mukhtiar
 */
public interface PaymentStrategy {
    void pay(int amount);
}
