package zpo_rekurencja;

import java.lang.Math;
import java.util.Scanner;

public class Zadanie1 {
	
	static void rysuj(String znak, int n, int m){
	    
		int potega=(int)(Math.pow(2, m-1));		
		
		if(m>0){	
		
			for (int j=0;j<=n;j++) {		
				System.out.print(znak);
		
				for (int i=0;i<(potega-1);i++) {
					System.out.print(" ");
				}
			}
		
			System.out.print("\n");		
			rysuj(znak,n*2,m-1);    
		}
	}
    
    
    public static void main(String[] args) {
    	
        Scanner pobierz = new Scanner(System.in);
        
    	System.out.println("Podaj d³ugosc linijki: ");    	
    	int a = pobierz.nextInt();
    	System.out.println("Podaj liczbe poziomow zagniezdzen: ");    	
    	int b = pobierz.nextInt();   
    	
    	pobierz.close();    	
    	System.out.println(); 	    	
    	
    	int potega=(int)(Math.pow(2, b-1));		
		
		for (int j=0;j<=a;j++) {		
			System.out.print(j);
		
			for (int i=0;i<(potega-1);i++)
				System.out.print(" ");			
		}
		
		System.out.print("\n");    	    	
    	rysuj("|",a,b);    	
        System.out.println();        
    }    
}
