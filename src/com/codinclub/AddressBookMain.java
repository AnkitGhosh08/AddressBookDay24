package com.codinclub;

/**
 * This is the main class and, we are calling the main method there. We are
 * calling the addressBookMain in this method that has all the operations.
 *
 * @author Ankit Ghosh
 *
 */
public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("---------- Welcome To Address Book Program!! ----------");
        MultipleAddressBook addressBookDirectory = new MultipleAddressBook();
        addressBookDirectory.addressBookMain();
    }
}