package com.AddressBookSystem;

import java.util.Scanner;

public class AddressBookMain {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println(
				"enter contact details in the order : firstName/lastName/address/city/state/zip/phoneNumber/email");

		Contacts c = new Contacts(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),
				input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextLine());

	}

}
