package com.k7.task.contacts;

import java.util.Arrays;

public class ContactStorage {
    private Contacts[] contacts = new Contacts[0];

    public Contacts[] getAllContacts() {
        return contacts;
    }

    public Contacts[] getContactByName(String name) {
        Contacts[] searchRes = new Contacts[0];
        for (Contacts contact : getAllContacts()) {
            if (name.equals(contact.getName())) {
                searchRes = Arrays.copyOf(searchRes, searchRes.length + 1);
                searchRes[searchRes.length - 1] = contact;
            }
        }
        return searchRes;
    }

    public Contacts[] getContactByNumber(String number) {
        Contacts[] searchRes = new Contacts[0];
        for (Contacts contact : getAllContacts()) {
            if (number.equals(contact.getNumber())) {
                searchRes = Arrays.copyOf(searchRes, searchRes.length + 1);
                searchRes[searchRes.length - 1] = contact;
            }
        }
        return searchRes;
    }


    public void add(Contacts contact) {
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = contact;
    }

    public int getIndexForDel(String name) {
        int index = 0;
        for (Contacts contact : getAllContacts()) {
            if (name.equals(contact.getName())) break;
            else ++index;
        }
        return index;
    }

    public Contacts getContactForLog(int index) {
        Contacts retCont = getAllContacts()[index];
        return retCont;
    }

    public void del(int index) {
        if (index < contacts.length) {
            Contacts[] temp = new Contacts[contacts.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if (i < index) temp[i] = contacts[i];
                else temp[i] = contacts[i + 1];
            }
            contacts = temp;
        }
    }
}
