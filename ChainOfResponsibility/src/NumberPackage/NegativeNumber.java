package NumberPackage;

public class NegativeNumber implements Chain {

	private Chain nextChain;
	
	public void SetNext(Chain chain) {
		nextChain = chain;
	}

	
	public void ClientNumber(Number clientNumber) {
		
		if (clientNumber.getNumber() < 0)
		{
			System.out.println("The number: " + clientNumber.getNumber() + " is negative!");	
		}
		
		else 
		{
			nextChain.ClientNumber(clientNumber);
		}


	}

}
