package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("m��teri eklendi.");
		//somut s�n�ftan gidilmez.
		//bir kodun i�inde ba�ka bir i� yapan s�n�f newlwnmwz.!!!!
		//DatabaseLogger logger = new DatabaseLogger();
		
		
		logger.log();
	}
	
}
