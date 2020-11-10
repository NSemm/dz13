package com.k7.task;

import com.k7.loggers.Logger;

import java.util.Scanner;

public class WhatNumber {
    private Scanner scanner;
    private Logger logger;


    public WhatNumber(Scanner scanner, Logger logger) {
        this.scanner = scanner;
        this.logger = logger;
    }

    public int genRandom() {
        double num = Math.random();
        int numRandom = (int) Math.round(num * (100 - 1) + 1);
        logger.info("numRandom = " + numRandom);
        return numRandom;
    }

    public int firstEnterNumber() {
        System.out.println("Готов?! Поехали! Угадывай целое число от 1 до 100!");
        int numEnter = scanner.nextInt();
        scanner.nextLine();
        return numEnter;
    }

    public void startGame(int numRandom, int numEnter) {
        int countAttempt = 1;
        while (numEnter != numRandom && countAttempt < 6) {
            logger.error("Try " + countAttempt + ", numEnter = " + numEnter);
            if (numEnter > numRandom) System.out.println("Много насыпал! Бери меньше!");
            else System.out.println("Маловато будет! Пробуй ещё!");
            numEnter = scanner.nextInt();
            ++countAttempt;
            scanner.nextLine();
        }
        if (numEnter == numRandom) {
            System.out.println("В точку! Справился за " + countAttempt + " попыток");
            logger.info("Try " + countAttempt + ", numEnter = " + numEnter + ". Victory!");
        } else {
            System.out.println("Всё! Game Over!");
            logger.info("Game over");
        }
    }

    public void viewLog() {
        System.out.println("------------log-----------");
        System.out.println(logger.toString());
    }


}
