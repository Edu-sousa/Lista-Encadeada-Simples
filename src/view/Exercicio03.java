package view;

import controller.Exercicio03Controller;

public class Exercicio03 {

	public static void main(String[] args) throws Exception {

		Exercicio03Controller cont = new Exercicio03Controller();
		int vetor[] = { 3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16 };

		cont.popularLista(vetor);
		cont.exibirLista();
		System.out.println("\n");
		cont.inverterLista();
		cont.exibirLista();
	}
}
