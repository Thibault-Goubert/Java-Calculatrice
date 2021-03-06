package com.tg.modele;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.TextField;

public class CalculatriceModele {
	private DoubleProperty courant;
	private DoubleProperty resultat;
	private DoubleProperty derniereEntrer;
	private Operation operation;
	private boolean nouvelleEntrer;
	enum Operation {NONE, ADDITION, SOUSTRACTION, MULTIPLICATION, DIVISION,
		POURCENT, RACINE, CARRE, INVERSE, OPPOSE, EGALE}
	
	public CalculatriceModele()
	{
		courant = new SimpleDoubleProperty();
		resultat = new SimpleDoubleProperty();
		derniereEntrer = new SimpleDoubleProperty();
		operation = Operation.NONE;
		nouvelleEntrer = true;
	}
	
	public void addition(TextField tf){
		setOperation(tf, "addition", Operation.ADDITION);
	}
	
	public void soustraction(TextField tf){
		setOperation(tf, "soustraction", Operation.SOUSTRACTION);
	}
	
	public void multiplication(TextField tf){
		setOperation(tf, "multiplication", Operation.MULTIPLICATION);
	}
	
	public void division(TextField tf){
		setOperation(tf, "divison", Operation.DIVISION);
	}
	
	private void setOperation(TextField tf, String s, Operation op){
		resultat.setValue(courant.getValue());
		courant.setValue(0);
		operation = op;
		tf.clear();
		//Debug
		afficherDebug(s);
	}
	
	public void pourcent(){
		courant.setValue(resultat.getValue()*(courant.getValue()/ 100));
	}
	
	public void racine(){
		courant.setValue(Math.sqrt(courant.getValue()));
	}
	
	public void carre(){
		courant.setValue(Math.pow(courant.getValue(),2));
	}
	
	public void inverse(){
		courant.setValue(1/courant.getValue());
	}
	
	public void oppose(){
		if(courant.getValue() < 0){
			courant.setValue(Math.abs(courant.getValue()));
		}
		else{
			courant.setValue(courant.getValue()-(2*courant.getValue()));
		}
	}
	
	public void egale(){
		
		switch(operation){
		
			case ADDITION : 
				resultat.setValue(courant.getValue() + resultat.getValue());
				courant.setValue(resultat.getValue());
				//Debug
				afficherDebug("egale case:ADDITION");
				//
				break;
			case SOUSTRACTION : 
				resultat.setValue(resultat.getValue() - courant.getValue());
				courant.setValue(resultat.getValue());
				//Debug
				afficherDebug("egale case:SOUSTRACTION");
				//
				break;
			case MULTIPLICATION : 
				resultat.setValue(courant.getValue() * resultat.getValue());
				courant.setValue(resultat.getValue());
				//Debug
				afficherDebug("egale case:MULTIPLICATION");
				//
				break;
			case DIVISION : 
				resultat.setValue(resultat.getValue() / courant.getValue());
				courant.setValue(resultat.getValue());
				//Debug
				afficherDebug("egale case:DIVISION");
				//
				break;
			default:
				break;
		}
	}
	
	public void init(TextField tf){
		courant.setValue(0);
		resultat.setValue(0);
		operation = Operation.NONE;
		nouvelleEntrer = true;
		tf.clear();
		
		afficherDebug("init");
	}
	
	public void initcourant(){
		courant.setValue(0);
		afficherDebug("initcourant");
	}
	
	public DoubleProperty courantDoubleProperty(){
		return courant;
	}

	private void afficherDebug(String s)
	{
		System.out.println(s + "=courant=" + courant.getValue());
		System.out.println(s + "=resultat=" + resultat.getValue());
		System.out.println(s + "=operation=" + operation.name());
		System.out.println(s + "=nouvelleEntrer=" + nouvelleEntrer);
		System.out.println(s + "=derniereEntrer=" + derniereEntrer.getValue());
		System.out.println("");
	}
}
