package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("müþteri eklendi.");
		//somut sýnýftan gidilmez.
		//bir kodun içinde baþka bir iþ yapan sýnýf newlwnmwz.!!!!
		//DatabaseLogger logger = new DatabaseLogger();
		
		
		logger.log();
	}
	
}
