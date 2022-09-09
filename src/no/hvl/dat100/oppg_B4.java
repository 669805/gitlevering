package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;

import static java.lang.Math.*;

public class oppg_B4 {

	public static void main(String[] args) {
		
	String intektTxt = showInputDialog("Intekter: ");
	int tallintekter = parseInt(intektTxt);
	
	if (tallintekter < 267899 && tallintekter >= 190350 ) {
		System.out.println("Trinn 1: 1.7% sats, bruttointekt: " + intektTxt);}
	
	else if (tallintekter <  643799 && tallintekter >= 267900  ) {
		System.out.println("Trinn 2: 4.0% sats, bruttointekt: " + intektTxt);}
	
	else if (tallintekter <  969199 && tallintekter >= 643799  ) {
		System.out.println("Trinn 3: 13.8% sats, bruttointekt: " + intektTxt);}
	
	else if (tallintekter <  2000000 && tallintekter >= 969199  ) {
		System.out.println("Trinn 4: 16.4% sats, bruttointekt: " + intektTxt);}
	
	else if (tallintekter >=  2000000  ) {
		System.out.println("Trinn 5: 17.4% sats, bruttointekt: " + intektTxt);}
	
	else if (tallintekter <  190350  ) {
		System.out.println("Trinn 0: 0.0% sats, bruttointekt: " + intektTxt);}
	}       }
	
	
	
	

	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	


	


