package com.wipro.thiago.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.Product;
import com.wipro.thiago.models.SubCollection;

class CollectionControllerTest {

	private CollectionController collectionController;

	@BeforeEach
	void setup() {
		this.collectionController = new CollectionController();

	}

	@Test
	void should_ReturnZero_When_MainCollectionListIsEmpty() {
		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		int result;

		// when

		result = collectionController.verifyCollectionAndProduct(mainCollectionList);

		// then

		assertTrue(0 == result);

	}

	@Test
	void should_ReturnZero_When_SubCollectionsIsEmpty() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		mainCollectionList.add(new MainCollection(null, null, null));
		mainCollectionList.get(0).setSubCollection(new ArrayList<SubCollection>());

		int result;

		// when

		result = collectionController.verifyCollectionAndProduct(mainCollectionList);

		// then

		assertTrue(0 == result);

	}

	@Test
	void should_ReturnTwo_When_NoProductsInSubCollections() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		mainCollectionList.add(new MainCollection(null, null, null));
		mainCollectionList.get(0).setSubCollection(new ArrayList<SubCollection>());
		mainCollectionList.get(0).getSubCollection().add(new SubCollection(null, null, null));
		mainCollectionList.get(0).getSubCollection().get(0).setProducts(new ArrayList<Product>());

		int result;

		// when

		result = collectionController.verifyCollectionAndProduct(mainCollectionList);

		// then

		assertTrue(2 == result);

	}

	@Test
	void should_ReturnFalse_When_MainCollectionListIsEmpty() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		boolean result;

		// when

		result = collectionController.listCollections(mainCollectionList);

		// then

		assertFalse(result);

	}

	@Test
	void should_ReturnTrue_When_MainCollectionListIsNotEmpty() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		mainCollectionList.add(new MainCollection(null, null, null));
		boolean result;

		// when

		result = collectionController.listCollections(mainCollectionList);

		// then

		assertTrue(result);

	}

	@Test
	void should_ReturnOne_When_CollectionsHaveOneProductAtLeast() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		mainCollectionList.add(new MainCollection(null, null, null));
		mainCollectionList.get(0).setSubCollection(new ArrayList<SubCollection>());
		mainCollectionList.get(0).getSubCollection().add(new SubCollection(null, null, null));
		mainCollectionList.get(0).getSubCollection().get(0).setProducts(new ArrayList<Product>());
		mainCollectionList.get(0).getSubCollection().get(0).getProducts().add(new Product("Teste", 0, null, 0, null, null));

		int result;

		// when

		result = collectionController.listAllProductsByCollection(mainCollectionList);

		// then

		assertTrue(1 == result);

	}
	
	
	
	


}
