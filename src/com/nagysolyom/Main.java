
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

        //Set the columns and rows of the table
        table1.setTableData("new cell ");
        table1.setTable(4,1);
        //Set the number of the combo options
        combo1.setCombos(4);
        button1.setButtonData("me in main"); //<---
        /*
        * Itt van megint problema.
        * vlmiert nem latja null erteket is ki.
        * ha a button classban csianlok egy setter hivast azt latja es hasznalja
        * ha itt hivom meg akkor a kimenet csak 'null'-t lat, de ha meghivom kulon a getter-t akkor
        * az itteni erteket irja ki :S
        */




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


