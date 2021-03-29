package com.wipro.thiago.controllers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import com.wipro.thiago.models.MainCollection;
import com.wipro.thiago.models.SubCollection;

public class CollectionController {

	private Scanner scan;

	public CollectionController() {
		this.scan = new Scanner(System.in);
	}

	public boolean addCollection(List<MainCollection> mainCollectionList) {
		String tempName;
		String tempDescription;
		String keyword;
		List<String> keywords = new ArrayList<String>(6);

		
		while (true) {
			try {
				System.out.println("\n+++++++Provide Main Collection data+++++++\n");
				System.out.print("Main Collection name: ");
				tempName = scan.nextLine();

				System.out.print("Main Collection description: ");
				tempDescription = scan.nextLine();

				System.out.println("\nChoose 1 to 6 keywords for Main Collection:");
				for (int i = 0; i < 6; i++) {
					System.out.print("Choose the keyword " + (i + 1) + "( type 0 to finish ):");
					keyword = scan.nextLine();
					if (keyword.equals("0"))
						break;
					keywords.add(keyword);
				}

			} catch (InputMismatchException e) {

				System.out.println("\n!!!Incorrect input.!!!");
				continue;
			}
			break;
		}

		MainCollection newMainCollection = new MainCollection(tempName, tempDescription, keywords);
		mainCollectionList.add(newMainCollection);

		if (mainCollectionList.contains(newMainCollection))
			return true;

		return false;
	}

	public int addSubCollection(List<MainCollection> mainCollectionList) {
		if (mainCollectionList.isEmpty())
			return 0;

		String tempName;
		String tempDescription;
		String keyword;
		List<String> keywords = new ArrayList<String>(6);
		AtomicInteger count = new AtomicInteger();
		int option = -1;

		do {
			try {
				count.set(0);
				System.out.println("Choose one Main Collection:\n" + mainCollectionList.size());
				mainCollectionList.stream().forEach(
						list -> System.out.println("[" + (count.getAndIncrement() + 1) + "] " + list.getName()));
				option = scan.nextInt();
			} catch (InputMismatchException e) {

				System.out.println("\n!!!Incorrect input.!!!");
				continue;
			}
		} while (option < 1 || option > mainCollectionList.size());
		scan.nextLine();
		while (true) {
			try {
				System.out.println("\n+++++++Provide Sub Collection data+++++++\n");
				System.out.print("Sub Collection name: ");
				tempName = scan.nextLine();

				System.out.print("Sub Collection description: ");
				tempDescription = scan.nextLine();

				System.out.println("\nChoose 1 to 6 keywords for Sub Collection:");
				for (int i = 0; i < 6; i++) {
					System.out.println("Choose the keyword " + (i + 1) + "( type 0 to finish ):");
					keyword = scan.nextLine();
					if (keyword.equals("0"))
						break;
					keywords.add(keyword);
				}

			} catch (InputMismatchException e) {

				System.out.println("\n!!!Incorrect input.!!!");
				continue;
			}
			break;
		}

		SubCollection newSubCollection = new SubCollection(tempName, tempDescription, keywords);
		mainCollectionList.get(option - 1).getSubCollection().add(newSubCollection);

		if (mainCollectionList.get(option - 1).getSubCollection().contains(newSubCollection))
			return 1;

		return 2;

	}

	public boolean listCollections(List<MainCollection> mainCollectionList) {
		if (mainCollectionList.isEmpty())
			return false;

		mainCollectionList.stream().forEach(list -> {
			System.out.println("Main Collection: " + list.getName());
			list.getSubCollection().stream()
					.forEach(subList -> System.out.println("\tSub Collection: " + subList.getName()));
		});
		return true;

	}

	

}
