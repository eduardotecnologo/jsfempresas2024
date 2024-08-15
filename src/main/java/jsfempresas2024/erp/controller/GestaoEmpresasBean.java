package jsfempresas2024.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import jsfempresas2024.erp.model.Empresa;
import jsfempresas2024.erp.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private Empresa empresa = new Empresa();

	public void salvar() {
		System.out.println("Razão social: " + empresa.getRazaoSocial()
				+ " - " + empresa.getNomeFantasia()
				+ " - " + empresa.getTipo());
	}

	public String ajuda() {
		return "AjudaGestaoEmpresas?faces-redirect=true";
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
}