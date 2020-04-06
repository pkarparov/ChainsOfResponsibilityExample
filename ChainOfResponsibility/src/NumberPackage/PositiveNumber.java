package NumberPackage;

public class PositiveNumber implements Chain {

	private Chain nextChain;
	

	public void SetNext(Chain chain) {
		nextChain = chain;

	}


	public void ClientNumber(Number clientNumber) {
		
		if (clientNumber.getNumber() > 0)
		{
			System.out.println("The number: " + clientNumber.getNumber() + " is positive!");
			
		}
		
		else 
		{
			nextChain.ClientNumber(clientNumber);
			
		}
	}

}
