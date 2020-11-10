package com.k7;

import com.k7.loggers.ExtendedLoger;
import com.k7.loggers.Logger;
import com.k7.loggers.StandartLogger;
import com.k7.task.contacts.ContactStorage;
import com.k7.task.contacts.PhoneBookControl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the logger type: 1 - Standart logger; 2 - Extend logger");
        int loggerType = sc.nextInt();
        sc.nextLine();
        Logger logger;
        if (loggerType == 1) logger = new StandartLogger();
        else logger = new ExtendedLoger();
        ToDo startProgram = new ToDo(sc, logger);
        //startProgram.startWhatNumber();

        ContactStorage storage = new ContactStorage();
        PhoneBookControl bookControl = new PhoneBookControl(sc, storage, logger);
        bookControl.addContact();
        bookControl.showContacts();
        bookControl.searchContactByName();
        bookControl.searchContactByNumber();
        bookControl.delContactByName();


    }
}
