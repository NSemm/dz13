package com.k7.loggers;

import com.k7.task.contacts.Contacts;

public interface Logger {
    void info(String msg, Contacts contact);
    void info(String msg);
    void error(String msg, Contacts contact);
    void error(String msg);
}
