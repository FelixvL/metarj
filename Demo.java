

public class Demo{
	public static void main(String[] args) throws Throwable {
			// Procedureel     OOP    // Class Object
		System.out.println("Doei");
		int getal = 5;
		String naam = "Arjan";
		System.out.println(naam);
		String voornaam = "Arjan";
		String achternaam = "Wiegerinck";
		achternaam = "Pietersen";
		Student student1 = new Student();
		student1.voornaam ="Arjan";
		student1.achternaam = "Wiegerinck";
		student1.postcode = "1234AB";
		Telefoon t = new Telefoon();
		Leraar l1 = new Leraar();
		l1.opdrachtgeven(student1);
		
		Student student2 = new Student();
		student2.voornaam = "Wijnand";
		l1.opdrachtgeven(student2);
		
	
	}
}
class Telefoon{
	int telnummer;
}

class Student{
	String voornaam;
	String achternaam;
	String postcode;
}


class Leraar{
	void opdrachtgeven(Student student) {
		System.out.println("Ga eens studeren "+student.voornaam);
	}
	
}