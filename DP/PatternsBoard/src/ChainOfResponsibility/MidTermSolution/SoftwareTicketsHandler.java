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
public class SoftwareTicketsHandler extends TicketsHandler {
    
    public SoftwareTicketsHandler(TicketsHandler successor) {
        super(successor);
    }
    
    @Override
    public int GenerateTicket(TicketType type) {
      if(type == TicketType.SoftwareTicket)
      {
      System.out.println("Let me handle the ticket generation with x,y,x info");
      return (int)Math.random();
      }
      else if(successor == null)
          throw new UnsupportedClassVersionError("This type of ticket is not supported!");
      else     
         return successor.GenerateTicket(type);
    
    } 
    
}
