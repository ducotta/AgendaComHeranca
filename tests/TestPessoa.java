package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Contatos.Pessoa;
import Contatos.PessoaFisica;
import Contatos.PessoaJuridica;

public class TestPessoa {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPessoa(){
		Pessoa umaPessoa = new Pessoa ("Eduardo", "555-555", "Rua Augusta", "test@gmail.com", "agenda.test.com");
		assertEquals("Eduardo", umaPessoa.getNome());
		assertEquals("555-555", umaPessoa.getTelefone());
		assertEquals("Rua Augusta", umaPessoa.getEndereco());
		assertEquals("test@gmail.com", umaPessoa.getEmail());
		assertEquals("agenda.test.com", umaPessoa.getSite());
		
	}
	
	@Test
	public void testPessoaFisica(){
		PessoaFisica umaPessoaFisica = new PessoaFisica("Eduardo", "555-555", "Rua Augusta", "test@gmail.com",
				"agenda.test.com","000.111.222-33", "UnB S.A.", "Presidente", "01/01/1111");
		assertEquals("Eduardo", umaPessoaFisica.getNome());
		assertEquals("555-555", umaPessoaFisica.getTelefone());
		assertEquals("Rua Augusta", umaPessoaFisica.getEndereco());
		assertEquals("test@gmail.com", umaPessoaFisica.getEmail());
		assertEquals("agenda.test.com", umaPessoaFisica.getSite());
		assertEquals("000.111.222-33", umaPessoaFisica.getCpf());
		assertEquals("UnB S.A.", umaPessoaFisica.getEmpresa());
		assertEquals("Presidente", umaPessoaFisica.getCargo());
		assertEquals("01/01/1111", umaPessoaFisica.getAniversario());
		
	}
	
	@Test
	public void testPessoaJuridica(){
		PessoaJuridica umaPessoaJuridica = new PessoaJuridica("Eduardo", "555-555", "Rua Augusta", "test@gmail.com",
				"agenda.test.com", "123456789", "Razão Social");
		assertEquals("Eduardo", umaPessoaJuridica.getNome());
		assertEquals("555-555", umaPessoaJuridica.getTelefone());
		assertEquals("Rua Augusta", umaPessoaJuridica.getEndereco());
		assertEquals("test@gmail.com", umaPessoaJuridica.getEmail());
		assertEquals("agenda.test.com", umaPessoaJuridica.getSite());
		assertEquals("123456789",umaPessoaJuridica.getCnpj());
		assertEquals("Razão Social", umaPessoaJuridica.getRazaoSocial());
		
	}
	
	
	
}
