package szkola;

public class PolHist extends Uczen{
	int Polski = 12;
	int Historia = 10;

	public PolHist(String i, String n, String d)
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
		System.out.println("\tMatma: " + this.Polski);
		System.out.println("\tFiza: " + this.Historia);
		System.out.println("\tHistoria: " + this.Historia);
		System.out.println("\tWF: " + this.WF);
		System.out.println("\tMuzyka: " + this.Muzyka);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
