package com.k7;

import com.k7.loggers.Logger;
import com.k7.task.WhatNumber;

import java.util.Scanner;

public class ToDo {
    private final Logger logger;
    private final Scanner sc;

    public ToDo(Scanner sc, Logger logger) {
        this.logger = logger;
        this.sc = sc;
    }

    public void startWhatNumber() {
        //Scanner sc = new Scanner(System.in);
        WhatNumber game = new WhatNumber(sc, logger);
        game.startGame(game.genRandom(), game.firstEnterNumber());
        game.viewLog();
    }

}
