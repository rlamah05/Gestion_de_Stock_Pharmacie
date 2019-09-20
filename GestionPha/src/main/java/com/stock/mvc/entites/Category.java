package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.codehaus.jackson.annotate.JsonIgnore;


@Entity
public class Category implements Serializable {
	
	@Id
	@GeneratedValue
	private Long idCategory;
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
	
	public Category() {
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long id) {
		this.idCategory = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@JsonIgnore
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
