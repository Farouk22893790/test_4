package VoiturePackage;

public class Voiture {
	
	static String Name; 
	int year;
	String model;
	
	public Voiture ( String n, int y, String m) {  // constructeur
	 Name = n;
	year =y;
	model = m; 
	}



	
	
	static void avancer () { // fonction qui affiche...
		System.out.println("la voiture " + Name + " avance" );
		
	} 

	static void freiner () {
		System.out.println("la voiture freine");
		
	} 
	
	public static void main(String[] args) { // methode d'excution
		avancer();
		freiner();
		Voiture Car1=new Voiture("bmw",2019,"awm");
		System.out.println(Car1.Name +" "+ Car1.year +" "+ Car1.model);
	}

}
