package com.tg.modele;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CalculatriceModele {
	private DoubleProperty courant;
	private DoubleProperty resultat;
	private Operation operation;
	
	public CalculatriceModele() {
		this.courant = new SimpleDoubleProperty(0);
		this.resultat = new SimpleDoubleProperty(0);
		this.operation = Operation.None;
	}
	
	public void addition() {
		if(operation == Operation.None)
			operation = Operation.ADDITION;
		else {
			operation = Operation.ADDITION;
			resultat.setValue(courant.getValue() + resultat.getValue());
			courant.setValue(resultat.getValue());
		}
	}
	
	public void soustraction() {
		
	}
	
	public void multiplication() {
		
	}
	
	public void division() {
		
	}
	
	public void pourcent() {
		
	}
	
	public void racine() {
		
	}
	
	public void carre() {
		
	}
	
	public void inverse() {
		
	}
	
	public void oppose() {
		
	}
	
	public void egale() {
		
		switch(operation) {
		 case ADDITION:
         	break;
		 case SOUSTRACTION: ;
         	break;
		 case Operation.ADDITION ;
         	break;
		 case Operation.ADDITION: ;
         	break;
		 case : modele.division();
         	break;
		 default: 
         	break;
		}
	}
	
	public void init() {
		
	}
	
	public DoubleProperty courantDoubleProperty() {
		return courant;
	}
	
	enum Operation{None, ADDITION, SOUSTRACTION, MULTIPLICATION,
		DIVISION, POURCENT, RACINE, CARRE, INVERSE, OPPOSE, EGALE}
}
