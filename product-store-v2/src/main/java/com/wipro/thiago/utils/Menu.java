package com.wipro.thiago.utils;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.wipro.thiago.controllers.MenuController;

public class Menu {

	private Scanner scan;
	
	private MenuController menuController;
	

	public Menu() {
		this.scan = new Scanner(System.in);
		this.menuController = new MenuController();
	}

	public void startMenu() {

		int option = -1;

		do {
			option = getMainMenuOption();
			showSubMenuOption(option);
			

		} while (option != 0);
		scan.close();

	}

	public int getMainMenuOption() {
		int number = -1;

		do {
			try {
				System.out.println("+++++++++++THIAGO STORE+++++++++++++++++++");
				System.out.println("[1] Product Management");
				System.out.println("[2] Collection Management");
				System.out.println("[0] Exit program");
				number = scan.nextInt();
				if (number < 0 || number > 2) {
					System.out.println("\n!!!Choose 0 to 2!!!\n");
				}
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("\n!!!Incorrect input.Only numbers allowed!!!\n");

			}
		} while (number < 0 || number > 3);

		return number;

	}

	public void showSubMenuOption(int option) {
		int number;

		if (option == 1) {
			do {
				number = getProductMenuOption();
				executeProductOption(number);
			} while (number != 0);
		} else if (option == 2) {
			do {
				number = getCollectiontMenuOption();
				executeCollectionOption(number);
			} while (number != 0);

		} else {
			scan.close();
			System.out.println("Program terminated.");
		}

	}

	public int getProductMenuOption() {
		int number = -1;

		do {
			try {
				System.out.println("[1] Add product");
				System.out.println("[2] List all the products");
				System.out.println("[3] Search for product");
				System.out.println("[0] back");
				number = scan.nextInt();
				if (number < 0 || number > 3) {
					System.out.println("\n!!!Choose 0 to 3!!!\n");
				}
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("\n!!!Incorrect input.Only numbers allowed!!!\n");

			}
		} while (number < 0 || number > 3);

		return number;

	}

	public int getCollectiontMenuOption() {
		int number = -1;

		do {
			try {
				System.out.println("[1] Add new Main Collection");
				System.out.println("[2] Add new sub-collection to main collection");
				System.out.println("[3] List Collections");
				System.out.println("[4] Search for product in a sub-collection");
				System.out.println("[5] List for products in a Collection");
				System.out.println("[0] voltar");
				number = scan.nextInt();
				if (number < 0 || number > 5) {
					System.out.println("\n!!!Choose 0 to 5!!!\n");
				}
			} catch (NoSuchElementException e) {
				scan.nextLine();
				System.out.println("\n!!!Incorrect input.Only numbers allowed!!!\n");

			}
		} while (number < 0 || number > 5);

		return number;

	}

	public void executeProductOption(int option) {

		switch (option) {

		case 1:
			menuController.addProduct();
			break;
		case 2:
			menuController.listAllProducts();
			break;
		case 3:
			menuController.getProduct();
			break;
		case 0:
			break;
		default:
			System.out.println("Invalid option");
		}
	}

	public void executeCollectionOption(int option) {

		switch (option) {

		case 1:
			menuController.addMainCollection();
			break;
		case 2:
			menuController.addSubCollection();
			break;
		case 3:
			menuController.listMainCollections();
			break;
		case 4:
			System.out.println("numero 4");
		case 5:
			System.out.println("numero 5");
		case 0:
			break;
		default:
			System.out.println("Invalid option");
		}
	}

}
