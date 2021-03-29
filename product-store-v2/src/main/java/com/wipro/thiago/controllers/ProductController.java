package com.wipro.thiago.controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.Product;
import com.wipro.thiago.models.Variant;

public class ProductController {

	private Scanner scan;

	public ProductController() {
		this.scan = new Scanner(System.in);
	}

	public Variant addVariant() {
		int variantOption = -1;
		do {
			System.out.println("Choose a variant for the product: ");
			System.out.println("[1] T-Shirt\n[2] Sneakers\n[3] Pants\n[4] Do not choose a variant");
			variantOption = scan.nextInt();
		} while (variantOption < 0 || variantOption > 4);
		
		switch (variantOption) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("Wrong choice");
		}
		
		return null;
	}

	public int addProduct(List<MainCollection> mainCollectionList) {
		if (mainCollectionList.isEmpty())
			return 0;

		String tempName;
		double tempPrice;
		String tempDescription;
		int tempQuantity;
		List<String> images = new ArrayList<String>(5);
		String image;
		int variantOption;

		System.out.println("\n");

		while (true) {
			try {
				System.out.println("\n+++++++Provide product data+++++++\n");
				System.out.print("Product name: ");
				tempName = scan.nextLine();

				System.out.print("Product description: ");
				tempDescription = scan.nextLine();

				System.out.print("Product price: ");
				tempPrice = scan.nextDouble();

				System.out.print("Product quantity: ");
				tempQuantity = scan.nextInt();

				System.out.println("\nChoose 1 to 5 images url for the product:");
				for (int i = 0; i < 5; i++) {
					System.out.println("Choose the image " + (i + 1) + "( type zero to finish ):");
					image = scan.nextLine();
					if (image.equals("0"))
						break;
					images.add(image);
				}

			} catch (InputMismatchException e) {

				System.out.println("\n!!!Incorrect input.(DOUBLE for price and INT for quantity)!!!");
				continue;
			}
			break;
		}
		// products.add(new Product(tempName, tempPrice, tempDescription, tempQuantity,
		// tempCategory));

		return 1;

	}

}
