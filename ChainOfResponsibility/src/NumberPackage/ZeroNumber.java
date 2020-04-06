package NumberPackage;

public class ZeroNumber implements Chain {

	private Chain nextChain;  
	
	public void SetNext(Chain chain) {
		nextChain = chain;

	}

	
	public void ClientNumber(Number clientNumber) {
	
		if (clientNumber.getNumber() == 0)
		{
			System.out.println("The number: " + clientNumber.getNumber() + " is ZERO!");
			
		}
		
		else 
		{
			nextChain.ClientNumber(clientNumber);
			
		}

	}

}
