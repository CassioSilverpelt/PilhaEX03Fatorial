package view;

import javax.swing.JOptionPane;

import controller.PilhaFatController;

public class PilhaFatPrincipal {

	public static void main(String[] args) {
		PilhaFatController pFatCon = new PilhaFatController();
		
		int val = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 0 e 10"));
		
		while (val < 0 || val > 10) {
			val = Integer.parseInt(JOptionPane.showInputDialog("Erro! Insira um número entre 0 e 10"));
		}
		
		System.out.println("O fatorial de " + val + " é: " + pFatCon.calcFatorial(val));
	}
}
