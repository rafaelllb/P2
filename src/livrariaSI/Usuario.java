package livrariaSI;

abstract class Usuario {
	
	private int cpf;
	private StringBuffer nome;
	private int tipo;
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public StringBuffer getNome() {
		return nome;
	}
	public void setNome(StringBuffer nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


}
