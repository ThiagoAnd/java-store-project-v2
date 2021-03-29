package com.wipro.thiago.controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.wipro.thiago.enums.Gender;
import com.wipro.thiago.enums.SleeveType;
import com.wipro.thiago.enums.TShirtSize;
import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.Product;
import com.wipro.thiago.models.Variant;

public class ProductController {

	private Scanner scan;

	public ProductController() {
		this.scan = new Scanner(System.in);
	}

	public Variant addSubVariant(String subVariant) {
		String tempColor;
		String tempSize;
		String tempGender;
		String tempSleeveType;
		int subVariantOption = -1;
		
		switch (subVariant) {
		case "tshirt":
			while (true) {
				try {
					scan.nextLine();
					System.out.print("Choose T-Shirt color: ");
					tempColor = scan.nextLine();
					do {
						System.out.print("\nChoose T-Shirt size: ");
						for (TShirtSize size : TShirtSize.values()) {
							System.out.println("[" + size.getIndex() + "] " + size.getSize());
						}
						subVariantOption = scan.nextInt();
					} while (subVariantOption < 1 || subVariantOption > TShirtSize.values().length);
					tempSize = TShirtSize.values()[subVariantOption - 1].getSize();
					subVariantOption = -1;
					do {
						System.out.println("\nChoose gender: ");
						System.out.println("[1] " + Gender.M.name());
						System.out.println("[2] " + Gender.F.name());
						subVariantOption = scan.nextInt();
					} while (subVariantOption < 1 || subVariantOption > 2);
					tempGender = Gender.values()[subVariantOption - 1].getGender();
					subVariantOption = -1;
					do {
						System.out.println("\nChoose Sleeve type");
						System.out.println("[1] " + SleeveType.LONG.getType());
						System.out.println("[2] " + SleeveType.SHORT.getType());
						subVariantOption = scan.nextInt();
					} while (subVariantOption < 1 || subVariantOption > 2);
				} catch (InputMismatchException e) {
					scan.nextLine();
					System.out.println("\n!!!Incorrect input!!!");
					continue;
				}
				;
				break;
			}
			break;
		case "sneakers":
			break;
		case "pants":
			break;
		default:
			return null;
		}
		return null;

	}

	public Variant addVariant() {
		int variantOption = -1;
		do {
			try {
				System.out.println("\nChoose a variant for the product: ");
				System.out.println("[1] T-Shirt\n[2] Sneakers\n[3] Pants\n[4] Do not choose a variant");
				variantOption = scan.nextInt();
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("\n!!!Incorrect input!!!");
				continue;
			}
		} while (variantOption < 1 || variantOption > 4);

		switch (variantOption) {
		case 1:
			addSubVariant("tshirt");
			break;
		case 2:
			System.out.println("variante 2");
			break;
		case 3:
			System.out.println("variante 3");
			break;
		case 4:
			System.out.println("variante 4");
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
				System.out.print("\nProduct name: ");
				tempName = scan.nextLine();

				System.out.print("\nProduct description: ");
				tempDescription = scan.nextLine();

				System.out.print("\nProduct price: ");
				tempPrice = scan.nextDouble();

				System.out.print("\nProduct quantity: ");
				tempQuantity = scan.nextInt();

				scan.nextLine();
				System.out.println("\nChoose 1 to 5 images url for the product:");
				for (int i = 0; i < 5; i++) {
					System.out.print("Choose the image " + (i + 1) + "( type 0 to finish ): ");
					image = scan.nextLine();
					if (image.equals("0"))
						break;
					images.add(image);
				}

				addVariant();

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
