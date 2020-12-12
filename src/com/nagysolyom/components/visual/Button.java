package com.nagysolyom.components.visual;

public class Button extends ButtonData{

    ButtonData buttonData = new ButtonData();
    private String style = "\"margin:1em; border-radius:0.5em; background-color:lime;\"";

    public Button() {
        setName("<button type=\"button\" style="+style+">" + buttonData.getName() + "</button>");
    }

}