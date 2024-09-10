package controller;

import model.*;

public class PilhaFatController {

	public PilhaFatController() {
		super();
	}
	
	public long calcFatorial(int num) {
		Pilha p = new Pilha();
		long fat = 1;
		while (num > 0) {
			p.push(num);
			num--;
		}
		while (!p.isEmpty()) {
			try {
				fat = fat * p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return fat;
	}

}
