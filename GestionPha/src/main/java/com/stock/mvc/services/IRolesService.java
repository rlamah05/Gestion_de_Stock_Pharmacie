package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.Roles;

public interface IRolesService {
public Roles save(Roles entity);
	
	public Roles update(Roles entity);
	
	public List<Roles> selectAll();
	
	public List<Roles> selectAll(String sortField, String sort);
	
	public Roles getById(Long id);
	
	public void remove(Long id);
	
	public Roles findOne(String paramName, Object paramValue);
	
	public Roles findOne(String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
