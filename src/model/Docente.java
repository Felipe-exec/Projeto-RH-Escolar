package model;

public class Docente extends Funcionario
{
	private int siape;
	private String area;
	
	public Docente(int cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salarioBase, int siape, String area)
	{
		super(cpf, nome, endereco, datadeEmissao, titulacao, salarioBase);
		this.siape = siape;
		this.area = area;
	}
	
	@Override
	public double calculaSalario()
	{
		double salarioBase = this.getSalarioBase();
		
		if(this.getTitulacao().equalsIgnoreCase("Mestre"))
		{
			salarioBase = salarioBase + 0.2*salarioBase;
		}
		else if(this.getTitulacao().equalsIgnoreCase("Doutor"))
		{
			salarioBase = salarioBase + 0.4*salarioBase;
		}
		
		this.setSalarioBase(salarioBase);
		return salarioBase;
	}
	
	@Override
	public String toString() 
	{
		return "\ncpf: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão:" + this.getDatadeEmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\nsiape: " + this.siape + "\narea: " + this.area;
	}
}
