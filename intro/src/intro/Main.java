package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repet yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);

		if(dolarDun>dolarBugun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarDun<dolarBugun){
				System.out.println("Dolar yükseldi resmi");
		}else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String[] krediler = 
			{
				"Hýzlý kredi",
				"Mutlu emekli kredisi",
				"Konut kredisi",
				"Çiftçi kredisi",
				"Msb kredisi",
				"Meb kredisi",
			};
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
