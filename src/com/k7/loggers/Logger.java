package com.k7.loggers;

public interface Logger {
    void info(String msg, Object o);
    void info(String msg);
    void error(String msg, Object o);
    void error(String msg);
}
