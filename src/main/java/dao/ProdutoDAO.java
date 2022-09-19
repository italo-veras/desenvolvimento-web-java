package dao;

import javax.persistence.Query;

import java.util.List;

import javax.persistence.EntityManager;

import entidade.Produto;
import util.JpaUtil;

public class ProdutoDAO {
	
	
	public static void Salvar(Produto r) {
		 EntityManager em = JpaUtil.CriarEM();
		 em.getTransaction().begin();
		 em.persist(r);
		 em.getTransaction().commit();
		 em.close();
	}
	
	public static List<Produto> Listar() {
		
		EntityManager em = JpaUtil.CriarEM();
		Query q = em.createQuery("select r from Produto r"); 
		List<Produto> produtos = q.getResultList();
		em.close();
		
		return produtos; 
	}
	
}
