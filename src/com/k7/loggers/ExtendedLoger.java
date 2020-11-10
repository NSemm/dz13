package com.k7.loggers;

import com.k7.task.contacts.Contacts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExtendedLoger implements Logger {
    String log = "";
    Date date;
    DateFormat dtf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");

    public void resetLog() {
        log = "";
    }

    @Override
    public void info(String msg, Contacts contact) {
        System.out.println("[INFO] " + dtf.format(date = new Date()) + ": " + msg);
        System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
    }

    @Override
    public void info(String msg) {
        log += "[INFO] " + dtf.format(date = new Date()) + ": " + msg + "\n";
    }

    @Override
    public void error(String msg, Contacts contact) {
        System.out.println("[ERROR] " + dtf.format(date = new Date()) + ": " + msg);

    }

    @Override
    public void error(String msg) {
        log += "[ERROR] " + dtf.format(date = new Date()) + ": " + msg + "\n";
    }

    @Override
    public String toString() {
        return log;
    }
}
