package Contatos;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String razaoSocial;
	
	
	
	public PessoaJuridica(String nome, String telefone, String endereco,
			String email, String site, String cnpj, String razaoSocial) {
		super(nome, telefone, endereco, email, site);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj(){
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial(){
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial){
		this.razaoSocial = razaoSocial;
	}
	
}
