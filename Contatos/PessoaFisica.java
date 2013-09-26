package Contatos;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	private String empresa;
	private String cargo;
	private String aniversario;
	
	
	
	public PessoaFisica(String nome, String telefone, String endereco,
			String email, String site, String cpf, String empresa,
			String cargo, String aniversario) {
		super(nome, telefone, endereco, email, site);
		this.cpf = cpf;
		this.empresa = empresa;
		this.cargo = cargo;
		this.aniversario = aniversario;
	}


	
	
	
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getEmpresa(){
		return empresa;
	}
	public void setEmpresa(String empresa){
		this.empresa = empresa;
	}
	
	public String getCargo(){
		return cargo;
	}
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public String getAniversario(){
		return aniversario;
	}
	public void setAniversario(String aniversario){
		this.aniversario = aniversario;
	}
	
	

}
