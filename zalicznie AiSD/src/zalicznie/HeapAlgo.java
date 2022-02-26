package zalicznie;

public class HeapAlgo {
	// Wyœwietlanie tablicy
    void printArr(char a[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    //Sprawdza czy tablica jest kopce
    public static boolean czyJestKopcem(char [] abc) {//sprawdza lewo prawo lewo...
		int dlugosc=abc.length;
		boolean jestKopcem = true;
		for(int k=1; k<abc.length;k++) {
			if(2*k>=dlugosc) return true;
			jestKopcem=abc[k]>=abc[2*k];
			if(2*k+1>=dlugosc) return jestKopcem;
			jestKopcem=jestKopcem && abc[k]>=abc[2*k+1];
			if(!jestKopcem) return false;
		}
		return jestKopcem;
		}
 
    // Generwoanie permutacji za pomoc¹ algorytmu kopcowania
    void heapPermutation(char a[], int size, int n)//jak wygl¹daj¹ kompinacje 
    {
    	char A[] = new char[a.length+1];
    	A[0]=' ';
    	for(int i=1;i<A.length;i++) {
    		A[i]=a[i-1];
    	}
    	
        // Jeœli rozmiar wynosi 1 drukuje uzyskana permutacje
 
        if (size == 1 && czyJestKopcem(A) )
            printArr(a, n);
 
        for (int i = 0; i < size; i++) {
            heapPermutation(a, size - 1, n);
 
            // jesli wielkoœæ jest nieparzysta zamieniasz pierwszy i ostatni element
            if (size % 2 == 1) {
                char temp = a[0];
                a[0] = a[size - 1];
                a[size - 1] = temp;
            }
 
            // je¿eli wielkoœæ kopca jest parzysta zamieniasz element i-ty i ostatni
            
            else {
                char temp = a[i];
                a[i] = a[size - 1];
                a[size - 1] = temp;
            }
        }
    }
 
    
    public static void main(String args[])
    {
        HeapAlgo obj = new HeapAlgo();
        char a[] = { 'a', 'b', 'c', 'd','e','f','g'};
        obj.heapPermutation(a, a.length, a.length);
    }
}

