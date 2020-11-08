package com.k7.loggers;

public class StandartLogger implements Logger {
    String log = "";

    public void resetLog(){
        log = "";
    }

    @Override
    public void info(String msg, Object o) {

    }

    @Override
    public void info(String msg) {
        log += msg + "\n";

    }

    @Override
    public void error(String msg, Object o) {

    }

    @Override
    public void error(String msg) {
        log+=msg+"\n";
    }

    @Override
    public String toString() {
        return log;
    }
}
