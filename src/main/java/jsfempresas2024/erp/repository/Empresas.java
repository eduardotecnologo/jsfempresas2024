package jsfempresas2024.erp.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import jsfempresas2024.erp.model.Empresa;


public class Empresas implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
    private EntityManager manager;
	
	public Empresas() {
		
	}
	
	public Empresas(EntityManager manager) {
		this.manager = manager;
	}
	
	public Empresa porId(Long id) {
		return manager.find(Empresa.class, id);
	}
	
	public List<Empresa> pesquisar(String nome){
		String jpql = "FROM Empresa WHERE nomeFantasia LIKE :nomeFantasia";
		TypedQuery<Empresa> query = manager.createQuery(jpql,Empresa.class);
		query.setParameter("nomeFantasia", nome + "%");
		return query.getResultList();
	}
	
    public void guardar(Empresa empresa) {
        if (empresa.getId() == null) {
            manager.persist(empresa);
        } else {
            manager.merge(empresa);
        }
    }
	
	//public Empresa guardar (Empresa empresa){
    //		return manager.merge(empresa);
	//}
	
	public void remover (Empresa empresa){
		empresa = porId(empresa.getId());
		manager.remove(empresa);
	}
}
