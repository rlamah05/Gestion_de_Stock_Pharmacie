package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entites.Article;
import com.stock.mvc.entites.Category;

public interface ICategoryDao extends IGenericDao<Category> {
	
	public List<Article> selectAllArticlesByCategory(Long idCategory);

}
