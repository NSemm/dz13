package com.k7.loggers;

import com.k7.task.contacts.Contacts;

public class StandartLogger implements Logger {
    String log = "";

    public void resetLog() {
        log = "";
    }

    @Override
    public void info(String msg, Contacts contact) {
        System.out.println("INFO:" + msg);
        System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
    }

    @Override
    public void info(String msg) {
        log += "INFO:" + msg + "\n";

    }

    @Override
    public void error(String msg, Contacts contact) {
        System.out.println("ERROR:" + msg);
        //System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
    }

    @Override
    public void error(String msg) {
        log += "INFO:" + msg + "\n";
    }

    @Override
    public String toString() {
        return log;
    }
}
