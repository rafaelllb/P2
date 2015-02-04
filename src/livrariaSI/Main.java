package livrariaSI;

public class Main {
	
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Funcionario f = new Funcionario();
		
		StringBuffer n = new StringBuffer();
		n.append("Rafael");
		f.setNome(n);
		
		System.out.println(f.getNome()); 
	}
}
