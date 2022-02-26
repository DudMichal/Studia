package szkola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Klasa implements Iterable<Uczen>{
	static ArrayList<Uczen> uczniowie = new ArrayList<Uczen>();
	
	@Override
	public Iterator<Uczen> iterator()
	{
		return uczniowie.iterator();
	}
	
	public static void main(String[] args) 
	{
		uczniowie.add(new MatFiz("Michal", "Dudek","12-02-2001"));
		uczniowie.add(new BioChem("Annna", "Dupow³as","13-09-2001"));
		uczniowie.add(new BioPol("Emilia", "Kasztan","21-01-2001"));
		uczniowie.add(new PolHist("Jajami", "O'mate","54-05-2001"));
		uczniowie.add(new MatFiz("Tomasz", "Stykala","02-08-2001"));
		uczniowie.add(new BioChem("Adrian", "Miskiewicz","28-06-2001"));
		uczniowie.add(new BioPol("Damina", "Mucha","29-08-2001"));
		uczniowie.add(new PolHist("Aman", "Ty","16-04-2001"));
		uczniowie.add(new MatFiz("DRM", "Awid","01-09-2001"));
		uczniowie.add(new BioChem("Tetra", "Deus","31-02-2001"));
		uczniowie.add(new BioPol("Lidka", "Siura","17-03-2001"));
		uczniowie.add(new PolHist("Dawid", "Mielonka","21-04-2001"));
		uczniowie.add(new MatFiz("Jola", "Lola","19-12-2001"));
		uczniowie.add(new BioChem("Ula", "Brzydula","12-11-2001"));
		uczniowie.add(new BioPol("Sonia", "Roskolnikowa","09-11-2001"));
		uczniowie.add(new PolHist("Oskar", "Dyntka","01-10-2001"));
		uczniowie.add(new MatFiz("Melwin", "Delfin","12-05-2001"));
		uczniowie.add(new BioChem("Wiktoria", "Szparka","13-03-2001"));
		uczniowie.add(new BioPol("Milena", "Pilena","29-08-2001"));
		uczniowie.add(new PolHist("Wiktor", "Wiktorowicz","12-07-2001"));
		Wozny wozny = new Wozny();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Witamy w bazie danych uczniów II Liceum ");
		System.out.println("Aby wypisaæ uczniów Klasy MatFiz wpisz ?");
		System.out.println("Aby wypisaæ uczniów Klasy BioPol wpisz !");
		System.out.println("Aby wypisaæ uczniów Klasy BioChem wpisz @");
		System.out.println("Aby wypisaæ uczniów Klasy PolHist wpisz #");
		System.out.println("Aby wypisaæ woznego wpisz Wozny");
		
		String kto = scan.nextLine();
		
		if(kto.equals("?"))
		{
			for(Uczen x: uczniowie)
			{
				if(x.getClass().toString().endsWith("MatFiz"))
				{
					System.out.println(x.imie +" "+ x.nazwisko);
				}
			}
		}
		if(kto.equals("!"))
		{
			for(Uczen x: uczniowie)
			{
				if(x.getClass().toString().endsWith("BioPol"))
				{
					System.out.println(x.imie +" "+ x.nazwisko);
				}
			}
		}
		if(kto.equals("@"))
		{
			for(Uczen x: uczniowie)
			{
				if(x.getClass().toString().endsWith("BioChem"))
				{
					System.out.println(x.imie +" "+ x.nazwisko);
				}
			}
		}
		if(kto.equals("#"))
		{
			for(Uczen x: uczniowie)
			{
				if(x.getClass().toString().endsWith("PolHist"))
				{
					System.out.println(x.imie +" "+ x.nazwisko);
				}
			}
		}
		if(kto.equals("Wozny"))
		{
			wozny.wypisz();
		}
		
		while(true)
		{
			String  uczenImie = scan.nextLine();
			String  uczenNazwisko = scan.nextLine();
			
			for(Uczen u : uczniowie) 
			{
	
				if(u.imie.equals(uczenImie) && u.nazwisko.equals(uczenNazwisko))
				{
					if(u.getClass().toString().endsWith("MatFiz")) {
						((MatFiz)u).wypisz();
					}
					if(u.getClass().toString().endsWith("BioChem")) {
						((BioChem)u).wypisz();
					}
					if(u.getClass().toString().endsWith("BioPol")) {
						((BioPol)u).wypisz();
					}
					if(u.getClass().toString().endsWith("PolHist")) {
						((PolHist)u).wypisz();
					}
					
				}
				
			}
			
	
			
		}
			
		
		
		
	}

}
