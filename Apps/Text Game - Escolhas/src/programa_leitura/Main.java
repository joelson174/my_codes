package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.println("Seja bem-vindo ao jogo! Insira seu nome: ");
		nome = in.nextLine();
		System.out.println("Seja muito bem-vindo(a), "+nome);
		System.out.println("Para jogar, utilize as letras como comandos quando aparecerem");
		System.out.println("~~ Todas as escolhas principais tem 50% de chance de um final ou outro ~~");
		System.out.println("Para onde você quer ir? (W,S,A,D)\n");
		String comando = in.nextLine();
		if (comando.equals("w")||comando.equals("W")) {
			System.out.println(nome+" entrou na masmorra...");
			System.out.println("Um inimigo apareceu. O que deseja fazer? (A = Atacar, C = Correr)\n");
			comando = in.nextLine();
			if (comando.equals("a")||comando.equals("A")) {
				if (rand.nextInt(100) < 50) {
					System.out.println(nome+" derrotou o inimigo e ganhou o jogo!");
				} else {
					System.out.println(nome+" morreu e perdeu o jogo!");
				}
			} else {
				if (rand.nextInt(100) < 50) {
					System.out.println(nome+" conseguiu se salvar! Fim de jogo!");
				} else {
					System.out.println(nome+" tentou correr, tropeçou e caiu numa armadilha! Morreu!");
				}
			}
		} else if (comando.equals("s")||comando.equals("S")) {
			System.out.println(nome+" está caminhando por uma ponte...");
			System.out.println("Um estranho fala com você. Parece suspeito! (O = Ouvi-lo, C = Correr)\n");
			comando = in.nextLine();
			if (comando.equals("o")||comando.equals("O")) {
				if (rand.nextInt(100) < 50) {
					System.out.println("O estranho tentou roubar você, mas você conseguiu fugir! Fim de jogo!");
				} else {
					System.out.println("O estranho roubou todo o seu dinheiro! Perdeu o jogo, "+nome);
				}
			} else {
				if (rand.nextInt(100) < 50) {
					System.out.println(nome+" tentou correr e conseguiu! Fim de jogo!");
				} else {
					System.out.println(nome+" tentou correr e caiu da ponte! "+nome+" morreu!");
				}
			}
		} else if (comando.equals("a")||comando.equals("A")) {
			System.out.println(nome+" entrou na cidade...");
			System.out.println("Os guardas questionam sua identidade. O que fazer? (P = Persuadir, F = Falar a verdade)\n");
			comando = in.nextLine();
			if (comando.equals("p")||comando.equals("P")) {
				if (rand.nextInt(100) < 50) {
					System.out.println("A persuação funcionou! Os guardas reconhecem "+nome+" e o deixam entrar! Fim de jogo!");
				} else {
				System.out.println("Os guardas condenam "+nome+" a prisão por tentar persuadi-los! Fim de jogo");
				} 
			} else {
				if (rand.nextInt(100) < 50) {
					System.out.println("Os guardas admiram sua honestidade e deixam você entrar! Fim de jogo!");
				} else {
					System.out.println("Os guardas eram corruptos e prenderam "+nome+"! Fim de jogo!");
				}
			}
		} else if (comando.equals("d")||comando.equals("D")) {
			System.out.println(nome+" está andando pela floresta");
			System.out.println(nome+" achou um animal ferido, o que fazer? (A = Ajudá-lo, B = Ir embora)\n");
			comando = in.nextLine();
			if (comando.equals("a")||comando.equals("A")) {
				if (rand.nextInt(100) < 50) {
					System.out.println(nome+" ajudou o animal e seguiu sua jornada! Fim de jogo!");
				} else {
					System.out.println("Ladrões aproveitaram a oportunidade para saquear seus pertences! Perdeu o jogo");
				}
			} else {
				if(rand.nextInt(100) < 50) {
					System.out.println(nome+" vai embora e deixa o animal para tras... Fim de jogo!");
				} else {
					System.out.println("Karma negativo atinge "+nome+" por deixar o animal para tras. Foi sequestrado! Perdeu o jogo!");
				}
			}
		}
	}
}
