package aula_danki;

public class Main {
	
	public static void main(String[] args) {
		/*int idade = 24;
		System.out.println("Minha idade � "+idade);
		idade = 1;
		System.out.println("Minha idade � "+idade);
		*/
		
		
		//Tipos de vari�veis
		/*int numero = 24;
		String frase = "Ol� mundo";
		boolean var = true; //Pode ser 'false'
		char var2 = 'a';
		double var3 = 23.9;
		
		System.out.println(numero);
		System.out.println(frase);
		System.out.println(var);
		System.out.println(var2);
		System.out.println(var3);
		*/
		
		
		//Constantes
		/*final int vida_maxima = 10;
		
		System.out.println(vida_maxima);*/
		
		
		/*
		 * Array Normal
		 */
		/*
		String[] nome = new String[5];
		nome[0] = "Guilherme";
		nome[1] = "Joao";
		System.out.println("Array 1: O nome � "+nome[0]+"; O outro nome � "+nome[1]);
		*/
		/*
		 * Array Multidimensional
		 */
		/*String[][] var2 = new String[5][5];
		var2[0][0] = "Felipe";
		System.out.println("Array 2: O nome � "+var2[0][0]);
		*/
		
		
		//Condi��es
		
		/*
		int vida = 99;
		if (vida <= 100) {
			vida += 100;
			System.out.println("Minha vida � menor que 100");
		} else {
			System.out.println("Minha vida n�o � igual a 100");
		}
		
		String nome = "Guilerme";
		if (nome == "Guilherme") {
			System.out.println("Nome = "+nome);
		} else {
			System.out.println("Nome n�o � Guilherme");
		}
		*/
		
		
		//Switch e case
		/*int vida = 0;
		switch(vida) {
		case 90:
			System.out.println("-10 vida m�xima");
			break;
		case 0:
			System.out.println("Morreu");
			break;
		default:
			System.out.println("Nenhuma condi��o bateu, eu tenho 100 de vida!");
		}
		*/
		
		//Opera��es matem�ticas
		/*int vida_1 = 100;
		int vida_2 = 200;
		int vida_3 = 300;
		int vida_final = vida_1 + vida_2 + vida_3;
		
		System.out.println(vida_final);
		
		int vida_final2 = ((vida_1 + vida_2) / 2) * 2;
		System.out.println(vida_final2);
		*/
		
		
		//Operadores da programa��o
		// && E
		/*String nome_jogador = "Guilherme";
		int skill = 100;
		
		if (nome_jogador == "Guilherme" && skill == 100) {
			System.out.println("Tudo certo!");
		} else {
			System.out.println("Entramos no else");
		}
		*/
		
		// || Ou
		/*
		if ((nome_jogador == "Guilherme" || nome_jogador == "Joao") && 
				skill >= 100) {
			System.out.println("Tudo certo com o Ou e E");
		} else {
			System.out.println("Entramos no Else");
		}
		*/
		
		//Loops
		//While
		
		/*int contador = 0;
		while (contador <= 10) {
			System.out.println("Ol�! Agora o contador est� em "+contador);
			contador++;
		}
		*/
		
		//For
		/*for (int i = 0; i <= 10; i++) {
			System.out.println("Ol�! Agora o contador (variavel 'i') est� em "+i);
		}
		*/
		
		//Do while
		/*int contador = 2;
		do {
			System.out.println("Ol�! Agora o contador est� em "+contador);
			contador++;
		}while(contador < 1);
		*/
	}
}
