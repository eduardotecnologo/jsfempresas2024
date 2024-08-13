package jsfempresas2024.erp.service;

import java.io.Serializable;
import javax.inject.Inject;

import jsfempresas2024.erp.model.Empresa;
import jsfempresas2024.erp.repository.Empresas;
import jsfempresas2024.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private Empresas empresas;

	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}

	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}
}
