package com.k7.task.contacts;

import com.k7.loggers.Logger;

import java.util.Scanner;

public class PhoneBookControl {
    private Scanner sc;
    private ContactStorage storage;
    private Logger logger;

    public PhoneBookControl(Scanner sc, ContactStorage storage, Logger logger) {
        this.sc = sc;
        this.storage = storage;
        this.logger = logger;
    }

    public void showContacts() {
        System.out.println("-----------------------Contacts------------------------");
        for (Contacts contact : storage.getAllContacts()) {
            System.out.printf("%-20s %-20s %-15s\n", contact.getName(), contact.getSurname(), contact.getNumber());
        }
        System.out.println("-------------------------------------------------------");
    }

    public void addContact() {
        String names = "Максим,Николай,Александр,Глеб,Владислав,Александр";
        String surnames = "Дмиторович,Семеренко,Кальмус,Асташев,Алексееноков,Усик";
        String phones = "0781651651,0636546461,0665646546,0506546468,0666846846,0734646546";
        for (int i = 0; i < names.split(",").length; i++) {
            String name = names.split(",")[i];
            String surname = surnames.split(",")[i];
            String number = phones.split(",")[i];
            Contacts newContact = new Contacts(name, surname, number);
            storage.add(newContact);
            logger.info("Add contact:", newContact);
        }
    }

    public void searchContactByName() {
        int count = 0;
        System.out.println("Enter name contact for search");
        String name = sc.nextLine();
        System.out.println("--------------------SearchContacts---------------------");
        for (Contacts searchContact : storage.getContactByName(name)) {
            if (searchContact.getName().equals(name)) ++count;
            System.out.printf("%-20s %-20s %-15s\n", searchContact.getName(), searchContact.getSurname(), searchContact.getNumber());
        }
        System.out.println("-------------------------------------------------------");
        if (count == 0) logger.error("No contacts", storage.getContactForLog(storage.getIndexForDel("Максим")));
    }

    public void searchContactByNumber() {
        int count = 0;
        System.out.println("Enter number contact for search");
        String number = sc.nextLine();
        System.out.println("--------------------SearchContacts---------------------");
        for (Contacts searchContact : storage.getContactByNumber(number)) {
            if (searchContact.getNumber().equals(number)) ++count;
            System.out.printf("%-20s %-20s %-15s\n", searchContact.getName(), searchContact.getSurname(), searchContact.getNumber());
        }
        System.out.println("-------------------------------------------------------");
        if (count == 0) logger.error("No contacts", storage.getContactForLog(storage.getIndexForDel("Максим")));

    }

    public void delContactByName() {
        System.out.println("Enter  name  contact for delete");
        String name = sc.nextLine();
        logger.info("Delete contact:", storage.getContactForLog(storage.getIndexForDel(name)));
        storage.del(storage.getIndexForDel(name));
        showContacts();
    }
}
