package model;

import java.util.ArrayList;

public class RH
{
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	public void adicionaFuncionario(Funcionario f)
	{
		funcionarios.add(f);
	}
	
	public Funcionario pesquisaFuncionario(String nome)
	{
		for (Funcionario f : funcionarios)
		{
			if (f.getNome().equalsIgnoreCase(nome))
			{
				return f;
			}
		}
		return null;
	}
	
	public ArrayList<Funcionario> getFuncionarios()
	{
		return funcionarios;
	}
}