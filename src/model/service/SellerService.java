package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll();
	}
	
	//método para inserir ou atualizar um dado no banco
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	// removendo um departamento do banco de dados
	public void remove (Seller obj) {
		dao.deleteById(obj.getId());
	}
}
