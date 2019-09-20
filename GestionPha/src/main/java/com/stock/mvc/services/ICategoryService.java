package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.Article;
import com.stock.mvc.entites.Category;

public interface ICategoryService {
	
	public Category save(Category entity);
	
	public Category update(Category entity);

	public List<Category> selectAll();

	public List<Category> selectAll(String sortField, String sort);

	public Category getById(Long id);

	public void remove(Long id);

	public Category findOne(String paramName, Object paramValue);

	public Category findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
	
	public List<Article> selectAllArticlesByCategory(Long idCategory);

}
