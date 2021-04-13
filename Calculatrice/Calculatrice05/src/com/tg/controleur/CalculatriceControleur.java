package com.tg.controleur;

import com.tg.modele.CalculatriceModele;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.control.MenuItem;

public class CalculatriceControleur {
	private CalculatriceModele modele;
	
	// Menu format
	@FXML
	private MenuItem m_sortie;
	@FXML
	private MenuItem m_standard;
	@FXML
	private MenuItem m_scientifique;
	
	// Menu aide
	@FXML
	private MenuItem m_aidecalculatrice;
	@FXML
	private MenuItem m_apropos;
	
	
	@FXML
	private TextField t_saisie;
	
	
	@FXML
	private Button b_zero;
	@FXML
	private Button b_un;
	@FXML
	private Button b_deux;
	@FXML
	private Button b_trois;
	@FXML
	private Button b_quatre;
	@FXML
	private Button b_cinq;
	@FXML
	private Button b_six;
	@FXML
	private Button b_sept;
	@FXML
	private Button b_huit;
	@FXML
	private Button b_neuf;
	
	//Buttons operations
	@FXML
	private Button b_division;
	@FXML
	private Button b_multiplication;
	@FXML
	private Button b_soustraction;
	@FXML
	private Button b_addition;
	@FXML
	private Button b_egale;
	@FXML
	private Button b_carre;
	@FXML
	private Button b_racine;
	
	// Autres
	@FXML
	private Button b_back;
	@FXML
	private Button b_clear;
	@FXML
	private Button b_clearentry;
	@FXML
	private Button b_pourcent;
	@FXML
	private Button b_virgule;
	@FXML
	private Button b_inverse;
	@FXML
	private Button b_oppose;

	@FXML
	private void initialize() {
		modele = new CalculatriceModele();
		
		t_saisie.textProperty().bindBidirectional(modele.courantDoubleProperty(),new NumberStringConverter());
		
		b_addition.setOnAction(evt -> modele.addition());
		b_carre.setOnAction(evt -> modele.carre());
		b_division.setOnAction(evt -> modele.division());
		b_egale.setOnAction(evt -> modele.egale());
		b_oppose.setOnAction(evt -> modele.oppose());
		b_soustraction.setOnAction(evt -> modele.soustraction());
		b_racine.setOnAction(evt -> modele.racine());
		b_pourcent.setOnAction(evt -> modele.pourcent());
		b_addition.setOnAction(evt -> modele.init());
		b_inverse.setOnAction(evt -> modele.inverse());
		b_multiplication.setOnAction(evt -> modele.multiplication());
		
		//Affichage des numéros
		b_un.setOnAction(evt -> displayNum(b_un.getText()));
		b_deux.setOnAction(evt -> displayNum(b_deux.getText()));
		b_trois.setOnAction(evt -> displayNum(b_trois.getText()));
		b_quatre.setOnAction(evt -> displayNum(b_quatre.getText()));
		b_cinq.setOnAction(evt -> displayNum(b_cinq.getText()));
		b_six.setOnAction(evt -> displayNum(b_six.getText()));
		b_sept.setOnAction(evt -> displayNum(b_sept.getText()));
		b_huit.setOnAction(evt -> displayNum(b_huit.getText()));
		b_neuf.setOnAction(evt -> displayNum(b_neuf.getText()));
		b_zero.setOnAction(evt -> displayNum(b_zero.getText()));
		
		//Set operators
		b_division.setOnAction(evt -> setOperator(b_division.getText()));
		b_multiplication.setOnAction(evt -> setOperator(b_multiplication.getText()));
		b_soustraction.setOnAction(evt -> setOperator(b_soustraction.getText()));
		b_addition.setOnAction(evt -> setOperator(b_addition.getText()));
		b_egale.setOnAction(evt -> setOperator(b_egale.getText()));
	}
	
	public void setOperator(String s) {
		switch (s) {
        case "*": modele.multiplication();
                 break;
        case "-": modele.soustraction();
                 break;
        case "+": modele.addition();
                 break;
        case "=": modele.egale();
                 break;
        case "/": modele.division();
                 break;
        default: s = "None";
                 break;
    }
	}
	
	public void displayNum(String c) {
		String s = t_saisie.getText();
		s = new StringBuilder(s).append(c).toString();
		t_saisie.setText(s);
	}
	
	public void eraseLastNum() {
		String s = t_saisie.getText().trim();
		s = new StringBuilder(s).deleteCharAt(s.length()-1).toString();
		t_saisie.setText(s);
	}
	
}
