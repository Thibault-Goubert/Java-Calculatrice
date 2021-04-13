package com.tg.modele;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CalculatriceModele {
	private DoubleProperty courant;
	private DoubleProperty resultat;
	enum Operation {NONE, ADDITION, SOUSTRACTION, MULTIPLICATION, DIVISION,
		POURCENT, RACINE, CARRE, INVERSE, OPPOSE, EGALE}
	
	private CalculatriceModele()
	{
		courant = new SimpleDoubleProperty(0);
		resultat = new SimpleDoubleProperty(0);
	}
	
	private void soustraction(){
		
	}
	
	private void multiplication(){
		
	}
	
	private void division(){
		
	}
	
	private void pourcent(){
		
	}
	
	private void racine(){
		
	}
	
	private void carre(){
		
	}
	
	private void inverse(){
		
	}
	
	private void oppose(){
		
	}
	
	private void egale(){
		
	}
	
	private void init(){
		
	}
	
	private DoubleProperty courantDoubleProperty(){
		return courant;
	}
	
}
