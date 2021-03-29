package com.wipro.thiago.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.wipro.thiago.models.MainCollection;

public class MenuController {

	private CollectionController collectionController;
	private ProductController productController;
	private List<MainCollection> mainCollectionList;
	private Scanner scan;
	private boolean saved;
	private int response;

	public MenuController() {
		this.mainCollectionList = new ArrayList<MainCollection>();
		this.collectionController = new CollectionController();
		this.productController = new ProductController();
		this.scan = new Scanner(System.in);

	}

	public void addMainCollection() {
		saved = collectionController.addCollection(mainCollectionList);

		if (saved)
			System.out.println("\nMain Collection added");
		else
			System.out.println("\nError on saving Main Collection");
		System.out.println("Press ENTER to continue");
		scan.nextLine();

	}

	public void addSubCollection() {
		response = collectionController.addSubCollection(mainCollectionList);
		if (response == 0)
			System.out.println("\nPlease save at least one Main Collection before proceeding");
		else if (response == 1)
			System.out.println("\nSub Collection added");
		else
			System.out.println("\nError on saving Sub Collection");
		System.out.println("Press ENTER to continue");
		scan.nextLine();

	}

	public void listMainCollections() {
		saved = collectionController.listCollections(mainCollectionList);
		System.out.println("\n");
		if (!saved)
			System.out.println("\nPlease save at least one Main Collection before proceeding");
		System.out.println("Press ENTER to continue");
		scan.nextLine();

	}
	
	
	// Product methods
	
	
	public void addProduct() {
		
		response = productController.addProduct(mainCollectionList);
		if (response == 0)
			System.out.println("\nPlease save at least one Main Collection before proceeding");
		else if (response == 1)
			System.out.println("\nProduct added");
		else
			System.out.println("\nError on saving product");
		System.out.println("Press ENTER to continue");
		scan.nextLine();
	}

}