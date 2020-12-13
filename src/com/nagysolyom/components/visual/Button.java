package com.nagysolyom.components.visual;

import java.util.Scanner;

public class Button extends ButtonData{

    private Scanner inputButton = new Scanner(System.in);


    private ButtonData buttonData = new ButtonData();

    private String style = "\"margin:1em; border-radius:0.5em; background-color:lime;\"";

    public Button() {

        System.out.print("Please enter the content of the 'will be button': ");
        String inputButtonData = inputButton.nextLine();

        buttonData.setName(inputButtonData);

        setName("<button type=\"button\" style="+style+">" + buttonData.getName() + "</button>");

    }

}