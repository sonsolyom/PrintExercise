
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
        Combo combo = new Combo();

        //calling the object methods to create HTML markup
        page.createStart();
        container.startContainer();
        displayEngine.display(table1);
        displayEngine.display(button1);
        displayEngine.display(combo);
        container.endContainer();
        page.createEnd();

    }

}


