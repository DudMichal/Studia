package szkola;

public class BioPol extends Uczen{
	int Biologia = 12;
	int Polski = 14;

	public BioPol(String i, String n, String d)
	{
		this.imie = i;
		this.nazwisko = n;
		this.data_Ur = d;
	}
	public void wypisz() 
	{
		System.out.println("Imie: " + this.imie);
		System.out.println("Nazwisko: " + this.nazwisko);
		System.out.println("Ilosc zajec: ");
		System.out.println("\tMatma: " + this.Biologia);
		System.out.println("\tFiza: " + this.Polski);
		System.out.println("\tHistoria: " + this.Historia);
		System.out.println("\tWF: " + this.WF);
		System.out.println("\tMuzyka: " + this.Muzyka);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
