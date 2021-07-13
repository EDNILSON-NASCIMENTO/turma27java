package entities;

public abstract class Produto {
	
	private String codigo;
	private String nome;
	private double valorUnitario;
	private int estoque;
	
	public Produto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getEstoque() {
		return estoque;
	}
	/*
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	*/
	
	public void colocarEstoque(int valorIncluir) {
				
		estoque += valorIncluir;
		
	}
	
	public void tirarEstoque( int valorTirar) {
		
		estoque -= valorTirar;
		
	}
	
	
	
	
	
	
}
