package controller;

import fateczl.listaEncadeada.model.ListaEncadeada;
import fateczl.pilha.model.Pilha;

public class Exercicio03Controller {

	ListaEncadeada lista = new ListaEncadeada();
	Pilha pilha = new Pilha();

	public void popularLista(int[] vetor) throws Exception {
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				lista.addFirst(vetor[i]);
			} else if (i == vetor.length) {
				lista.addLast(vetor[i]);
			} else {
				lista.add(vetor[i], i);
			}
			pilha.push(vetor[i]); // pilha para auxiliar a inversão de elementos
		}
	}

	public void inverterLista() throws Exception {
		for (int i = 0; i < lista.size(); i++) {

			if (i == 0) {
				lista.removeFirst();
				lista.addFirst(pilha.pop()); // adiciona o primeiro valor da pilha no primeiro lugar da lista
			} else if (i == lista.size()) {
				lista.removeLast();
				lista.addLast(pilha.pop()); // adiciona o ultimo valor da pilha no ultimo lugar da lista
			} else {
				lista.remove(i);
				lista.add(pilha.pop(), i);
			}
		}
	}

	public void exibirLista() throws Exception {
		// Exibir Lista Invertida
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
