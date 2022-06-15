package model;

public class Tecnico extends Funcionario
{
	private int siape;
	private String departamento;
	
	public Tecnico(int cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salarioBase, int siape, String departamento)
	{
		super(cpf, nome, endereco, datadeEmissao, titulacao, salarioBase);
		this.siape = siape;
		this.departamento = departamento;
	}
	
	@Override
	public double calculaSalario()
	{
		double salarioBase = this.getSalarioBase();
		
		if(this.getTitulacao().equalsIgnoreCase("Mestre"))
		{
			salarioBase = salarioBase + 0.15*salarioBase;
		}
		else if(this.getTitulacao().equalsIgnoreCase("Doutor"))
		{
			salarioBase = salarioBase + 0.3*salarioBase;
		}
		
		this.setSalarioBase(salarioBase);
		return salarioBase;
	}
	
	@Override
	public String toString() 
	{
		return super.toString() + "\nsiape: " + this.siape + "\ndepartamento: " + this.departamento;
	}
}
