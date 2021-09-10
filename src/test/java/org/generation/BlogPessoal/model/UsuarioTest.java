package org.generation.BlogPessoal.model;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioTest {

	public Usuario usuario;
	public Usuario usuarioNulo = new Usuario();
	
	@Autowired
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
}
