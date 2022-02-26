package zalicznie;

import java.util.GregorianCalendar;

public class HeapSort {
	private static Pracownik [] pq;//dekalracje kolejki
	private static int n;
	
	private static class Pracownik implements Comparable<Pracownik>{
		String imie;//deklaracja elementu pracownika
		String nazwisko;
		GregorianCalendar rokUr;
				
		Pracownik(String im, String naz, GregorianCalendar rUr){//konstruktor
			imie = im;
			nazwisko = naz;
			rokUr=rUr;
		}
		public int compareTo(Pracownik p) {//porównywanie roku urodzenia
			return rokUr.compareTo(p.rokUr);
		}
		public String toString() {		//przekonwertowanie na stringa	
			return imie+" "+nazwisko;			
		}
	}
	
	
	public HeapSort(int initCapacity) {//konstruktor do sortowania
		pq=new Pracownik[initCapacity+1];
		n=0;
	}
	
	
	private boolean less(int v, int w) {  // sprawdza czy jedna wartoœæ jest mniejsza od drugiej
	       return (pq[v]).compareTo(pq[w]) < 0;     
	    }
	
	public void  insert( Pracownik p) {//dodanie do kolejki
		pq[++n]=p;
	}
	
	public void sort(Pracownik arrA[]) {//sortowanie kolejki
        int size = arrA.length;

        // zbudowanie kopca
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arrA, size, i);

        //jeden po drugim wydobywa max-element z kopca i zmienia go z ostatnim w tablicy
        
        for (int i=size-1; i>=0; i--) {

            // jezeli arrA[0] jest max-elementem to jest korzeniem w kopcu
        	Pracownik x = arrA[0];
            arrA[0] = arrA[i];
            arrA[i] = x;

            // wywo³uje max heapify dla zmniejszonego kopca
            heapify(arrA, i, 0);
        }
    }

    // sortowanie przez kopcowanie
    void heapify(Pracownik arrA[], int heapSize, int i) {
        int largest = i; // zadeklaruj najwiekszy element jako korzeñ
        int leftChildIdx  = 2*i + 1; // lewy = 2*i + 1
        int rightChildIdx  = 2*i + 2; // prawy = 2*i + 2

        //Jeœli lewy potomek jest wiekszy od korzenia
        if (leftChildIdx  < heapSize && less(leftChildIdx ,largest))
            largest = leftChildIdx ;

        // jeœli prawy potomek jest wiêkszy od korzenia
        if (rightChildIdx  < heapSize && less(rightChildIdx, largest))
            largest = rightChildIdx ;

        // jezlei najwiekszy element nie jest korzeniem
        if (largest != i) {
            Pracownik swap = arrA[i];
            arrA[i] = arrA[largest];
            arrA[largest] = swap;

            // rekurencyjne wywo³anie hipifiy dla poddrzewa
            heapify(arrA, heapSize, largest);
        }
    }

    public static void main(String args[]) {
    	
        HeapSort heapSort = new HeapSort(8);
        pq[0]=new Pracownik("null", "null", new GregorianCalendar(2000,9,23));
        heapSort.insert(new Pracownik("Jan", "Kowalski", new GregorianCalendar(1961,9,23)));
        heapSort.insert(new Pracownik("Tamara", "Bykowska", new GregorianCalendar(1929,4,20)));
        heapSort.insert(new Pracownik("Marian", "Baranowski", new GregorianCalendar(1958,5,20)));
        heapSort.insert(new Pracownik("Katarzyna", "Makowska", new GregorianCalendar(1972,3,20)));
        heapSort.insert(new Pracownik("Joanna", "Groth", new GregorianCalendar(1942,9,20)));
        heapSort.insert(new Pracownik("Monika", "W³odarska", new GregorianCalendar(1964,2,4)));
        heapSort.insert(new Pracownik("Kazimierz", "Nowakowski", new GregorianCalendar(1937,9,12)));
        heapSort.insert(new Pracownik("Waldemar", "Chamerski", new GregorianCalendar(1978,9,20)));
        
        System.out.println("Original array is: ");
        for(int i=1; i<pq.length;i++) {
        	System.out.println(pq[i].toString());
        }
        heapSort.sort(pq);
        System.out.println();

        System.out.println("Sorted array is (Heap Sort): ");
        for(int i=1; i<pq.length;i++) {
        	System.out.println(pq[i].toString());
        }
    }
}
