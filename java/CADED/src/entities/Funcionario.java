package entities;

public class Funcionario {
	//atributos - é - tem - estar
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	
	//construtor - como a classe sera usada no programa principal
	public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	//sobrecarga de construtor
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}

	//encapsulamento - getters and setters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	//metodos
	
	public double salario() {
		
		return (this.horasTrabalhadas * this.valorHora);
	}
	
	
	
	
	
	
	
	
	
	

}
