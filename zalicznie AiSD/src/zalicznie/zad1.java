package zalicznie;

import java.util.Scanner;

public class zad1 {
	Node poczatek; // poczatek listy
	 
    /* lista dwukierunkowa powiazana*/
    class Node {
        String litery;
        Node prev;
        Node next;
 
        // konstruktor do stworzenia node
        // next and prev = null
        Node(String l) { litery = l; }
    }
    public void push(String litera)
    {
        // 1. utworzenie node i przypisanie do niego litert
        
        Node nowaLitera = new Node(litera);
     
        /* 3. po³¹cznie do nastepnego to stary poczatek, do poprzedniego null */
        nowaLitera.next = poczatek;
        nowaLitera.prev = null;
     
        /* 4. poprzedni polacznie do poczatku bedzie nowy element */
        if (poczatek != null)
            poczatek.prev = nowaLitera;
     
        /* 5. nowa litera staje sie poczatkiem listy */
        poczatek = nowaLitera;
    }
    private Node znajdzElement(String litera) {// funkcja do znajdowania node do ktorego nalezy litera
        Node szukanyElement = null;
        for(Node x=poczatek;x!=null;x=x.next) {//przegladanie listy
            if(x.litery.equals(litera)) {
                szukanyElement = x;
            }
        }
        return szukanyElement;
    }
    private boolean szukanie(String litera)//sprawdzanie czy dana litera jest na liscie
    {
    	for(Node x=poczatek; x!=null; x=x.next) {//przegladanie listy
    		  if(x.litery.equals(litera)){
    		    return true;
    		  }
    		}
    		return false;
    }
    void deletelitera(String litera)//Fnkcja szuka noda dla danej litery i usuwa ja.
    {
    	Node del = znajdzElement(litera); 
    	deleteNode(del);
    }
    void deleteNode(Node del)
    {
 
        // sprawdza czy lista jest pusta
        if (poczatek == null || del == null) {
            return;
        }
 
        // sprawdza czy node ktory ma byæ usuniety jest poczatkiem
        if (poczatek == del) {
            poczatek = del.next;
        }
 
        // sprawdza czy node ktory ma byc usuniety nie jest ostatnim
       
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        // sprawdza czy node ktory ma byc usuniety nie jest pierwszy
        if (del.prev != null) {
            del.prev.next = del.next;
        }
        return;
    }
    public void print() {  
        Node obecnyElement = poczatek;
        int numerElementu = 1;
          
        if(poczatek == null) {  //sprawdza czy lista nie jest pusta 
            System.out.println("Lista jest pusta");  
            return;  
        }  
        System.out.println("Elementy listy: ");
        System.out.println();
        while(obecnyElement != null) {
            System.out.println("Element nr "+numerElementu+" ma wartoœæ "+obecnyElement.litery + " ");  
            obecnyElement = obecnyElement.next;  
            numerElementu++;
        }  
        System.out.println();
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//wpisywanie z klawiatury
		zad1 lista = new zad1();//deklaracja listy
		System.out.println("Podaj ciag znakow, aby zkonczyæ kliknij Q");
		String a = "";
		do 
		{
			a = in.nextLine();
			if (lista.szukanie(a))
			{
				lista.deletelitera(a);//jezeli litera istnieje to jest usuwana
			}
			lista.push(a);//dodawanie elementow do listy
			
		}
		while(!a.equals("Q"));
		
		
		lista.print();
		in.close();
	

	}

}
