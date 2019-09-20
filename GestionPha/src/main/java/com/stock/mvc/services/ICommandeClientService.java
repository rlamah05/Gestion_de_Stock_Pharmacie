package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.CommandeClient;

public interface ICommandeClientService {
	
	public CommandeClient save(CommandeClient entity);
	
	public CommandeClient update(CommandeClient entity);

	public List<CommandeClient> selectAll();

	public List<CommandeClient> selectAll(String sortField, String sort);

	public CommandeClient getById(Long id);

	public void remove(Long id);

	public CommandeClient findOne(String paramName, Object paramValue);

	public CommandeClient findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
