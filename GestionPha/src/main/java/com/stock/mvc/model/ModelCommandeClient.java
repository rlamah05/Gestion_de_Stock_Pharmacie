package com.stock.mvc.model;

import java.util.Collection;
import java.util.Map;

import com.stock.mvc.entites.Article;
import com.stock.mvc.entites.Client;
import com.stock.mvc.entites.CommandeClient;
import com.stock.mvc.entites.LigneCommandeClient;

public interface ModelCommandeClient {

	void creerCommande();
	
	void modifierCommande(Client client);
	
	LigneCommandeClient ajouterLigneCommande(Article article);
	
	LigneCommandeClient supprimerLigneCommande(Article article);
	
	LigneCommandeClient modifierQuantite(Article article, double qte);
	
	String generateCodeCommande();
	
	CommandeClient getCommande();
	
	Map<Long, LigneCommandeClient> getLigneCde();
	
	Collection<LigneCommandeClient> getLignesCommandeClient(CommandeClient commande);
	
	void init();
}
