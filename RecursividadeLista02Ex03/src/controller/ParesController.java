package controller;

public class ParesController {
	public ParesController() {
		super();
	}
	
	public int pares(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		}else {
			if(vetor[tamanho-1] % 2 == 0){
				return 1 + pares(vetor, tamanho-1);
			}
			return 0 + pares(vetor, tamanho-1);
		}
	}
}
