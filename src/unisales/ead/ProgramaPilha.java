package unisales.ead;

public class ProgramaPilha {
	static String[] pilha = new String[10];
	static int ultimaPosicao = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LIFO - Last In First Out
		// Ultimo a entrar e o primeiro a sair

		empilhar2("geladeira");
		imprimirPilha();
		
		empilhar2("fogao");
		imprimirPilha();
		
		empilhar2("cooktop");
		imprimirPilha();
		empilhar2("forno");
		imprimirPilha();
		empilhar2("chuveiro");
		imprimirPilha();
		empilhar2("cuba");
		imprimirPilha();
		empilhar2("pia de louca");
		imprimirPilha();
		
		String item = removerDaPilha();
		System.out.println("item removido = " + item);
		
		imprimirPilha();
		
		removerDaPilha();
		imprimirPilha();
		
		removerDaPilha();
		imprimirPilha();
		
		empilhar2("cuba");
		imprimirPilha();
		
		empilhar2("cooktop");
		imprimirPilha();
		
		removerDaPilha();
		imprimirPilha();
		
		empilhar2("cuba");
		imprimirPilha();
		
		empilhar2("cooktop");
		imprimirPilha();
		
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
		removerDaPilha();
		imprimirPilha();
	}

	// Metodo
	// String : e o tipo do retorno do metodo (int, float, char, bool, ...)
	// removerDaPilha: nome do metodo
	// metodo sem parametros
	
	private static String removerDaPilha() {
		ultimaPosicao--; // ultimaPosicao = ultimaPosicao-1
		String item = pilha[ultimaPosicao];
		pilha[ultimaPosicao] = null;
		return item;
	}

	// Metodo
	// void : que dizer sem retorno
	// empilhar: nome do metodo
	// String item: parametro do metodo

	private static void empilhar1(String item, int pos) {
		pilha[pos] = item;
	}
	
	
	private static void empilhar2(String item) {
		pilha[ultimaPosicao] = item;
		ultimaPosicao++; // ultimaPosicao = ultimaPosicao + 1;
	}
	
	
	private static void imprimirPilha() {
		System.out.print("[");
		for (int i = 0; i < ultimaPosicao; i++) {
			System.out.print(pilha[i] + ", ");
		}
		System.out.print("] \n");
	}

}
