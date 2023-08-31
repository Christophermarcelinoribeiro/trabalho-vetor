/* Programa com Vetor
Programa com VetorPrograma com Vetor
A primeira tarefa para esta disciplina tem o objetivo de realizar revisão das técnicas de programação com vetores.

Este programa poderá ser desenvolvido sem orientação  a objetos ( que todos verão ou já terão visto somente na disciplina Programação 2 ).

O programa deverá criar e manipular um vetor de inteiros com o tamanho pré-determinado de 20 elementos.
Um aspecto importante, que facilitará a implementação, é que os dados a serem armazenados são somente "inteiros positivos" - o que permite atribuir ZERO aos elementos vazios (tanto no momento da criação do vetor, quanto numa ação de apagar o valor de um determinado elemento).

O programa deverá possuir um menu de alternativas para que o usuário escolha o que deve ser realizado, conforme sugestão abaixo:

1) criar o vetor vazio ou "zerar o vetor"
2) inserir um valor no vetor - utilizando uma estratégia para que o próximo elemento vazio receba este novo valor
3) apagar um valor do vetor - indicando o valor e procurar qual o elemento que deverá ser "zerado"
4) consultar se existe determinado valor no vetor - para saber qual o elemento que contém esse valor
5) consultar quantos valores significativos já ocupam o vetor
6) consultar qual o maior valor armazenado no vetor e indicar qual o elemento que contém esse valor
7) consultar qual o menor valor armazenado no vetor e indicar qual o elemento que contém esse valor
8) apresentar uma listagem dos valores armazenados no vetor
0) sair do programa

A entrega desta tarefa deverá ser no formato de um único arquivo com o nome <NOMEDOESTUDANTE_ExeVetor.java>, compactado em formato ZIP.

Muita atenção ao prazo para entrega : até o início da próxima aula! 

Haverá possibilidade de entrega em atraso, até o início da aula da semana seguinte - considerando decremento de 10% da nota a cada dia do atraso.

Os alunos que sentirem necessidade de acompanhamento e/ou explicações do professor devem solicitar atendimento individual por email



  */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 4;
		Vetor vet[] = new Vetor[n];
		int teste = 0;

		System.out.println("Opção 0: sair do sistema                                     ||");
		System.out.println("Opção 1: criar o vetor vazio ou zerar o vetor                ||");
		System.out.println("Opção 2: inserir um valor                                    ||");
		System.out.println("Opção 3: apagar um valor                                     || ");
		System.out.println("Opção 4: consultar se existe determinado valor               ||");
		System.out.println("Opção 5: consultar quantos valores já ocupam                 ||");
		System.out.println("Opção 6: consultar qual o maior valor armazenado             ||");
		System.out.println("Opção 7: consultar qual o menor valor armazenado             ||");
		System.out.println("Opção 8: listagem dos valores armazenados                    ||");
		System.out.println("==============================================================");
		System.out.print("Escolha uma opção:");
		int option = sc.nextInt();

		while (option > 8 || option < 0) {
			System.out.println("Escolha entre 0 e 8 por favor");
			System.out.print("Escolha uma Opção:");
			option = sc.nextInt();

		}

		while (option < 9 || option < -1) {

			switch (option) {
			case 0:
				return;

			case 1:
				System.out.println(" ");
				for (int i = 0; i < vet.length; i++) {
					teste++;
					int numero = 0;
					vet[i] = new Vetor(numero);
				}
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getNumbers() == 0) {
						System.out.println("Posição " + i + ": VAZIO ");
					} else {
						System.out.println("Posição " + i + ": " + vet[i].getNumbers());
					}

				}

				break;
			case 2:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor");
					break;
				}
				System.out.println(" ");
				System.out.println("=================================================");
				System.out.println("Aperte zero caso não queira inserir mais valores");
				System.out.println("==================================================");
				System.out.println("Insira um novo valor: ");
				
				for (int i = 0; i < vet.length; i++) {
					while (vet[i].getNumbers() != 0  ) {
						if (i == n - 1) {
							break;
						}// significa que o vetor já ta ocupado por outro numero
						i++;
						

					}
					if (vet[i].getNumbers() != 0 && i == n - 1) {
						System.out.println(" Ops! Como você pode ver abaixo, infelizmente todos os espaços já estão populados");
						break;
					}
					
					int number = sc.nextInt();

					if (number == 0) {
						break;
					}

					vet[i] = new Vetor(number);
				}
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getNumbers() == 0) {
						System.out.println("Posição " + i + ": VAZIO ");
					} else {
						System.out.println("Posição " + i + ": " + vet[i].getNumbers());

					}
					
				}
				break;
			case 3:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor");
					break;
				}
				System.out.println(" ");
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getNumbers() == 0) {
						System.out.println("Posição " + i + ": VAZIO ");
					} else {
						System.out.println("Posição " + i + ": " + vet[i].getNumbers());
					}

				}
				System.out.println(" ");
				System.out.println("Escolha a Posição que você quer excluir:");
				int escolha = sc.nextInt();
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getNumbers() == 0 && escolha == i) {
						System.out.println("Não há valor nessa Posição!");
						break;

					}
					vet[i].getNumbers();

					if (escolha == i) {
						escolha = 0;
						vet[i] = new Vetor(escolha);
					}
					if (vet[i].getNumbers() == 0) {
						System.out.println("Posição " + i + ": VAZIO ");
					} else {
						System.out.println("Posição " + i + ": " + vet[i].getNumbers());
					}

				}
				break;
			case 4:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("você ainda não criou um vetor");
					break;
				}
				System.out.println(" ");
				System.out.println("Insira o valor que você quer consultar para ver se existe:");
				int escolha1 = sc.nextInt();
				for (int i = 0; i < vet.length; i++) {
					vet[i].getNumbers();
					if (escolha1 == 0) {
						System.out.println("Posiõees com ZERO são campos VAZIOS");
						break;
					}
					if (vet[i].getNumbers() == escolha1) {
						System.out.println("Posição " + i + ": " + vet[i].getNumbers());

					} else {
						while (i != n - 1 && vet[i].getNumbers() != escolha1) {
							i++;
							if (i == n - 1 && vet[i].getNumbers() != escolha1) {
								System.out.println("Não há esse valor no vetor!");
							}else {
								if (vet[i].getNumbers() == escolha1) {
									System.out.println("Posição " + i + ": " + vet[i].getNumbers());
								}
							}
							
						}
						
					}
				}
				break;
			case 5:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor:");
					break;
				}
				System.out.println(" ");
				System.out.print("Quantidade de valores que ocupam o vetor: ");
				int acumula = 0;
				for (int i = 0; i < vet.length; i++) {
					vet[i].getNumbers();
					if (vet[i].getNumbers() != 0) {
						acumula++;
					}

				}
				System.out.println(acumula);
				break;
			case 6:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor");
					break;
				}
				System.out.println(" ");
				System.out.print("Maior valor armazenado: ");
				int maior = 0;
				for (int i = 0; i < vet.length; i++) {
					vet[i].getNumbers();
					if (vet[i].getNumbers() > maior) {
						maior = vet[i].getNumbers();
					}
				}
				System.out.println(maior);
				break;

			case 7:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor");
					break;
				}
				System.out.println(" ");
				System.out.print("Menor valor armazenado: ");
				int menor = vet[0].getNumbers() + 1;
				for (int i = 0; i < vet.length; i++) {
					vet[i].getNumbers();
					if (vet[i].getNumbers() < menor) {
						menor = vet[i].getNumbers();
					}
				}
				System.out.println(menor);
				break;
			case 8:
				if (teste == 0) {
					System.out.println(" ");
					System.out.println("Você ainda não criou um vetor");
					break;
				}
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getNumbers() == 0) {
						System.out.println("Posisão " + i + ": VAZIO ");
					} else {
						System.out.println("Posisão " + i + ": " + vet[i].getNumbers());
					}

				}
				break;
			default:
				System.out.println("Escolha entre 0 e 8 por favor");

			}
			char escolha;
			System.out.println("   ");
			System.out.print("Quer escolher outra opção: [s/n]");
			escolha = sc.next().charAt(0);
			if (escolha == 's') {
				System.out.println(" ");
				System.out.println("Opção 0: sair do sistema                                     ||");
				System.out.println("Opção 1: criar o vetor vazio ou zerar o vetor                ||");
				System.out.println("Opção 2: inserir um valor                                    ||");
				System.out.println("Opção 3: apagar um valor                                     || ");
				System.out.println("Opção 4: consultar se existe determinado valor               ||");
				System.out.println("Opção 5: consultar quantos valores já ocupam                 ||");
				System.out.println("Opção 6: consultar qual o maior valor armazenado             ||");
				System.out.println("Opção 7: consultar qual o menor valor armazenado             ||");
				System.out.println("Opção 8: listagem dos valores armazenados                    ||");
				System.out.println("==============================================================");
				System.out.print("Escolha outra opção: ");
				option = sc.nextInt();
			} else {
				return;
			}
		}

	}

}
