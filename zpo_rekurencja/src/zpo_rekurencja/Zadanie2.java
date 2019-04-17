package zpo_rekurencja;

import java.util.Scanner;

public class Zadanie2 {	
	
	public static void rysuj(int dlugosc, int zagniezdzenia) {
	        for (int j = 1; j <= dlugosc; j++) {
	            przerwa(zagniezdzenia - 1);
	            linia(zagniezdzenia, j);
	        }
	    }

	    static void przerwa(int srodek) {
	        if (srodek >= 1) {
	            przerwa(srodek - 1);
	            linia(srodek);
	            przerwa(srodek - 1);
	        }
	    }
	    
	    static void linia(int ileKresek) {
	        linia(ileKresek, -1);
	    }

	    static void linia(int ileKresek, int liczba) {
	        for (int j = 0; j < ileKresek; j++)
	            System.out.print("-");
	        if (liczba >= 0)
	            System.out.print(" " + liczba);
	        System.out.print("\n");
	    }	    
	    
	    public static void main(String[] args) {

			Scanner pobierz = new Scanner(System.in);
	        
	    	System.out.println("Podaj d³ugosc linijki: ");    	
	    	int a = pobierz.nextInt();
	    	System.out.println("Podaj liczbe poziomow zagniezdzen: ");    	
	    	int b = pobierz.nextInt();   
	    	
	    	pobierz.close();    	
	    	System.out.println();
	    	
	    	for (int j = 0; j < b; j++)
	            System.out.print("-");
	        
	        System.out.print(" 0");
	        System.out.print("\n");
	        
	    	rysuj(a,b);
	    	System.out.println();  
		}
	}
