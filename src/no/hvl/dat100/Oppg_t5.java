package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;

import static java.lang.Math.*;

import java.util.Scanner;

public class Oppg_t5 {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		
		for( int i=1; i<=10; i++) { 
		System.out.println("Poeng sum:");
		
    int n = scan.nextInt();
    
    
    
    	if (n>=90 && n<=100) {  
    	System.out.println("A - Utmerket!");}
    
    else if (n>=80 && n<=89) {
    	System.out.println("B - Veldig bra");}
    
    else if (n>=60 && n<=79) {
    	System.out.println("C - Greit");}
    
    else if (n>=50 && n<=59) {
    	System.out.println("D - Midt på treet");}
    
    else if (n>=40 && n<=49) {
    	System.out.println("E - Ikke så bra");}
    
    else if (n>=0 && n<=39) {
    	System.out.println("F - Strykk!");}
    
    else {System.out.println("Ikke gyldig");
       i-=1;  }
		  
    	
    	}
	
	
	}}
    		
	


