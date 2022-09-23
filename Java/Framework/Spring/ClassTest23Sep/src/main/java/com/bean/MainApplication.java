package com.bean;

import Menu.OperationMenu;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        OperationMenu operationMenu = new OperationMenu();
        operationMenu.displaymenu();
    }
}
