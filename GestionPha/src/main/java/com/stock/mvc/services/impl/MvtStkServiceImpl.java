package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IMvtStkDao;
import com.stock.mvc.entites.MvtStk;
import com.stock.mvc.services.IMvtStkService;

@Transactional
public class MvtStkServiceImpl implements IMvtStkService {
	
	private IMvtStkDao dao;
	
	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStk save(MvtStk entity) {
		return dao.save(entity);
	}

	@Override
	public MvtStk update(MvtStk entity) {
		return dao.update(entity);
	}

	@Override
	public List<MvtStk> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<MvtStk> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MvtStk getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public MvtStk findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStk findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
