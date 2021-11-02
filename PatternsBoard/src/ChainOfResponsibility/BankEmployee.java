/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author Mukhtiar
 */
public class BankEmployee extends BaseApprover{
	private String title;
	private int approvalLimit;

	public BankEmployee(String title, int approvalLimit) {
		this.title = title;
		this.approvalLimit = approvalLimit;
	}

	@Override
	public void process(Loan loan) {
		if(loan.getAmount()<=approvalLimit){
			System.out.println(loan+" is approved by "+title);
		}
		else if(next!=null){
			System.out.println(title+" forwards the loan "+loan.getNumber()+" for processing");
			next.process(loan);
		}
		else{
			System.out.println(loan+" cannot be processed");
		}
		
	}
	
}
