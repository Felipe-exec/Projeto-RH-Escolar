package view;

import java.util.Scanner;

import model.*;

public class Menu
{
	private int cpf;
	private String nome;
	private String endereco;
	private String datadeEmissao;
	private String titulacao;
	private double salarioBase;
	private int siape;
	private String area;
	private Scanner leitor;
	private RH rh;
	private String departamento;
	private String dataFim;
	private String funcao;
	
	
	public Menu()
	{
		leitor = new Scanner(System.in);
		rh = new RH();
	}
	
	private void informacoesFuncionario()
	{
		System.out.println("Qual o CPF? ");
		this.cpf = leitor.nextInt();
		System.out.println("Qual o nome? ");
		this.nome = leitor.next();
		System.out.println("Endereço: ");
		this.endereco = leitor.next();
		System.out.println("Qual a data de emissão? ");
		this.datadeEmissao = leitor.next();
		System.out.println("Qual é a titulação? ");
		this.titulacao = leitor.next();
		System.out.println("Quanto é o salario base? ");
		this.salarioBase = leitor.nextDouble();
		
		/*
		Docente d = new Docente(cpf, nome, endereco, datadeEmissao, titulacao, salarioBase, siape, area);
		d.calculaSalario();
		rh.adicionaFuncionario(d);
		*/
	}
	
	public Docente dadosDocente()
	{
		informacoesFuncionario();
		System.out.println("Siape:");
		this.siape = leitor.nextInt();
		System.out.println("De qual área é? ");
		this.area = leitor.next();
		
		Docente d = new Docente(this.cpf, this.nome, this.endereco, this.datadeEmissao, this.titulacao, this.salarioBase, this.siape, this.area);
		
		d.calculaSalario();
		return d;
	}
	
	public Tecnico dadosTecnico()
	{
		informacoesFuncionario();
		System.out.println("Siape:");
		this.siape = leitor.nextInt();
		System.out.println("Departamento:");
		this.departamento = leitor.next();
		
		Tecnico t = new Tecnico(this.cpf, this.nome, this.endereco, this.datadeEmissao, this.titulacao, this.salarioBase, this.siape, this.departamento);
		
		t.calculaSalario();
		return t;
	}
	
	public Terceirizado dadosTerceirizado()
	{
		informacoesFuncionario();
		System.out.println("data de fim de contrato:");
		this.dataFim = leitor.next();
		System.out.println("função:");
		this.funcao = leitor.next();
		
		Terceirizado tz = new Terceirizado(this.cpf, this.nome, this.endereco, this.datadeEmissao, this.titulacao, this.salarioBase, this.dataFim, this.funcao);
		
		tz.calculaSalario();
		return tz;
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

	public int getSiape() {
		return siape;
	}

	public void setSiape(int siape) {
		this.siape = siape;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
