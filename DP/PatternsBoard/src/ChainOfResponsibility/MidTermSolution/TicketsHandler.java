/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility.MidTermSolution;

/**
 *
 * @author Mukhtiar
 */
public abstract class TicketsHandler implements ITickets {

    TicketsHandler successor;
    public TicketsHandler(ITickets successor){
    this.successor = (TicketsHandler) successor;
    }
    @Override
    public int GenerateTicket(TicketType type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
