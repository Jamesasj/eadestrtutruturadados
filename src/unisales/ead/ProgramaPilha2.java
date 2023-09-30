package unisales.ead;

import unisales.ead.ed.PilhaEAD;

public class ProgramaPilha2 {


	public static void main(String[] args) {
		PilhaEAD pilha = new PilhaEAD();
		pilha.empilhar2("geladeira");
		pilha.imprimirPilha();
		pilha.empilhar2("fogao");
		pilha.imprimirPilha();
		pilha.empilhar2("cooktop");
		pilha.imprimirPilha();
		String item = pilha.removerDaPilha();
		System.out.println("item removido = " + item);
		pilha.imprimirPilha();
	}

}
