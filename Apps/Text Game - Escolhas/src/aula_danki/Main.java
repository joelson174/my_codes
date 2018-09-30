package aula_danki;

public class Main {
	
	public static void main(String[] args) {
		/*int idade = 24;
		System.out.println("Minha idade é "+idade);
		idade = 1;
		System.out.println("Minha idade é "+idade);
		*/
		
		
		//Tipos de variáveis
		/*int numero = 24;
		String frase = "Olá mundo";
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
		System.out.println("Array 1: O nome é "+nome[0]+"; O outro nome é "+nome[1]);
		*/
		/*
		 * Array Multidimensional
		 */
		/*String[][] var2 = new String[5][5];
		var2[0][0] = "Felipe";
		System.out.println("Array 2: O nome é "+var2[0][0]);
		*/
		
		
		//Condições
		
		/*
		int vida = 99;
		if (vida <= 100) {
			vida += 100;
			System.out.println("Minha vida é menor que 100");
		} else {
			System.out.println("Minha vida não é igual a 100");
		}
		
		String nome = "Guilerme";
		if (nome == "Guilherme") {
			System.out.println("Nome = "+nome);
		} else {
			System.out.println("Nome não é Guilherme");
		}
		*/
		
		
		//Switch e case
		/*int vida = 0;
		switch(vida) {
		case 90:
			System.out.println("-10 vida máxima");
			break;
		case 0:
			System.out.println("Morreu");
			break;
		default:
			System.out.println("Nenhuma condição bateu, eu tenho 100 de vida!");
		}
		*/
		
		//Operações matemáticas
		/*int vida_1 = 100;
		int vida_2 = 200;
		int vida_3 = 300;
		int vida_final = vida_1 + vida_2 + vida_3;
		
		System.out.println(vida_final);
		
		int vida_final2 = ((vida_1 + vida_2) / 2) * 2;
		System.out.println(vida_final2);
		*/
		
		
		//Operadores da programação
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
			System.out.println("Olá! Agora o contador está em "+contador);
			contador++;
		}
		*/
		
		//For
		/*for (int i = 0; i <= 10; i++) {
			System.out.println("Olá! Agora o contador (variavel 'i') está em "+i);
		}
		*/
		
		//Do while
		/*int contador = 2;
		do {
			System.out.println("Olá! Agora o contador está em "+contador);
			contador++;
		}while(contador < 1);
		*/
	}
}
