package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;

import static java.lang.Math.*;

import java.util.Scanner;
public class n {

	public static void main(String[] args) {
		
		 int n = parseInt (showInputDialog("Fakutet n:")); 
	     int fakultet = n;
	     
	     System.out.println(n+"!\n* "+ n);    
	 do {
		 fakultet-=1;
		 n*=fakultet;
		 System.out.println("* "+fakultet);
	 }
	 while((fakultet !=1) || (fakultet>1));
	 System.out.println("= "+n);
	
	 
	}

}
