package com.tg.controleur;

import com.tg.modele.CalculatriceModele;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import javafx.scene.control.MenuItem;

public class CalculatriceControleur {
	private CalculatriceModele modele;
	
	//Menu
		@FXML
		private MenuItem m_sortie;
		@FXML
		private MenuItem m_standard;
		@FXML
		private MenuItem m_scientifique;
		@FXML
		private MenuItem m_apropos;
		@FXML
		private MenuItem m_aidecalculatrice;
		
	//Operateurs
		@FXML
		private Button b_addition;
		@FXML
		private Button b_soustraction;
		@FXML
		private Button b_multiplication;
		@FXML
		private Button b_division;
		@FXML
		private Button b_egale;
		
	//Operateurs avances
		@FXML
		private Button b_inverse;
		@FXML
		private Button b_carre;
		@FXML
		private Button b_racine;
		@FXML
		private Button b_pourcent;
		@FXML
		private Button b_oppose;
		
	//Num
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
		
	//Autres
		@FXML
		private TextField t_saisie;
		@FXML
		private Button b_virgule;
		@FXML
		private Button b_back;
		@FXML
		private Button b_clearentry;
		@FXML
		private Button b_clear;
		
	//Methodes
		@FXML 
		private void initialize(){
			modele = new CalculatriceModele();
			
			t_saisie.textProperty().bindBidirectional(modele.courantDoubleProperty(),
					new NumberStringConverter());
			
			clear();
			
			//Operateurs
				b_addition.setOnAction(evt -> modele.addition(t_saisie));
				b_soustraction.setOnAction(evt -> modele.soustraction(t_saisie));
				b_multiplication.setOnAction(evt -> modele.multiplication(t_saisie));
				b_division.setOnAction(evt -> modele.division(t_saisie));
				b_egale.setOnAction(evt -> modele.egale());
			//Operateurs avances
				b_racine.setOnAction(evt -> modele.racine());
				b_carre.setOnAction(evt -> modele.carre());
				b_inverse.setOnAction(evt -> modele.inverse());
				b_oppose.setOnAction(evt -> modele.oppose());
				b_pourcent.setOnAction(evt -> modele.pourcent());
			//autres
				b_back.setOnAction(evt -> tsaisieRetirerDernierCaractere());
				b_clearentry.setOnAction(evt -> clear());
				b_clear.setOnAction(evt -> modele.init(t_saisie));
				
			//Num
				b_zero.setOnAction(evt -> tsaisieAjouterCaractere(b_zero.getText()));
				b_un.setOnAction(evt -> tsaisieAjouterCaractere(b_un.getText()));
				b_deux.setOnAction(evt -> tsaisieAjouterCaractere(b_deux.getText()));
				b_trois.setOnAction(evt -> tsaisieAjouterCaractere(b_trois.getText()));
				b_quatre.setOnAction(evt -> tsaisieAjouterCaractere(b_quatre.getText()));
				b_cinq.setOnAction(evt -> tsaisieAjouterCaractere(b_cinq.getText()));
				b_six.setOnAction(evt -> tsaisieAjouterCaractere(b_six.getText()));
				b_sept.setOnAction(evt -> tsaisieAjouterCaractere(b_sept.getText()));
				b_huit.setOnAction(evt -> tsaisieAjouterCaractere(b_huit.getText()));
				b_neuf.setOnAction(evt -> tsaisieAjouterCaractere(b_neuf.getText()));
				
				b_virgule.setOnAction(evt -> tsaisieAjouterCaractere("."));
		}
		
		private void tsaisieAjouterCaractere(String c){
			String s = t_saisie.getText();
			s = new StringBuilder(s).append(c).toString();
			t_saisie.setText(s);
		}
		private void tsaisieRetirerDernierCaractere(){
			String s = t_saisie.getText().trim();
			s = new
			StringBuilder(s).deleteCharAt(s.length()-1).toString();
			t_saisie.setText(s);
		}
		private void clear(){
			t_saisie.clear();
		}

}
