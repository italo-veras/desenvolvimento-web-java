package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.ProdutoDAO;
import entidade.Produto;

@ManagedBean
public class ProdutoBean {
	
	private Produto produto = new Produto();
	private List<Produto> lista;
			
	
	public String salvar() {
		ProdutoDAO.Salvar(produto);
		produto = new Produto(); 
		return null;
	}
	
	public List<Produto> getLista() {
		if(lista == null)
			lista = ProdutoDAO.Listar();
		return lista;
	}
	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
