package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.entites.Article;
import com.stock.mvc.services.IArticleService;

@Transactional
public class ArticleServiceImpl implements IArticleService {
	
	private IArticleDao dao;
	
	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article entity) {
		return dao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
