package application;

/*Você foi solicitado a construir um programa de criptografia simples. 
 * Este programa deve ser capaz de enviar mensagens codificadas sem que alguém possa lê-las. 
 * O processo é muito simples. Está dividido em duas partes.

Primeiro, cada letra maiúscula ou minúscula deve ser deslocada três posições para a direita, 
de acordo com a tabela ASCII: a letra 'a' deve se tornar a letra 'd', a letra 'y' deve se tornar o caractere '|' 
e assim por diante. Em segundo lugar, cada linha deve ser invertida. Após serem revertidos, todos os caracteres da metade 
em diante (truncados) devem ser movidos uma posição para a esquerda em ASCII. Neste caso, 'b' torna-se 'a' e 'a' torna-se '`'.

Por exemplo, se a palavra resultante da primeira parte for "tesla", as letras "sla" devem ser movidas uma posição para a esquerda. 
No entanto, se a palavra resultante da primeira parte for "t # $ A", as letras "$ A" devem ser substituídas.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1 * 10⁴), 
indicando o número de linhas que o problema deve criptografar. As seguintes N linhas contêm M caracteres cada M (1 ≤ M ≤ 1 * 10³).
 
4
Texto #3
abcABC1
vxpdylY .ph
vv.xwfxo.fd

Saída
Para cada entrada, você deve apresentar a mensagem criptografada.
3# rvzgV
1FECedc
ks. \n{frzx
gi.r{hyz-xx

*/


import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Instanciando o leitor e lendo o n�mero de caso de testes
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();

		// Percorendo os 'N' Casos de teste
		for (int i = 0; i < N; i++) {

			// Instanciando o StringBuilder para trabalhar mais facilmente a String
			StringBuilder M = new StringBuilder(readLine(leitor));

			// Passada 1
			for (int j = 0; j < M.length(); j++) {
				int code = M.charAt(j);
				if ((code >= 65 && code <= 90) || (code >= 97 && code <= 122)) {
					char c = (char) (code + 3);
					M.setCharAt(j, c);
				}
			}

			// Passada 2
			M.reverse();

			// Passada 3
			for (int j = M.length() / 2; j < M.length(); j++) {
				char c = (char) (M.charAt(j) - 1);
				M.setCharAt(j, c);
			}

			// Print
			System.out.println(M.toString());
		}
	}

	/*
	 * Método para ler a String sem bugs de espaçamentos
	 */
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
}
