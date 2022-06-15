package model;

public class Terceirizado extends Funcionario
{
	private String dataFim;
	private String funcao;
	
	public Terceirizado(int cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salarioBase, String dataFim, String funcao)
	{
		super(cpf, nome, endereco, datadeEmissao, titulacao, salarioBase);
		this.dataFim = dataFim;
		this.funcao = funcao;
	}
	
	@Override
	public double calculaSalario()
	{
		double salarioBase = this.getSalarioBase();
		
		if (this.funcao.equalsIgnoreCase("professor")) 
		{
			if(this.getTitulacao().equalsIgnoreCase("Mestre"))
			{
				salarioBase = salarioBase + 500;
			}
			else if(this.getTitulacao().equalsIgnoreCase("Doutor"))
			{
				salarioBase = salarioBase + 1000;
			}
		}
		
		this.setSalarioBase(salarioBase);
		return salarioBase;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\ndata de fim de contrato: " + this.dataFim + "\nfunçao: " + this.funcao;
	}
}
