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
	 
//	 public String ajuda() {
//		    System.out.println("Método ajuda() foi chamado");
//		    return "AjudaGestaoEmpresas"; // Retorna o nome da página (sem a extensão .xhtml)
//		}

	 
	 public Empresa getEmpresa() {
		return empresa;
	}
	 
	 public TipoEmpresa[] getTiposEmpresa() {
			return TipoEmpresa.values();
	}
	
//	 private static Integer NUMERO = 0;
//	 
//	 public GestaoEmpresasBean() {
//		 NUMERO++;
//	 }
//	 
//	 public Integer getNumero() {
//		 return NUMERO;
//	 }
}
