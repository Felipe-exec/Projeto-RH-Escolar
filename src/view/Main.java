package view;

import java.util.Scanner;

import model.*;

public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner leitor = new Scanner(System.in);
		int escolha;
		RH rh = new RH();
		Menu m = new Menu();
		
		do
		{
			System.out.println("1 - Cadastrar um novo funcion�rio");
			System.out.println("2 - Pesquisar por um funcion�rio e retornar todos os seus dados");
			System.out.println("3 - Listar todos os funcion�rio com todos os seus dados");
			System.out.println("4 - Sair");
			escolha = leitor.nextInt();
			
			switch (escolha)
			{
				case 1:
				{
					System.out.println("1 - Docente");
					System.out.println("2 - T�cnico");
					System.out.println("3 - Terceiro");
					
					int escolhaCadastro = leitor.nextInt();
					if (escolhaCadastro == 1)
					{
						rh.adicionaFuncionario(m.dadosDocente());
						System.out.println(rh.getFuncionarios());
					}
					
					else if (escolhaCadastro == 2)
					{
						rh.adicionaFuncionario(m.dadosTecnico());
					}
					
					else if (escolhaCadastro == 3)
					{
						rh.adicionaFuncionario(m.dadosTerceirizado());
					}
					break;
				}
				
				case 2:
				{
					System.out.println("Digite o funcion�rio que voc� deseja procurar:");
					String nome = leitor.next();
					System.out.println(rh.pesquisaFuncionario(nome));
					break;
				}
				
				case 3:
				{
					System.out.println();
					System.out.println(rh.getFuncionarios());
					break;
				}
			}
		} while(escolha != 4);
	}
}