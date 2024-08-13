package view;

import controller.ParesController;

public class Principal {

	public static void main(String[] args) {
		ParesController pc = new ParesController();
		
		int[] vetor = {4, 7, 2, 3, 6, 8};
		int tamanho = vetor.length;
		
		System.out.println(pc.pares(vetor, tamanho));
	}
}
