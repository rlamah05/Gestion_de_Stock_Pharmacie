package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stock.mvc.entites.Article;
import com.stock.mvc.entites.Category;
import com.stock.mvc.services.ICategoryService;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
	
	@Autowired
	private ICategoryService catService;
	
	@RequestMapping(value = "/")
	public String category(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<Category> categories = catService.selectAll();
		if (categories == null) {
			categories = new ArrayList<Category>();
		}
		model.addAttribute("categories", categories);
		return "category/category";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterClient(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "category/ajouterCategory";
	}
	
	@RequestMapping(value = "/enregistrer")
	public String enregistrerClient(Model model, Category category) {
		if (category != null) {
			if (category.getIdCategory() != null) {
				catService.update(category);
			} else {
				catService.save(category);
			}
		}
		return "redirect:/category/";
	}
	
	@RequestMapping(value = "/modifier/{idCategory}")
	public String modifierClient(Model model, @PathVariable Long idCategory) {
		if (idCategory != null) {
			Category category = catService.getById(idCategory);
			if (category != null) {
				model.addAttribute("category", category);
			}
		}
		return "category/ajouterCategory";
	}
	
	@RequestMapping(value = "/supprimer/{idCategory}")
	@ResponseBody
	public String supprimerClient(Model model, @PathVariable Long idCategory) {
		if (idCategory != null) {
			Category category = catService.getById(idCategory);
			if (category != null) {
				List<Article> articleCat = catService.selectAllArticlesByCategory(idCategory);
				if (articleCat.isEmpty() ) {
					catService.remove(idCategory);
				} else {
					return "Impossible de supprimer cette catégprie, car elle est affecté à des articles";
				}
			}
		}
		return "redirect:/category/";
	}

}
