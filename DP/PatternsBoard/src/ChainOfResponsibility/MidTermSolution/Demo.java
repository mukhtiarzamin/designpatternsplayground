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
public class Demo {
    
    public static void main(String[] args) {
        ITickets chainObj;
        chainObj = new SoftwareTicketsHandler(new HardwareTicketsHandler(null));
        System.out.println("Hardware Ticket Generated with :"+ chainObj.GenerateTicket(TicketType.HardwareTicket));
        System.out.println("Software Ticket Generated with :"+ chainObj.GenerateTicket(TicketType.SoftwareTicket));
	}
}
