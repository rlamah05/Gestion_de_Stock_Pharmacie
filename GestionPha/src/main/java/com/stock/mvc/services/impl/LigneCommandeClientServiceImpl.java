package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommandeClientDao;
import com.stock.mvc.entites.LigneCommandeClient;
import com.stock.mvc.services.ILigneCommandeClientService;

@Transactional
public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {
	
	private ILigneCommandeClientDao dao;
	
	public void setDao(ILigneCommandeClientDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

	@Override
	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient) {
		return dao.getByIdCommande(idCommandeClient);
	}

}
