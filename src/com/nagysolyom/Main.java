
package com.nagysolyom;

import com.nagysolyom.components.Component;
import com.nagysolyom.components.container.Container;
import com.nagysolyom.components.visual.Button;
import com.nagysolyom.components.visual.Combo;
import com.nagysolyom.components.visual.Table;
import com.nagysolyom.page.Engine;
import com.nagysolyom.page.Page;

public class Main {

    public static void main(String[] args) {

        Engine displayEngine = new Engine();
        Page page = new Page();
        Container container = new Container();
        Table table = new Table();
        Button button = new Button();
        Combo combo = new Combo();

        page.createStart();

        displayEngine.display(container);

        page.createEnd();

    }

}


