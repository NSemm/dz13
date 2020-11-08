package com.k7;

import com.k7.loggers.ExtendedLoger;
import com.k7.loggers.Logger;
import com.k7.loggers.StandartLogger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the logger type: 1 - Standart logger; 2 - Extend logger");
        int loggerType = sc.nextInt();
        Logger logger;
        if (loggerType == 1) logger = new StandartLogger();
        else logger = new ExtendedLoger();
        ToDo startProgram = new ToDo(sc, logger);
        startProgram.startWhatNumber();


    }
}
