package com.wipro.thiago.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.Product;
import com.wipro.thiago.models.SubCollection;

class ProductControllerTest {

	private ProductController productController;

	@BeforeEach
	void setup() {
		this.productController = new ProductController();

	}

	@Test
	void should_ReturnZero_When_MainCollectionListIsEmpty() {
		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		int result;

		// when

		result = productController.verifyCollectionAndProduct(mainCollectionList);

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

		result = productController.verifyCollectionAndProduct(mainCollectionList);

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

		result = productController.verifyCollectionAndProduct(mainCollectionList);

		// then

		assertTrue(2 == result);

	}

	@Test
	void should_ReturnOne_When_CollectionsHaveOneProductAtLeast() {

		// given

		List<MainCollection> mainCollectionList = new ArrayList<MainCollection>();
		mainCollectionList.add(new MainCollection(null, null, null));
		mainCollectionList.get(0).setSubCollection(new ArrayList<SubCollection>());
		mainCollectionList.get(0).getSubCollection().add(new SubCollection(null, null, null));
		mainCollectionList.get(0).getSubCollection().get(0).setProducts(new ArrayList<Product>());
		mainCollectionList.get(0).getSubCollection().get(0).getProducts()
				.add(new Product("Teste", 0, null, 0, null, null));

		int result;

		// when

		result = productController.listAllProducts(mainCollectionList);

		// then

		assertTrue(1 == result);

	}

}
