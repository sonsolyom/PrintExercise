package com.nagysolyom.container;

import com.nagysolyom.components.Button;
import com.nagysolyom.components.Combo;
import com.nagysolyom.components.Table;

public class Container {

    private String containerStyle = "\"display:flex; flex-wrap:wrap; background-color:coral;\"";

    public void display(){

        Table table = new Table();
        Button button = new Button();
        Combo combo = new Combo();

        System.out.println("<dir style=" +containerStyle+ ">");
        table.printElement();
        button.printElement();
        combo.printElement();
        System.out.println("</dir>");

    }

}
