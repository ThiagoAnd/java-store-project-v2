package com.wipro.thiago.controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import com.wipro.thiago.enums.Gender;
import com.wipro.thiago.enums.SleeveType;
import com.wipro.thiago.enums.TShirtSize;
import com.wipro.thiago.models.Image;
import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.Pants;
import com.wipro.thiago.models.Product;
import com.wipro.thiago.models.Sneaker;
import com.wipro.thiago.models.SubCollection;
import com.wipro.thiago.models.TShirt;
import com.wipro.thiago.models.Variant;

public class ProductController {

	private Scanner scan;

	public ProductController() {
		this.scan = new Scanner(System.in);
	}

	public Variant addSubVariant(String subVariant) {
		
		String tempColor;
		String tempSize;
		String tempMaterial;
		String tempActivity;
		String tempGender;
		String tempSleeveType;
		int subVariantOption = -1;
		int tempSizeInNumber;
		scan.nextLine();
		
		switch (subVariant) {
		case "tshirt":
			while (true) {
				try {
					System.out.print("Choose t-shirt color: ");
					tempColor = scan.nextLine();
					
					do {
						System.out.println("\nChoose t-shirt size: ");
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
					
					tempSleeveType = SleeveType.values()[subVariantOption - 1].getType();
					
				} catch (InputMismatchException e) {
					scan.nextLine();
					
					System.out.println("\n!!!Incorrect input!!!\n");
					continue;
				}
				;
				break;
			}

			return new TShirt(tempColor, tempGender, tempSleeveType, tempSize);

		case "sneakers":
			while (true) {
				try {

					System.out.print("Choose sneakers color: ");
					tempColor = scan.nextLine();
					do {
						System.out.print("\nChoose sneakers size(30 - 48): ");
						tempSizeInNumber = scan.nextInt();
						
					} while (tempSizeInNumber < 30 || tempSizeInNumber > 48);

					subVariantOption = -1;
					do {
						System.out.println("\nChoose gender: ");
						System.out.println("[1] " + Gender.M.name());
						System.out.println("[2] " + Gender.F.name());
						subVariantOption = scan.nextInt();
						
					} while (subVariantOption < 1 || subVariantOption > 2);
					tempGender = Gender.values()[subVariantOption - 1].getGender();
					scan.nextLine();
					
					System.out.print("\nChoose activity: ");
					tempActivity = scan.nextLine();
					
				} catch (InputMismatchException e) {
					scan.nextLine();
					
					System.out.println("\n!!!Incorrect input!!!\n");
					continue;
				}
				;
				break;
			}

			return new Sneaker(tempColor, tempGender, tempSizeInNumber, tempActivity);

		case "pants":
			while (true) {
				try {

					System.out.print("Choose pants color: ");
					tempColor = scan.nextLine();

					System.out.print("\nChoose pants size: ");
					tempSize = scan.nextLine();

					subVariantOption = -1;
					do {
						System.out.println("\nChoose gender: ");
						System.out.println("[1] " + Gender.M.name());
						System.out.println("[2] " + Gender.F.name());
						subVariantOption = scan.nextInt();
						
					} while (subVariantOption < 1 || subVariantOption > 2);
					
					tempGender = Gender.values()[subVariantOption - 1].getGender();
					scan.nextLine();
					
					System.out.print("\nChoose activity: ");
					tempActivity = scan.nextLine();

					System.out.print("\nChoose material: ");
					tempMaterial = scan.nextLine();

				} catch (InputMismatchException e) {
					scan.nextLine();
					
					System.out.println("\n!!!Incorrect input!!!\n");
					continue;
				}
				;

				break;
			}

			return new Pants(tempColor, tempGender, tempActivity, tempMaterial, tempSize);
		default:
			return null;
		}

	}

	public Variant addVariant() {
		
		int variantOption = -1;
		
		do {
			try {
				System.out.println("\nChoose a variant for the product. ");
				System.out.println("[1] T-Shirt\n[2] Sneakers\n[3] Pants\n[4] Do not choose a variant");
				variantOption = scan.nextInt();
				
			} catch (InputMismatchException e) {
				scan.nextLine();
				
				System.out.println("\n!!!Incorrect input!!!\n");
				continue;
			}
		} while (variantOption < 1 || variantOption > 4);

		switch (variantOption) {
		case 1:
			return addSubVariant("tshirt");
		case 2:
			return addSubVariant("sneakers");
		case 3:
			return addSubVariant("pants");
		case 4:
			return null;
		default:
			System.out.println("Wrong choice");
		}

		return null;
	}

	public List<Integer> getCollectionForProduct(List<MainCollection> mainCollectionList) {
		
		List<Integer> indexes = new ArrayList<Integer>();
		int mainCollectionOption = -1;
		int subCollectionOption = -1;
		AtomicInteger mainCount = new AtomicInteger();
		AtomicInteger subCount = new AtomicInteger();

		while (true) {

			do {
				try {
					mainCount.set(0);
					System.out.println("\nChoose a main collection for the product.\n");
					for (MainCollection main : mainCollectionList) {
						System.out.println("[" + (mainCount.getAndIncrement() + 1) + "] - " + main.getName());
					}
					
					mainCollectionOption = scan.nextInt();
					
				} catch (InputMismatchException e) {
					scan.nextLine();
					
					System.out.println("\n!!!Incorrect input!!!\n");
					continue;
				}

			} while (mainCollectionOption < 1 || mainCollectionOption > mainCollectionList.size());
			
			System.out.println("\n");
			
			do {
				try {
					subCount.set(0);
					System.out.println("Choose a sub collection for the product. ");
					for (SubCollection sub : mainCollectionList.get(mainCollectionOption - 1).getSubCollection()) {
						System.out.println("[" + (subCount.getAndIncrement() + 1) + "] - " + sub.getName());
					}

					subCollectionOption = scan.nextInt();

				} catch (InputMismatchException e) {
					scan.nextLine();
					
					System.out.println("\n!!!Incorrect input!!!\n");
					continue;
				}

			} while (subCollectionOption < 1 || subCollectionOption > mainCollectionList.get(mainCollectionOption - 1)
					.getSubCollection().size());
			break;
		}
		
		indexes.add(mainCollectionOption);
		indexes.add(subCollectionOption);

		return indexes;
	}
	
	public int verifyCollectionAndProduct(List<MainCollection> mainCollectionList) {
		
		boolean noProduct;
		boolean isEmpty = false;

		if (mainCollectionList.isEmpty())
			return 0;
		
		for (MainCollection collection : mainCollectionList) {
			isEmpty = collection.getSubCollection().isEmpty();
		}
		
		if (isEmpty)
			return 0;
		
		noProduct = mainCollectionList.stream()
				.allMatch(main -> main.getSubCollection().stream().allMatch(sub -> sub.getProducts().isEmpty()));
		
		if (noProduct)
			return 2;
		
		return 1;
	}

	public int addProduct(List<MainCollection> mainCollectionList) {
		
		int condition;
		String tempName = "";
		double tempPrice;
		String tempDescription;
		int tempQuantity;
		int imageQty;
		List<Image> images = new ArrayList<Image>(5);
		String tempImageName;
		String tempImageExtension;
		String tempImagePath;
		int tempImageSize;
		List<Integer> indexes;
		Variant variant;
		
		condition = verifyCollectionAndProduct(mainCollectionList);
		if(condition==0)
			return 0;
		

		indexes = getCollectionForProduct(mainCollectionList);

		System.out.println("\n");
		scan.nextLine();

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
				do {
					System.out.println("\nHow many images do you want to add?(0-5): ");
					imageQty = scan.nextInt();
					
					scan.nextLine();
				} while (imageQty < 0 || imageQty > 5);

				for (int i = 0; i < imageQty; i++) {
					System.out.print("\nChoose image " + (i + 1) + " name: ");
					tempImageName = scan.nextLine();
					
					System.out.print("\nChoose image " + (i + 1) + " extension: ");
					tempImageExtension = scan.nextLine();
					
					System.out.print("\nChoose image " + (i + 1) + " path: ");
					tempImagePath = scan.nextLine();
					
					System.out.print("\nChoose image " + (i + 1) + " size(MB): ");
					tempImageSize = scan.nextInt();
					
					scan.nextLine();
					
					images.add(new Image(tempImageName, tempImageSize, tempImagePath, tempImageExtension));

				}

				variant = addVariant();

			} catch (InputMismatchException e) {
				scan.nextLine();
				
				System.out.println("\n!!!Incorrect input.(DOUBLE for price and INT for quantity and INT for size)!!!");
				continue;
			}
			break;
		}
		scan.nextLine();

		boolean haveProduct = false;
		for (int i = 0; i < mainCollectionList.size(); i++) {
			for (int j = 0; j < mainCollectionList.get(i).getSubCollection().size(); j++) {
				for (int k = 0; k < mainCollectionList.get(i).getSubCollection().get(j).getProducts().size(); k++) {
					
					if (mainCollectionList.get(i).getSubCollection().get(j).getProducts().get(k).getName()
							.equalsIgnoreCase(tempName))
						haveProduct = true;

				}

			}

		}
		
		if (haveProduct)
			return 2;

		Product product = new Product(tempName, tempPrice, tempDescription, tempQuantity, images, variant);

		mainCollectionList.get(indexes.get(0) - 1).getSubCollection().get(indexes.get(1) - 1).getProducts()
				.add(product);

		if (mainCollectionList.get(indexes.get(0) - 1).getSubCollection().get(indexes.get(1) - 1).getProducts()
				.contains(product))
			return 1;
		
		return 3;

	}

	public int getProduct(List<MainCollection> mainCollectionList) {
	
		boolean haveProduct;
		String tempName;
		int condition;

		condition = verifyCollectionAndProduct(mainCollectionList);
		
		if(condition!=1)
			return condition;

		System.out.print("\nPlease, type the product name: ");
		tempName = scan.nextLine();

		haveProduct = mainCollectionList.stream().anyMatch(main -> main.getSubCollection().stream()
				.anyMatch(sub -> sub.getProducts().stream().anyMatch(p -> p.getName().equalsIgnoreCase(tempName))));
		
		if (!haveProduct)
			return 3;

		mainCollectionList.stream()
				.forEach(main -> main.getSubCollection().stream()
						.forEach(sub -> sub.getProducts().stream().filter(p -> p.getName().equalsIgnoreCase(tempName))
								.forEach(p -> System.out.println(p.getPriceAndDescription()))));

		return 1;

	}

	public int listAllProducts(List<MainCollection> mainCollectionList) {
		
		int condition;
		
		condition = verifyCollectionAndProduct(mainCollectionList);
		
		if(condition!=1)
			return condition;

		mainCollectionList.stream().forEach(main -> main.getSubCollection().stream()
				.forEach(sub -> sub.getProducts().stream().forEach(p -> System.out.println("\n" + p.toString()))));
		
		System.out.println("\n");
		
		return 1;
	}

}
