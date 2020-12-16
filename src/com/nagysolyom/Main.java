
package com.nagysolyom;

import com.nagysolyom.components.container.Container;
import com.nagysolyom.components.visual.Button;
import com.nagysolyom.components.visual.Combo;
import com.nagysolyom.components.visual.Table;
import com.nagysolyom.page.Engine;
import com.nagysolyom.page.Page;

public class Main {

    public static void main(String[] args) {

        //Instantiate the objects
        Engine displayEngine = new Engine();
        Page page = new Page();
        Container container = new Container();
        Table table1 = new Table();
        Button button1 = new Button();
        Combo combo1 = new Combo();

        //Set the data of the table cells
        table1.setTableData("new cell ");
        //Set the columns and rows of the table
        table1.setTable(4,1);
        //Set the number of the combo options, and its content
        combo1.setCombos(4, "from main");
        //Set the caption of the button
        button1.setButtonData("me in main");

        //Calling the object methods to create HTML markup
        page.createStart();
        container.startContainer();
        displayEngine.display(table1);
        displayEngine.display(button1);
        displayEngine.display(combo1);
        container.endContainer();
        page.createEnd();

    }

}


