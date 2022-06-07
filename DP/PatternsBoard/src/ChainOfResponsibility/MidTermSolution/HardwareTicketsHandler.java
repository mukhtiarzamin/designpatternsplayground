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
public class HardwareTicketsHandler extends TicketsHandler {
    
    public HardwareTicketsHandler(TicketsHandler successor) {
        super(successor);
    }
    
    @Override
    public int GenerateTicket(TicketType type) {
      if(type == TicketType.HardwareTicket)
      {
      System.out.println("Let me handle the hardware ticket generation with x,y,x info");
      return (int)Math.random();
      }
      else
         return successor.GenerateTicket(type);
    
    } 
    
}
