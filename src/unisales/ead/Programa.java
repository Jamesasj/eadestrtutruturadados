package unisales.ead;

public class Programa {

	public static void main(String[] args) {

		// variaveis
		/// a^2 = b^2 + c^2

		int a2 = 0; // hipotenusa ao quadrado
		int b = 3; // cateto1
		int c = 5; // cateto2

		a2 = b * b + c * c;
		System.out.println(a2);

		// determinar se a palavra esta na variavel

		String variavel = "James";
		int numero = 10;
		// > < == !=
		// || - ou/or
		// && - e/and

		if (variavel == "James" || numero == 10) {
			// codicao e verdade ou true
			System.out.println("James Esta Aqui ou numero igual a 10");
		} else {
			// codicao e falsa ou false
			System.out.println("nenuma codicao atendida");
		}
		System.out.println("Operador E: ");
		System.out.println(variavel == "James" && numero == 10);

		System.out.println("Incrementar");

		// estrutura de repeticao
		// while(){}
		// do{} while()
		for (int indice = 0; indice <= 10; indice++) {
			System.out.println("Meu indice e:" + indice);
		}

		System.out.println("Decrementar");
		// estrutura de repeticao
		for (int indice = 10; indice > 0; indice--) {
			System.out.println("Meu indice e:" + indice);
		}

		System.out.println("Vetores...");
		// Estruturas de array, vetores.
		// [1,2,3,4,5,...,n]

		int[] vetor = { 1, 2, 3, 4, 10 };

		/// tenho que falar o endereco a ser acessado
		// os enderecos comecam de 0 e terminam na posicacao "tamanho do vetor"-1
		// Exemplo de acesso ao end = vetor[2];

		System.out.println("Lendo o vetor");
		// System.out.println(vetor[4]);
		for (int idx = 0; idx < 5; idx++) {
			System.out.println(vetor[idx]);
		}

		// somador somar todos os numeros do vetor
		int[] vetor2 = { 1, 2, 3, 4, 5, 50 };
		System.out.println("tamanho do vetor = " + vetor2.length);
		int resultado = 0;

		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("resultado= " + resultado + " | vetor[i] =" + vetor2[i] + " | i =" + i);
			resultado = vetor2[i] + resultado;
		}
		System.out.println("resultado= " + resultado);

		/// metodos e funcoes
		int[] vetor3 = { 1, 2, 3, 4, 5, 50,100 ,7};
		int resultadox = somaVetor(vetor3);
		
		System.out.println(resultadox); // 165
	}

	public static int somaVetor(int[] vetor) {
		int resultado = 0;
		for (int i = 0; i < vetor.length; i++) {
			resultado = vetor[i] + resultado;
		}
		
		return resultado;
	}

}
