package model;

public abstract class Funcionario 
{
	private int cpf;
	private String nome;
	private String endereco;
	private String datadeEmissao;
	private String titulacao;
	private double salarioBase;
	
	public Funcionario(int cpf, String nome, String endereco, String datadeEmissao, String titulacao, double salarioBase)
	{
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.datadeEmissao = datadeEmissao;
		this.titulacao = titulacao;
		this.salarioBase = salarioBase;
	}
	
	public double calculaSalario()
	{
		return salarioBase;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDatadeEmissao() {
		return datadeEmissao;
	}

	public void setDatadeEmissao(String datadeEmissao) {
		this.datadeEmissao = datadeEmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String toString() 
	{
		return "\ncpf: " + this.cpf + "\n nome: " + this.nome + "\nendereço: " + this.endereco + "\ndata de emissão:" + this.datadeEmissao + "\ntitulação: " + this.titulacao + "\nsalario base: " + this.salarioBase;
	}
	
}
