package unisales.ead.ed;

public class PilhaEAD {
	static String[] pilha = new String[10];
	static int ultimaPosicao = 0;

	public String removerDaPilha() {
		ultimaPosicao--; // ultimaPosicao = ultimaPosicao-1
		String item = pilha[ultimaPosicao];
		pilha[ultimaPosicao] = null;
		return item;
	}

	public void empilhar2(String item) {
		pilha[ultimaPosicao] = item;
		ultimaPosicao++; // ultimaPosicao = ultimaPosicao + 1;
	}

	public void imprimirPilha() {
		System.out.print("[");
		for (int i = 0; i < ultimaPosicao; i++) {
			System.out.print(pilha[i] + ", ");
		}
		System.out.print("] \n");
	}

}
